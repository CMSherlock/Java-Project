/**
 * 
 */
package com.sanda.dev.tsm.biz.dao;

import java.util.List;

import com.sanda.dev.tsm.biz.model.Teacher;



//import com.clps.sanda.study.java.two.model.Teacher;

/**
 * @author erwin.wang
 * @param <Teacher>
 * @Description:
 *       
 * 2018年9月17日 下午2:57:18
 */
public interface TeacherDao {// TeacherDao<Teacher>

	/**
	 * @Description:
	 * 				
	 * @return List<Teacher>
	 */
	public List<Teacher> queryAllTeacher();
	
	/**
	 * 
	 * @Description:
	 *
	 * @param TeacherId
	 * @return Teacher
	 */
	public Teacher queryTeacherById(Integer TeacherId);
	
	
	/**
	 * @Description:
	 *  			here is a save a Teacher method
	 * @param Teacher
	 * @return boolean false isn't save successfully!
	 * 				   true is save successfully!
	 */
	public boolean saveTeacher(Teacher Teacher);
	
	/**
	 * 
	 * @Description:
	 *
	 * @param TeacherId
	 * @return boolean false isn't delete successfully!
	 * 				   true is delete successfully!
	 */
	public boolean deleteTeacherById(Integer TeacherId);
	
	/**
	 * 
	 * @Description:
	 *
	 * @param Teacher
	 * @return boolean false isn't update successfully!
	 * 				   true is update successfully!
	 */
	public boolean updateTeacher(Teacher Teacher);
}
