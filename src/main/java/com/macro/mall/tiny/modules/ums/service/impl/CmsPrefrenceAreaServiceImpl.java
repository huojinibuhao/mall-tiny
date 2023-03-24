package com.macro.mall.tiny.modules.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.macro.mall.tiny.modules.ums.model.CmsPrefrenceArea;
import com.macro.mall.tiny.modules.ums.service.CmsPrefrenceAreaService;
import com.macro.mall.tiny.modules.ums.mapper.CmsPrefrenceAreaMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @description 针对表【cms_prefrence_area(优选专区)】的数据库操作Service实现
 * @createDate 2023-03-22 10:39:00
 */
@Service
public class CmsPrefrenceAreaServiceImpl extends ServiceImpl<CmsPrefrenceAreaMapper, CmsPrefrenceArea>
        implements CmsPrefrenceAreaService {

    @Resource
    private CmsPrefrenceAreaMapper cmsPrefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        List<CmsPrefrenceArea> cmsPrefrenceAreas = cmsPrefrenceAreaMapper.selectList(null);
        return cmsPrefrenceAreas;
    }
}




