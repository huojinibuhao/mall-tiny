package com.macro.mall.tiny.modules.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.macro.mall.tiny.modules.ums.mapper.OmsCompanyAddressMapper;
import com.macro.mall.tiny.modules.ums.model.CmsSubject;
import com.macro.mall.tiny.modules.ums.model.OmsCompanyAddress;
import com.macro.mall.tiny.modules.ums.service.OmsCompanyAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @description 针对表【oms_company_address(公司收发货地址表)】的数据库操作Service实现
 * @createDate 2023-03-24 21:30:53
 */
@Service
public class OmsCompanyAddressServiceImpl extends ServiceImpl<OmsCompanyAddressMapper, OmsCompanyAddress>
        implements OmsCompanyAddressService {

    @Resource
    private OmsCompanyAddressMapper companyAddressMapper;

    @Override
    public List<OmsCompanyAddress> getAddress() {

        List<OmsCompanyAddress> companyAddresses = companyAddressMapper.selectList(null);
        return companyAddresses;
    }
}




