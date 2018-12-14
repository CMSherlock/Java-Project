/**
 * @author Nick Lee
 * 
 * 2018年11月22日
 */
package com.sanda.dev.tsm.biz.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sanda.dev.tsm.biz.dao.TeacherDao;
import com.sanda.dev.tsm.biz.dao.impl.TeacherDaoImpl;
import com.sanda.dev.tsm.biz.model.Teacher;
import com.sanda.dev.tsm.biz.service.ITeacherService;

/**
 * @author Nick/李路遥
 *
 * 2018年11月22日  下午9:40:13
 */
public class TeacherServiceImpl implements ITeacherService{

	private List<Teacher> listTeacher = new ArrayList<>();
	private TeacherDao teacherDao =new TeacherDaoImpl();
	
	
	
	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.ITeacherService#ShowAllTeachers()
	 */
	@Override
	public List<Teacher> showAllTeachers() {
		// TODO Auto-generated method stub
		listTeacher = this.teacherDao.queryAllTeacher();
		return listTeacher;
	}



	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.ITeacherService#deleteTeacherById()
	 */
	@Override
	public void deleteTeacherById(int teacherId) {
		// TODO Auto-generated method stub
		this.teacherDao.deleteTeacherById(teacherId);
	}



	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.ITeacherService#QueryTeacherById(java.lang.Integer)
	 */
	@Override
	public Teacher QueryTeacherById(Integer teacherId) {
		return this.teacherDao.queryTeacherById(teacherId);
	}



	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.ITeacherService#addTeacherInfo(com.sanda.dev.tsm.biz.model.Teacher)
	 */
	@Override
	public void addTeacherInfo(Teacher tea) {
		// TODO Auto-generated method stub
		this.teacherDao.saveTeacher(tea);
	}



	/* (non-Javadoc)
	 * @see com.sanda.dev.tsm.biz.service.ITeacherService#updateTeacherInfo(com.sanda.dev.tsm.biz.model.Teacher)
	 */
	@Override
	public void updateTeacherInfo(Teacher tea) {
		// TODO Auto-generated method stub
		this.teacherDao.updateTeacher(tea);
	}
	
	
}
