/**
 * 
 */
package com.sanda.dev.tsm.biz.service;

import java.util.List;

import com.sanda.dev.tsm.biz.model.Student;
import com.sanda.dev.tsm.biz.vo.TeacherStudentVo;

/**
 * @author erwin.wang
 *
 * 2018年10月15日 下午2:32:48
 */
public interface IStudentService {

	/**
	 * 需要查询某位学员他具有哪些授课的讲师
	 * 将讲师的具体信息展示出来
	 */
	public List<TeacherStudentVo> showTeacherDetailByStudentName(String studentName); 
	
	/**
	 * 查询所有学员
	 */
	public List<Student> showAllStudents();
	
	/**
	 * 通过id查询单个学员
	 * @return
	 */
	public Student QueryStudentById(Integer studentId);
	
	
	/**
	 * 
	 * @param id
	 * @return 
	 */
	public void deleteStudentById(int id);
	
	
	/**
	 * 添加新的一条学生信息
	 * @param stu
	 */
	public void addStudentInfo(Student stu);
	
	/**
	 * 更新单个学生信息
	 * @param stu
	 */
	public void updateStudentInfo(Student stu);
}
