/**
 * 
 */
package com.sanda.dev.tsm.biz.model;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * @author erwin.wang
 * @Description:
 * 
 *               2018年9月17日 下午2:53:34
 */
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1993182680934886640L;
	private int student_id;
	private String student_name;
	private Timestamp student_age;
	private String student_address;
	private String student_mobile;
	private String student_email;
	private Integer student_created_name;
	private Timestamp student_created_date;
	private Integer student_updated_name;
	private Timestamp student_updated_date;

	/**
	 * 
	 */
	public Student() {
		super();
	}

	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id
	 *            the student_id to set
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
	 * @param student_name
	 *            the student_name to set
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
	 * @param student_age
	 *            the student_age to set
	 */
	public void setStudent_age(Timestamp student_age) {
		this.student_age = student_age;
	}

	/**
	 * @return the student_address
	 */
	public String getStudent_address() {
		return student_address;
	}

	/**
	 * @param student_address
	 *            the student_address to set
	 */
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	/**
	 * @return the student_mobile
	 */
	public String getStudent_mobile() {
		return student_mobile;
	}

	/**
	 * @param student_mobile
	 *            the student_mobile to set
	 */
	public void setStudent_mobile(String student_mobile) {
		this.student_mobile = student_mobile;
	}

	/**
	 * @return the student_email
	 */
	public String getStudent_email() {
		return student_email;
	}

	/**
	 * @param student_email
	 *            the student_email to set
	 */
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	/**
	 * @return the student_created_name
	 */
	public Integer getStudent_created_name() {
		return student_created_name;
	}

	/**
	 * @param student_created_name
	 *            the student_created_name to set
	 */
	public void setStudent_created_name(Integer student_created_name) {
		this.student_created_name = student_created_name;
	}

	/**
	 * @return the student_created_date
	 */
	public Timestamp getStudent_created_date() {
		return student_created_date;
	}

	/**
	 * @param student_created_date
	 *            the student_created_date to set
	 */
	public void setStudent_created_date(Timestamp student_created_date) {
		this.student_created_date = student_created_date;
	}

	/**
	 * @return the student_updated_name
	 */
	public Integer getStudent_updated_name() {
		return student_updated_name;
	}

	/**
	 * @param student_updated_name
	 *            the student_updated_name to set
	 */
	public void setStudent_updated_name(Integer student_updated_name) {
		this.student_updated_name = student_updated_name;
	}

	/**
	 * @return the student_updated_date
	 */
	public Timestamp getStudent_updated_date() {
		return student_updated_date;
	}

	/**
	 * @param student_updated_date
	 *            the student_updated_date to set
	 */
	public void setStudent_updated_date(Timestamp student_updated_date) {
		this.student_updated_date = student_updated_date;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_age=" + student_age
				+ ", student_address=" + student_address + ", student_mobile=" + student_mobile + ", student_email="
				+ student_email + ", student_created_name=" + student_created_name + ", student_created_date="
				+ student_created_date + ", student_updated_name=" + student_updated_name + ", student_updated_date="
				+ student_updated_date + "]";
	}

}
