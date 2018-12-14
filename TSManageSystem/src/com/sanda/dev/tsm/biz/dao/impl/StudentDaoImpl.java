/**
 * 
 */
package com.sanda.dev.tsm.biz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sanda.dev.tsm.biz.dao.StudentDao;
import com.sanda.dev.tsm.biz.model.Student;
import com.sanda.dev.tsm.biz.util.db.ConnectDB;




/**
 * @author erwin.wang
 * @Description:
 *       
 * 2018年9月17日 下午2:58:57
 */
public class StudentDaoImpl implements StudentDao{

	private List<Student> studentLists= null;
	
	private static final String SQL_ALL_STUDENTS ="SELECT * FROM STUDENT ORDER BY STUDENT_UPDATED_DATE"; 
	private static final String SQL_A_STUDENT_ID = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";
	private static final String SQL_INSERT_A_STUDENT = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?,?,?,?,?)";
	private static final String SQL_DELETE_STUDENT_ID = "DELETE FROM STUDENT WHERE STUDENT_ID = ?";
	private static final String SQL_UPDATE_A_STUDENT = "UPDATE STUDENT SET STUDENT_NAME=? , STUDENT_AGE=? , "
							+ "STUDENT_ADDRESS=? , STUDENT_MOBILE=? , STUDENT_EMAIL=? , STUDENT_CREATED_NAME=? , "
							+ "STUDENT_CREATED_DATE=? , STUDENT_UPDATED_NAME=? , STUDENT_UPDATED_DATE=? "
							+ "WHERE STUDENT_ID=?";					//!!!!!!!!生气！感情这的字符串不需要加单引号！！！！！！
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs  = null;
	private Student stu = null;
	private boolean flag = false;
	
	/**
	 * 
	 */
	public StudentDaoImpl() {
		this.studentLists = new ArrayList<>();
		this.conn = ConnectDB.getConnectDB();
	}

	public List<Student> queryAllStudent() {
		this.studentLists.clear();			//每次查询之前先清空当前列表
		try {
			this.pstmt = conn.prepareStatement(SQL_ALL_STUDENTS);
			this.rs =this.pstmt.executeQuery();
			while(rs.next()){
				this.stu = new Student();
				stu.setStudent_id(rs.getInt("student_id"));
				stu.setStudent_name(rs.getString("student_name"));
				stu.setStudent_age(rs.getTimestamp("student_age"));
				stu.setStudent_address(rs.getString("student_address"));
				stu.setStudent_mobile(rs.getString("student_Mobile"));
				stu.setStudent_created_date(rs.getTimestamp("student_created_date"));
				stu.setStudent_created_name(rs.getInt("student_created_name"));
				this.studentLists.add(stu);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return studentLists;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.study.java.two.dao.StudentDao#queryStudentById(java.lang.Integer)
	 */
	@Override
	public Student queryStudentById(Integer studentId) {
		stu = new Student();						//清空缓存
		try {
			this.pstmt = conn.prepareStatement(SQL_A_STUDENT_ID);
			pstmt.setInt(1, studentId);
			this.rs =this.pstmt.executeQuery();
			while(rs.next()){
				this.stu = new Student();
				stu.setStudent_id(rs.getInt("student_id"));
				stu.setStudent_name(rs.getString("student_name"));
				stu.setStudent_age(rs.getTimestamp("student_age"));
				stu.setStudent_address(rs.getString("student_address"));
				stu.setStudent_mobile(rs.getString("student_Mobile"));
				stu.setStudent_email(rs.getString("student_Email"));
				stu.setStudent_updated_date(rs.getTimestamp("student_updated_date"));
				stu.setStudent_updated_name(rs.getInt("student_updated_name"));
				stu.setStudent_created_date(rs.getTimestamp("student_created_date"));
				stu.setStudent_created_name(rs.getInt("student_created_name"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return stu;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.study.java.two.dao.StudentDao#saveStudent(com.clps.sanda.study.java.two.model.Student)
	 */
	@Override
	public boolean saveStudent(Student stu) {
		try {
			this.pstmt = conn.prepareStatement(SQL_INSERT_A_STUDENT);
			pstmt.setInt(1, stu.getStudent_id());
			pstmt.setString(2, stu.getStudent_name());
			pstmt.setTimestamp(3, stu.getStudent_age());
			pstmt.setString(4, stu.getStudent_address());
			pstmt.setString(5, stu.getStudent_mobile());
			pstmt.setString(6, stu.getStudent_email());
			pstmt.setInt(7, stu.getStudent_created_name());
			pstmt.setTimestamp(8, stu.getStudent_created_date());
			pstmt.setInt(9, stu.getStudent_updated_name());
			pstmt.setTimestamp(10, stu.getStudent_updated_date());
			this.flag=this.pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return this.flag;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.study.java.two.dao.StudentDao#deleteStudentById(java.lang.Integer)
	 */
	@Override
	public boolean deleteStudentById(Integer studentId) {
		try {
			this.pstmt = conn.prepareStatement(SQL_DELETE_STUDENT_ID);
			pstmt.setInt(1, studentId);
			this.flag =this.pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return this.flag;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.study.java.two.dao.StudentDao#updateStudent(com.clps.sanda.study.java.two.model.Student)
	 */
	@Override
	public boolean updateStudent(Student student) {
		try {
			this.pstmt = conn.prepareStatement(SQL_UPDATE_A_STUDENT);
			pstmt.setString(1, student.getStudent_name());
			pstmt.setTimestamp(2, student.getStudent_age());
			pstmt.setString(3, student.getStudent_address());
			pstmt.setString(4, student.getStudent_mobile());
			pstmt.setString(5, student.getStudent_email());
			pstmt.setInt(6, student.getStudent_created_name());
			pstmt.setTimestamp(7, student.getStudent_created_date());
			pstmt.setInt(8, student.getStudent_updated_name());
			pstmt.setTimestamp(9, student.getStudent_updated_date());
			pstmt.setInt(10, student.getStudent_id());
			this.flag=this.pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return this.flag;
	}

	
}
