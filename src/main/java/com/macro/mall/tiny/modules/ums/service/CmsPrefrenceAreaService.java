package com.macro.mall.tiny.modules.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.macro.mall.tiny.modules.ums.model.CmsPrefrenceArea;

import java.util.List;

/**
* @author Administrator
* @description 针对表【cms_prefrence_area(优选专区)】的数据库操作Service
* @createDate 2023-03-22 10:39:00
*/
public interface CmsPrefrenceAreaService extends IService<CmsPrefrenceArea> {

     List<CmsPrefrenceArea> listAll();
}
