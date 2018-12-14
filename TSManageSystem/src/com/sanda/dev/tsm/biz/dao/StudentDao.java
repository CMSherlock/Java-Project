/**
 * 
 */
package com.sanda.dev.tsm.biz.dao;

import java.util.List;

import com.sanda.dev.tsm.biz.model.Student;



/**
 * @author erwin.wang
 * @Description:
 *       
 * 2018年9月17日 下午2:57:18
 */
public interface StudentDao {

	/**
	 * @Description:
	 * 				
	 * @return List<Student>
	 */
	public List<Student> queryAllStudent();
	
	/**
	 * 
	 * @Description:
	 *
	 * @param studentId
	 * @return Student
	 */
	public Student queryStudentById(Integer studentId);
	
	
	/**
	 * @Description:
	 *  			here is a save a student method
	 * @param student
	 * @return boolean false isn't save successfully!
	 * 				   true is save successfully!
	 */
	public boolean saveStudent(Student student);
	
	/**
	 * 
	 * @Description:
	 *
	 * @param studentId
	 * @return boolean false isn't delete successfully!
	 * 				   true is delete successfully!
	 */
	public boolean deleteStudentById(Integer studentId);
	
	/**
	 * 
	 * @Description:
	 *
	 * @param student
	 * @return boolean false isn't update successfully!
	 * 				   true is update successfully!
	 */
	public boolean updateStudent(Student student);
}
