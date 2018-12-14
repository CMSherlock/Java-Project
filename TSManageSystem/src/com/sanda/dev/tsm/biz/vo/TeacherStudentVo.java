/**
 * 
 */
package com.sanda.dev.tsm.biz.vo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author erwin.wang
 *
 * 2018年10月15日 下午2:43:06
 */
public class TeacherStudentVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Teacher_id;
	private String Teacher_name;
	private Timestamp Teacher_age;
	private String Teacher_address;
	private String Teacher_mobile;
	private String Teacher_email;
	private int student_id;
	private String student_name;
	private Timestamp student_age;
	
	/**
	 * 
	 */
	public TeacherStudentVo() {
		super();
	}
	/**
	 * @return the teacher_id
	 */
	public int getTeacher_id() {
		return Teacher_id;
	}
	/**
	 * @param teacher_id the teacher_id to set
	 */
	public void setTeacher_id(int teacher_id) {
		Teacher_id = teacher_id;
	}
	/**
	 * @return the teacher_name
	 */
	public String getTeacher_name() {
		return Teacher_name;
	}
	/**
	 * @param teacher_name the teacher_name to set
	 */
	public void setTeacher_name(String teacher_name) {
		Teacher_name = teacher_name;
	}
	/**
	 * @return the teacher_age
	 */
	public Timestamp getTeacher_age() {
		return Teacher_age;
	}
	/**
	 * @param teacher_age the teacher_age to set
	 */
	public void setTeacher_age(Timestamp teacher_age) {
		Teacher_age = teacher_age;
	}
	/**
	 * @return the teacher_address
	 */
	public String getTeacher_address() {
		return Teacher_address;
	}
	/**
	 * @param teacher_address the teacher_address to set
	 */
	public void setTeacher_address(String teacher_address) {
		Teacher_address = teacher_address;
	}
	/**
	 * @return the teacher_mobile
	 */
	public String getTeacher_mobile() {
		return Teacher_mobile;
	}
	/**
	 * @param teacher_mobile the teacher_mobile to set
	 */
	public void setTeacher_mobile(String teacher_mobile) {
		Teacher_mobile = teacher_mobile;
	}
	/**
	 * @return the teacher_email
	 */
	public String getTeacher_email() {
		return Teacher_email;
	}
	/**
	 * @param teacher_email the teacher_email to set
	 */
	public void setTeacher_email(String teacher_email) {
		Teacher_email = teacher_email;
	}
	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}
	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}
	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	/**
	 * @return the student_age
	 */
	public Timestamp getStudent_age() {
		return student_age;
	}
	/**
	 * @param student_age the student_age to set
	 */
	public void setStudent_age(Timestamp student_age) {
		this.student_age = student_age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TeacherStudentVo [Teacher_id=" + Teacher_id + ", Teacher_name=" + Teacher_name + ", Teacher_age="
				+ Teacher_age + ", Teacher_address=" + Teacher_address + ", Teacher_mobile=" + Teacher_mobile
				+ ", Teacher_email=" + Teacher_email + ", student_id=" + student_id + ", student_name=" + student_name
				+ ", student_age=" + student_age + "]";
	}
	
	
	
	
}
