/**
 * 
 */
package com.sanda.dev.tsm.biz.dao.impl;



import java.sql.Timestamp;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sanda.dev.tsm.biz.dao.StudentDao;
import com.sanda.dev.tsm.biz.model.Student;



/**
 * @author erwin.wang
 * @Description:
 *       
 * 2018年9月17日 下午3:30:05
 */
public class StudentDaoImplTest {

	StudentDao stuDao = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.stuDao = new StudentDaoImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.clps.sanda.study.java.two.dao.impl.StudentDaoImpl#queryAllStudent()}.
	 */
	@Test
	public void testQueryAllStudent() {
		System.out.println("students size: "+stuDao.queryAllStudent().size());
	}
	
	/**
	 * Test method for {@link com.clps.sanda.study.java.two.dao.impl.StudentDaoImpl#saveStudent(com.clps.sanda.study.java.two.model.Student)}.
	 */
	@Test
	public void testSaveStudent() {
		Student stu = new Student();
		stu.setStudent_id(2);
		stu.setStudent_name("erwin.wang");
		stu.setStudent_address("XXXXX2");
		stu.setStudent_created_name(1);
		stu.setStudent_created_date(new Timestamp(new Date().getTime()));
		stu.setStudent_updated_name(1);
		stu.setStudent_updated_date(new Timestamp(new Date().getTime()));
		this.stuDao.saveStudent(stu);
	}

	/**
	 * Test method for {@link com.clps.sanda.study.java.two.dao.impl.StudentDaoImpl#deleteStudentById(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteStudentById() {
		this.stuDao.deleteStudentById(2);
	}

	/**
	 * Test method for {@link com.clps.sanda.study.java.two.dao.impl.StudentDaoImpl#updateStudent(com.clps.sanda.study.java.two.model.Student)}.
	 */
	@Test
	public void testUpdateStudent() {
		Student stu = new Student();
		stu.setStudent_id(4);
		stu.setStudent_name("bill.wang");
		
		this.stuDao.updateStudent(stu);
	}

}
