package com.matrix.eduservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.matrix.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author jingpingxie
 * @since 2023-01-19
 */
public interface EduTeacherService extends IService<EduTeacher> {
    Map<String, Object> getTeacherApiPage(Page<EduTeacher> page);
}
