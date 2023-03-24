package com.macro.mall.tiny.modules.ums.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.macro.mall.tiny.modules.ums.model.CmsSubject;

import java.util.List;

/**
* @author Administrator
* @description 针对表【cms_subject(专题表)】的数据库操作Service
* @createDate 2023-03-22 14:29:23
*/
public interface CmsSubjectService extends IService<CmsSubject> {

    List<CmsSubject> listAll();
}

