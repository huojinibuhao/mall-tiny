package com.macro.mall.tiny.modules.ums.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.macro.mall.tiny.modules.ums.model.OmsCompanyAddress;

import java.util.List;

/**
* @author Administrator
* @description 针对表【oms_company_address(公司收发货地址表)】的数据库操作Service
* @createDate 2023-03-24 21:30:53
*/
public interface OmsCompanyAddressService extends IService<OmsCompanyAddress> {

     List<OmsCompanyAddress> getAddress();
}
