package com.matrix.eduservice.service;

import com.matrix.eduservice.entity.EduSubject;
import com.matrix.eduservice.entity.vo.OneSubjectVo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author testjava
 * @since 2021-03-09
 */
public interface EduSubjectService extends IService<EduSubject> {

    void addSubject(MultipartFile file, EduSubjectService subjectService);

    List<OneSubjectVo> getAllSubject();
}
