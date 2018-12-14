/**
 * 
 */
package com.sanda.dev.tsm.biz.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sanda.dev.tsm.biz.dao.StudentDao;
import com.sanda.dev.tsm.biz.dao.impl.StudentDaoImpl;
import com.sanda.dev.tsm.biz.model.Student;
import com.sanda.dev.tsm.biz.service.IStudentService;
import com.sanda.dev.tsm.biz.vo.TeacherStudentVo;

/**
 * @author erwin.wang
 *
 * 2018年10月15日 下午2:48:42
 */
public class StudentServiceImpl implements IStudentService{

	private List<Student> listStudent = new ArrayList<>();
	private StudentDao studentDao =new  StudentDaoImpl();
	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.IStudentService#showTeacherDetailByStudentName(java.lang.String)
	 */
	@Override
	public List<TeacherStudentVo> showTeacherDetailByStudentName(String studentName) {
		//StudentDao 
		//TeacherDao
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.IStudentService#showAllStudents()
	 */
	public List<Student> showAllStudents(){
		 listStudent = this.studentDao.queryAllStudent();
		 return listStudent;
	}

	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.IStudentService#deleteStudentById(int)
	 */
	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		this.studentDao.deleteStudentById(id);							//查错操作已经在studentDaoImpl中实现
	}

	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.IStudentService#QueryStudentById()
	 */
	@Override
	public Student QueryStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return this.studentDao.queryStudentById(studentId);
	}

	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.IStudentService#addStudentInfo(com.sanda.dev.tsm.biz.model.Student)
	 */
	@Override
	public void addStudentInfo(Student stu) {
		this.studentDao.saveStudent(stu);						//查错操作已经在studentDaoImpl中实现
	}

	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.IStudentService#updateStudentInfo(com.sanda.dev.tsm.biz.model.Student)
	 */
	@Override
	public void updateStudentInfo(Student stu) {
		// TODO Auto-generated method stub
		this.studentDao.updateStudent(stu);
	}

	
	
}
