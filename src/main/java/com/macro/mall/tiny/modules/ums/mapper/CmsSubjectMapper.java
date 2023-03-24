package com.macro.mall.tiny.modules.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.ums.model.CmsSubject;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.Select;

/**
* @author Administrator
* @description 针对表【cms_subject(专题表)】的数据库操作Mapper
* @createDate 2023-03-22 14:29:23
* @Entity generator.domain.CmsSubject
*/
public interface CmsSubjectMapper extends BaseMapper<CmsSubject> {
}




