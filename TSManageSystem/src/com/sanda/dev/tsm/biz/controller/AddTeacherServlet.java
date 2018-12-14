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
 * Servlet implementation class AddTeacherServlet
 */
@WebServlet("/AddTeacherServlet")
public class AddTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ITeacherService its = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacherServlet() {
        super();
        its = new TeacherServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer teacherId = Integer.parseInt(request.getParameter("teacherId"));
		String teacherName = request.getParameter("teacherName");
		Timestamp teacherAge = Timestamp.valueOf(request.getParameter("teacherAge"));
		String teacherAddress = request.getParameter("teacherAddress");
		String teacherMobile = request.getParameter("teacherMobile");
		String teacherEmail = request.getParameter("teacherEmail");
		Timestamp teacherCreatedDate = Timestamp.valueOf(request.getParameter("teacherCreatedDate"));
		Integer teacherCreatedName = Integer.parseInt(request.getParameter("teacherCreatedName"));
		Timestamp teacherUpdateDate = Timestamp.valueOf(request.getParameter("teacherUpdateDate"));
		Integer teacherUpdateName = Integer.parseInt(request.getParameter("teacherUpdateName"));
		
		Teacher tea = new Teacher();
		tea = new Teacher();
		tea.setTeacher_id(teacherId);
		tea.setTeacher_name(teacherName);
		tea.setTeacher_age(teacherAge);
		tea.setTeacher_address(teacherAddress);
		tea.setTeacher_mobile(teacherMobile);
		tea.setTeacher_email(teacherEmail);
		tea.setTeacher_created_date(teacherCreatedDate);
		tea.setTeacher_created_name(teacherCreatedName);
		tea.setTeacher_updated_date(teacherUpdateDate);
		tea.setTeacher_updated_name(teacherUpdateName);
		
		its.addTeacherInfo(tea);
		request.getRequestDispatcher("index.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
