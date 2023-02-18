package com.matrix.eduservice.mapper;
/**
 * @author Jingping.Xie
 * @date 2023/1/26 10:40
 */

import com.matrix.eduservice.entity.vo.CoursePublishVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @projectName: max_kspring
 * @package: com.matrix.eduservice.mapper
 * @className: EduCourseMapperTest
 * @author: jingpingxie
 * @description: TODO
 * @date: 2023/1/26 10:40
 * @version: 1.0
 */
@SpringBootTest
public class EduCourseMapperTest {
    @Autowired
    private EduCourseMapper eduCourseMapper;

    @Test
    public void getCoursePublishById() {
        CoursePublishVo coursePublishVo = eduCourseMapper.getCoursePublishById("18");
        System.out.println(coursePublishVo);
    }
}
