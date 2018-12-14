package com.sanda.dev.tsm.biz.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Teacher implements Serializable {

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
	private int Teacher_created_name;
	private Timestamp Teacher_created_date;
	private int Teacher_updated_name;
	private Timestamp Teacher_updated_date;	
		
	@Override
	public String toString() {
		return "Teacher [Teacher_id=" + Teacher_id + ", Teacher_name=" + Teacher_name + ", Teacher_age=" + Teacher_age
				+ ", Teacher_address=" + Teacher_address + ", Teacher_mobile=" + Teacher_mobile + ", Teacher_email="
				+ Teacher_email + ", Teacher_created_name=" + Teacher_created_name + ", Teacher_created_date="
				+ Teacher_created_date + ", Teacher_updated_name=" + Teacher_updated_name
				+ ", Teacher_created_updated_date=" + Teacher_updated_date + "]";
	}
	
	
	
	//zero param
	public Teacher() {
		super();
	}




	//one param
	public Teacher(int teacher_id) {
		super();
		Teacher_id = teacher_id;
	}
	
	
	
	//all param
	public Teacher(int teacher_id, String teacher_name, Timestamp teacher_age, String teacher_address,
			String teacher_mobile, String teacher_email, int teacher_created_name, Timestamp teacher_created_date,
			int teacher_updated_name, Timestamp teacher_updated_date) {
		super();
		Teacher_id = teacher_id;
		Teacher_name = teacher_name;
		Teacher_age = teacher_age;
		Teacher_address = teacher_address;
		Teacher_mobile = teacher_mobile;
		Teacher_email = teacher_email;
		Teacher_created_name = teacher_created_name;
		Teacher_created_date = teacher_created_date;
		Teacher_updated_name = teacher_updated_name;
		Teacher_updated_date = teacher_updated_date;
	}
	public int getTeacher_id() {
		return Teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		Teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return Teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		Teacher_name = teacher_name;
	}
	public Timestamp getTeacher_age() {
		return Teacher_age;
	}
	public void setTeacher_age(Timestamp teacher_age) {
		Teacher_age = teacher_age;
	}
	public String getTeacher_address() {
		return Teacher_address;
	}
	public void setTeacher_address(String teacher_address) {
		Teacher_address = teacher_address;
	}
	public String getTeacher_mobile() {
		return Teacher_mobile;
	}
	public void setTeacher_mobile(String teacher_mobile) {
		Teacher_mobile = teacher_mobile;
	}
	public String getTeacher_email() {
		return Teacher_email;
	}
	public void setTeacher_email(String teacher_email) {
		Teacher_email = teacher_email;
	}
	public int getTeacher_created_name() {
		return Teacher_created_name;
	}
	public void setTeacher_created_name(int teacher_created_name) {
		Teacher_created_name = teacher_created_name;
	}
	public Timestamp getTeacher_created_date() {
		return Teacher_created_date;
	}
	public void setTeacher_created_date(Timestamp teacher_created_date) {
		Teacher_created_date = teacher_created_date;
	}
	public int getTeacher_updated_name() {
		return Teacher_updated_name;
	}
	public void setTeacher_updated_name(int teacher_updated_name) {
		Teacher_updated_name = teacher_updated_name;
	}
	public Timestamp getTeacher_updated_date() {
		return Teacher_updated_date;
	}
	public void setTeacher_updated_date(Timestamp teacher_updated_date) {
		Teacher_updated_date = teacher_updated_date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	
	
}
