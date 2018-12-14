/**
 * 
 */
package com.sanda.dev.tsm.biz.service;

import java.util.List;
import com.sanda.dev.tsm.biz.model.Teacher;

/**
 * @author erwin.wang
 *
 * 2018��10��15�� ����3:25:09
 */
public interface ITeacherService {

	/**
	 * ĳλ��ʦ���ڽ�����ЩѧԱ����չʾѧԱ��Ϣ
	 */
	
	/**
	 * �г����н�ʦ��Ϣ
	 */
	public List<Teacher> showAllTeachers();
	
	/**
	 * ͨ��id��ѯ������ʦ
	 * @param teacherId
	 * @return
	 */
	public Teacher QueryTeacherById(Integer teacherId);
	
	
	/**
	 * ����id��ɾ����ʦ��Ϣ
	 */
	public void deleteTeacherById(int teacherId);
	
	/**
	 * ����µĽ�ʦ��Ϣ
	 * @param tea
	 */
	public void addTeacherInfo(Teacher tea);
	
	/**
	 * ���½�ʦ��Ϣ
	 * @param tea
	 */
	public void updateTeacherInfo(Teacher tea);
}
