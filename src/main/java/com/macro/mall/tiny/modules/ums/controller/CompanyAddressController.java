package com.macro.mall.tiny.modules.ums.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.ums.model.OmsCompanyAddress;
import com.macro.mall.tiny.modules.ums.service.OmsCompanyAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName CompanyAddressController
 * @Description 获取所有收获地址
 * @Author lr
 * @Date 2023/3/24 21:34
 * @Version 1.0
 */
@Controller
@Api(tags = "CompanyAddressController")
@Tag(name = "CompanyAddressController", description = "获取所有收获地址")
@RequestMapping("/companyAddress")
public class CompanyAddressController {

    @Autowired
    private OmsCompanyAddressService companyAddressService;


    @ApiOperation("获取所有收获地址")
    @GetMapping("/getAddress")
    @ResponseBody
    public CommonResult<List<OmsCompanyAddress>> getAddress() {

        List<OmsCompanyAddress> omsCompanyAddresses = companyAddressService.getAddress();
        return CommonResult.success(omsCompanyAddresses);
    }


}
