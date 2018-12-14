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

import com.sanda.dev.tsm.biz.dao.TeacherDao;
import com.sanda.dev.tsm.biz.model.Teacher;
import com.sanda.dev.tsm.biz.util.db.ConnectDB;


/**s
 * @author erwin.wang
 * @Description:
 *       
 * 2018年9月17日 下午2:58:57
 */
public class TeacherDaoImpl implements TeacherDao{

	private List<Teacher> TeacherLists= null;
	
	private static final String SQL_ALL_TEACHERS ="SELECT * FROM TEACHER ORDER BY TEACHER_UPDATED_DATE"; 
	private static final String SQL_A_TEACHER_ID = "SELECT * FROM TEACHER WHERE TEACHER_ID = ?";
	private static final String SQL_INSERT_A_TEACHER = "INSERT INTO TEACHER VALUES(?,?,?,?,?,?,?,?,?,?)";
	private static final String SQL_DELETE_TEACHER_ID = "DELETE FROM TEACHER WHERE TEACHER_ID = ?";
	private static final String SQL_UPDATE_A_TEACHER = "UPDATE TEACHER SET TEACHER_NAME=? , TEACHER_AGE=? , "
			+ "TEACHER_ADDRESS=? , TEACHER_MOBILE=? , TEACHER_EMAIL=? , TEACHER_CREATED_NAME=? , "
			+ "TEACHER_CREATED_DATE=? , TEACHER_UPDATED_NAME=? , TEACHER_UPDATED_DATE=? "
			+ "WHERE TEACHER_ID=?";;
	
	

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs  = null;
	private Teacher tea = null;
	private boolean flag = false;
	
	/**
	 * 
	 */
	public TeacherDaoImpl() {
		this.TeacherLists = new ArrayList<>();
		this.conn = ConnectDB.getConnectDB();
	}

	public List<Teacher> queryAllTeacher() {
		TeacherLists.clear();             //每次查询前先清空列表
		try {
			this.pstmt = conn.prepareStatement(SQL_ALL_TEACHERS);
			this.rs =this.pstmt.executeQuery();
			while(rs.next()){
				this.tea = new Teacher();
				tea.setTeacher_id(rs.getInt("Teacher_id"));
				tea.setTeacher_name(rs.getString("Teacher_name"));
				tea.setTeacher_age(rs.getTimestamp("Teacher_age"));
				tea.setTeacher_address(rs.getString("Teacher_address"));
				tea.setTeacher_mobile(rs.getString("Teacher_Mobile"));
				tea.setTeacher_created_date(rs.getTimestamp("Teacher_created_date"));
				tea.setTeacher_created_name(rs.getInt("Teacher_created_name"));
				this.TeacherLists.add(tea);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return TeacherLists;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.teady.java.two.dao.TeacherDao#queryTeacherById(java.lang.Integer)
	 */
	@Override
	public Teacher queryTeacherById(Integer TeacherId) {
		tea = new Teacher();
		try {
			this.pstmt = conn.prepareStatement(SQL_A_TEACHER_ID);
			pstmt.setInt(1, TeacherId);
			this.rs =this.pstmt.executeQuery();
			while(rs.next()){
				this.tea = new Teacher();
				tea.setTeacher_id(rs.getInt("Teacher_id"));
				tea.setTeacher_name(rs.getString("Teacher_name"));
				tea.setTeacher_age(rs.getTimestamp("Teacher_age"));
				tea.setTeacher_address(rs.getString("Teacher_address"));
				tea.setTeacher_mobile(rs.getString("Teacher_Mobile"));
				tea.setTeacher_email(rs.getString("Teacher_Email"));
				tea.setTeacher_updated_date(rs.getTimestamp("Teacher_updated_date"));
				tea.setTeacher_updated_name(rs.getInt("Teacher_updated_name"));
				tea.setTeacher_created_date(rs.getTimestamp("Teacher_created_date"));
				tea.setTeacher_created_name(rs.getInt("Teacher_created_name"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return tea;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.teady.java.two.dao.TeacherDao#saveTeacher(com.clps.sanda.teady.java.two.model.Teacher)
	 */
	public boolean saveTeacher(Teacher tea) {
		try {
			this.pstmt = conn.prepareStatement(SQL_INSERT_A_TEACHER);
			pstmt.setInt(1, tea.getTeacher_id());
			pstmt.setString(2, tea.getTeacher_name());
			pstmt.setTimestamp(3, tea.getTeacher_age());
			pstmt.setString(4, tea.getTeacher_address());
			pstmt.setString(5, tea.getTeacher_mobile());
			pstmt.setString(6, tea.getTeacher_email());
			pstmt.setInt(7, tea.getTeacher_created_name());
			pstmt.setTimestamp(8, tea.getTeacher_created_date());
			pstmt.setInt(9, tea.getTeacher_updated_name());
			pstmt.setTimestamp(10, tea.getTeacher_updated_date());
			this.flag=this.pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return this.flag;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.teady.java.two.dao.TeacherDao#deleteTeacherById(java.lang.Integer)
	 */
	@Override
	public boolean deleteTeacherById(Integer TeacherId) {
		try {
			this.pstmt = conn.prepareStatement(SQL_DELETE_TEACHER_ID);
			pstmt.setInt(1, TeacherId);
			this.flag =this.pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return this.flag;
	}

	/* (non-Javadoc)
	 * @see com.clps.sanda.teady.java.two.dao.TeacherDao#updateTeacher(com.clps.sanda.teady.java.two.model.Teacher)
	 */
	public boolean updateTeacher(Teacher teacher) {
		try {
			this.pstmt = conn.prepareStatement(SQL_UPDATE_A_TEACHER);
			pstmt.setString(1, teacher.getTeacher_name());
			pstmt.setTimestamp(2, teacher.getTeacher_age());
			pstmt.setString(3, teacher.getTeacher_address());
			pstmt.setString(4, teacher.getTeacher_mobile());
			pstmt.setString(5, teacher.getTeacher_email());
			pstmt.setInt(6, teacher.getTeacher_created_name());
			pstmt.setTimestamp(7, teacher.getTeacher_created_date());
			pstmt.setInt(8, teacher.getTeacher_updated_name());
			pstmt.setTimestamp(9, teacher.getTeacher_updated_date());
			pstmt.setInt(10, teacher.getTeacher_id());
			this.flag=this.pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return this.flag;
	}

	
}
