package com.macro.mall.tiny.modules.ums.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.ums.mapper.CmsSubjectMapper;
import com.macro.mall.tiny.modules.ums.model.CmsSubject;
import com.macro.mall.tiny.modules.ums.service.CmsSubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CmsSubjectController
 * @Description 商品专题管理
 * @Author lr
 * @Date 2023/3/22 14:35
 * @Version 1.0
 */
@Controller
@Api(tags = "CmsSubjectController")
@Tag(name = "CmsSubjectController", description = "商品专题管理")
@RequestMapping("/subject")
public class CmsSubjectController {

    @Autowired
    private CmsSubjectService cmsSubjectService;

    @Resource
    private CmsSubjectMapper cmsSubjectMapper;

    @ApiOperation("获取全部商品主题")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CmsSubject>> listAll() {
        List<CmsSubject> subjectList = cmsSubjectService.listAll();
        return CommonResult.success(subjectList);
    }

    @ApiOperation("根据专题名称分页获取商品专题")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<CmsSubject>> list(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        Page<CmsSubject> page = new Page<>(pageNum, pageSize);
        QueryWrapper<CmsSubject> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(keyword)) {
            queryWrapper.like("title", keyword);
        }
        Page<CmsSubject> subjectPage = cmsSubjectMapper.selectPage(page, queryWrapper);
        return CommonResult.success(CommonPage.restPage(subjectPage));
    }


}
