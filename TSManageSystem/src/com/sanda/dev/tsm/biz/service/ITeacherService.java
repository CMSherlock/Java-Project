/**
 * 
 */
package com.sanda.dev.tsm.biz.service;

import java.util.List;
import com.sanda.dev.tsm.biz.model.Teacher;

/**
 * @author erwin.wang
 *
 * 2018年10月15日 下午3:25:09
 */
public interface ITeacherService {

	/**
	 * 某位老师正在教授哪些学员，并展示学员信息
	 */
	
	/**
	 * 列出所有教师信息
	 */
	public List<Teacher> showAllTeachers();
	
	/**
	 * 通过id查询单个教师
	 * @param teacherId
	 * @return
	 */
	public Teacher QueryTeacherById(Integer teacherId);
	
	
	/**
	 * 根据id号删除教师信息
	 */
	public void deleteTeacherById(int teacherId);
	
	/**
	 * 添加新的教师信息
	 * @param tea
	 */
	public void addTeacherInfo(Teacher tea);
	
	/**
	 * 更新教师信息
	 * @param tea
	 */
	public void updateTeacherInfo(Teacher tea);
}
