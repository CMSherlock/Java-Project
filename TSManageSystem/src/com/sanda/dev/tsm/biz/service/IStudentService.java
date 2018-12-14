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
 * 2018��10��15�� ����2:32:48
 */
public interface IStudentService {

	/**
	 * ��Ҫ��ѯĳλѧԱ��������Щ�ڿεĽ�ʦ
	 * ����ʦ�ľ�����Ϣչʾ����
	 */
	public List<TeacherStudentVo> showTeacherDetailByStudentName(String studentName); 
	
	/**
	 * ��ѯ����ѧԱ
	 */
	public List<Student> showAllStudents();
	
	/**
	 * ͨ��id��ѯ����ѧԱ
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
	 * ����µ�һ��ѧ����Ϣ
	 * @param stu
	 */
	public void addStudentInfo(Student stu);
	
	/**
	 * ���µ���ѧ����Ϣ
	 * @param stu
	 */
	public void updateStudentInfo(Student stu);
}
