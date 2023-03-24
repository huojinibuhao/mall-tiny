package com.macro.mall.tiny.modules.ums.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.common.utils.MinioUtil;
import com.macro.mall.tiny.config.MinioConfig;
import io.minio.messages.Bucket;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @ClassName MinioController
 * @Description TODO
 * @Author lr
 * @Date 2023/3/23 21:55
 * @Version 1.0
 */
@Controller
@Api("MinioController")
@Tag(name = "MinioController", description = "Minio对象存储管理")
@RequestMapping("/minio")
public class MinioController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MinioController.class);

    @Autowired
    private MinioUtil minioUtil;
    @Autowired
    private MinioConfig prop;

    @ApiOperation(value = "查看存储bucket是否存在")
    @GetMapping("/bucketExists")
    @ResponseBody
    public CommonResult bucketExists(String bucketName) {
        return CommonResult.success(minioUtil.bucketExists(bucketName));
    }

    @ApiOperation(value = "创建存储bucket")
    @GetMapping("/makeBucket")
    @ResponseBody
    public CommonResult makeBucket(String bucketName) {
        minioUtil.makeBucket(bucketName);
        return CommonResult.success();
    }

    @ApiOperation(value = "删除存储bucket")
    @GetMapping("/removeBucket")
    @ResponseBody
    public CommonResult removeBucket(String bucketName) {
        minioUtil.removeBucket(bucketName);
        return CommonResult.success();
    }

    @ApiOperation(value = "获取全部bucket")
    @GetMapping("/getAllBuckets")
    @ResponseBody
    public CommonResult<List<Bucket>> getAllBuckets() {
        List<Bucket> allBuckets = minioUtil.getAllBuckets();
        return CommonResult.success(allBuckets);
    }

    @ApiOperation(value = "文件上传返回url")
    @RequestMapping(value = "upload",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> upload(@RequestParam(value = "file") MultipartFile file) {
        String objectName = minioUtil.upload(file);
        if (null != objectName) {
            return CommonResult.success(prop.getEndpoint() + "/" + prop.getBucketName() + "/" + objectName);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "图片/视频预览")
    @GetMapping("/preview")
    @ResponseBody
    public CommonResult preview(@RequestParam("fileName") String fileName) {
        return CommonResult.success(minioUtil.preview(fileName));
    }

    @ApiOperation(value = "文件下载")
    @GetMapping("/download")
    @ResponseBody
    public CommonResult download(@RequestParam("fileName") String fileName, HttpServletResponse res) {
        minioUtil.download(fileName,res);
        return CommonResult.success();
    }

    @ApiOperation(value = "删除文件", notes = "根据url地址删除文件")
    @PostMapping("/delete")
    @ResponseBody
    public CommonResult remove(String url) {
        String objName = url.substring(url.lastIndexOf(prop.getBucketName()+"/") + prop.getBucketName().length()+1);
        minioUtil.remove(objName);
        return CommonResult.success();
    }

}
