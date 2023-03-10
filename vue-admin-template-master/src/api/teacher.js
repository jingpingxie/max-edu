import request from '@/utils/request'

export default {
  // 带条件分页查询讲师列表
  getTeacherPageVo(current, limit, teacherQuery) {
    return request({
      url: `/eduservice/eduteacher/getTeacherPageVo/${current}/${limit}`,
      method: 'post',
      data: teacherQuery // 转化json传递
    })
  },
  // 根据id删除讲师
  delTeacher(id) {
    return request({
      url: `/eduservice/eduteacher/${id}`,
      method: 'delete'
    })
  },
  // 添加讲师
  addTeacher(eduTeacher) {
    return request({
      url: `/eduservice/eduteacher/addTeacher`,
      method: 'post',
      data: eduTeacher // 转化json传递
    })
  },
  // 根据id查询讲师
  getTeacherById(id) {
    return request({
      url: `/eduservice/eduteacher/getTeacherById/${id}`,
      method: 'get'
    })
  },
  // 修改讲师
  updateTeacher(eduTeacher) {
    return request({
      url: `/eduservice/eduteacher/updateTeacher`,
      method: 'post',
      data: eduTeacher // 转化json传递
    })
  },
  // 所有讲师列表
  getAllTeacher() {
    return request({
      url: `/eduservice/eduteacher`,
      method: 'get'
    })
  }

}
