package com.macro.mall.tiny.modules.ums.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.macro.mall.tiny.modules.ums.mapper.CmsSubjectMapper;
import com.macro.mall.tiny.modules.ums.model.CmsSubject;
import com.macro.mall.tiny.modules.ums.service.CmsSubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @description 针对表【cms_subject(专题表)】的数据库操作Service实现
 * @createDate 2023-03-22 14:29:23
 */
@Service
public class CmsSubjectServiceImpl extends ServiceImpl<CmsSubjectMapper, CmsSubject> implements CmsSubjectService {

    @Resource
    private CmsSubjectMapper cmsSubjectMapper;

    @Override
    public List<CmsSubject> listAll() {
        List<CmsSubject> cmsSubjects = cmsSubjectMapper.selectList(null);
        return cmsSubjects;
    }
}




