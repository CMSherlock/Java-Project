package com.sanda.dev.tsm.biz.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanda.dev.tsm.biz.model.Teacher;
import com.sanda.dev.tsm.biz.service.ITeacherService;
import com.sanda.dev.tsm.biz.service.impl.TeacherServiceImpl;

/**
 * Servlet implementation class UpdateTeacherServlet
 */
@WebServlet("/UpdateTeacherServlet")
public class UpdateTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ITeacherService its = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeacherServlet() {
        super();
        its = new TeacherServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("type");
		//这两步以下两种处理方式都需要
		Integer teacherId = Integer.parseInt(request.getParameter("teacherId"));
		Teacher teacher = its.QueryTeacherById(teacherId);
		if(str!=null && str.equals("submitted")) {
			//用户已经提交了修改信息后执行
			String teacherName = request.getParameter("teacherName");
			String teacherAge_tmp = request.getParameter("teacherAge");
			String teacherAddress = request.getParameter("teacherAddress");
			String teacherMobile = request.getParameter("teacherMobile");
			String teacherEmail = request.getParameter("teacherEmail");
			Timestamp teacherUpdateDate = Timestamp.valueOf(request.getParameter("teacherUpdatedDate"));
			Integer teacherUpdateName = Integer.parseInt(request.getParameter("teacherUpdatedName"));
			
			Timestamp teacherAge = (teacherAge_tmp.equals("")) ? teacher.getTeacher_age() : Timestamp.valueOf(teacherAge_tmp);
			teacherName = (teacherName.equals("")) ? teacher.getTeacher_name() : teacherName;
			teacherAddress = (teacherAddress.equals("")) ? teacher.getTeacher_address() : teacherAddress;
			teacherMobile = (teacherMobile.equals("")) ? teacher.getTeacher_mobile() : teacherMobile;
			teacherEmail = (teacherEmail.equals("")) ? teacher.getTeacher_email() : teacherEmail;
			
			Teacher tea = new Teacher();
			tea = new Teacher();
			tea.setTeacher_id(teacherId);
			tea.setTeacher_name(teacherName);
			tea.setTeacher_age(teacherAge);
			tea.setTeacher_address(teacherAddress);
			tea.setTeacher_mobile(teacherMobile);
			tea.setTeacher_email(teacherEmail);
			tea.setTeacher_created_date(teacher.getTeacher_created_date());
			tea.setTeacher_created_name(teacher.getTeacher_created_name());
			tea.setTeacher_updated_date(teacherUpdateDate);
			tea.setTeacher_updated_name(teacherUpdateName);
			this.its.updateTeacherInfo(tea);
			request.getRequestDispatcher("index.jsp").forward(request, response);		//转发
		}else {
			//当从其他界面第一次跳转到这里时
			request.setAttribute("targetTeacher", teacher);
			request.getRequestDispatcher("teacher_edit.jsp").forward(request, response);		//转发
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
