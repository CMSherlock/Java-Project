/**
 * 
 */
package com.sanda.dev.tsm.biz.dao.impl;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sanda.dev.tsm.biz.dao.TeacherDao;
import com.sanda.dev.tsm.biz.model.Teacher;

/**
 * @author erwin.wang
 *
 * 2018年9月29日 上午8:52:19
 */
public class TeacherDaoImplTest {

	private TeacherDao teaDao = null;
	
	/**
	 * @Description:
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.teaDao = new TeacherDaoImpl();
	}

	/**
	 * @Description:
	 *
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link imp.imp.teady.java.two.dao.impl.TeacherDaoImpl#queryAllTeacher()}.
	 */
	@Test
	public void testQueryAllTeacher() {
		System.out.println(teaDao.queryAllTeacher().size());
	}

	/**
	 * Test method for {@link imp.imp.teady.java.two.dao.impl.TeacherDaoImpl#queryTeacherById(java.lang.Integer)}.
	 */
	@Test
	public void testQueryTeacherById() {
		System.out.println(this.teaDao.queryTeacherById(1));
		
	}

	/**
	 * Test method for {@link imp.imp.teady.java.two.dao.impl.TeacherDaoImpl#saveTeacher(com.clps.com.clps.sanda.study.java.two.dao.teady.java.two.model.Teacher)}.
	 */
	@Test
	public void testSaveTeacher() {
		Teacher tea = new Teacher();
		tea.setTeacher_id(4);
		this.teaDao.saveTeacher(tea);
	}

	/**
	 * Test method for {@link imp.imp.teady.java.two.dao.impl.TeacherDaoImpl#deleteTeacherById(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteTeacherById() {
		this.teaDao.deleteTeacherById(2);
	}

	/**
	 * Test method for {@link imp.imp.teady.java.two.dao.impl.TeacherDaoImpl#updateTeacher(com.clps.com.clps.sanda.study.java.two.dao.teady.java.two.model.Teacher)}.
	 */
	@Test
	public void teteapdateTeacher() {
		Teacher tea = new Teacher();
		tea.setTeacher_id(4);
		tea.setTeacher_name("bill.wang");
		this.teaDao.updateTeacher(tea);
	}

}
