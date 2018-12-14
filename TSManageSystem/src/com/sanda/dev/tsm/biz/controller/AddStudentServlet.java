package com.sanda.dev.tsm.biz.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanda.dev.tsm.biz.model.Student;
import com.sanda.dev.tsm.biz.service.IStudentService;
import com.sanda.dev.tsm.biz.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IStudentService iss = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        iss = new StudentServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer studentId = Integer.parseInt(request.getParameter("studentId"));
		String studentName = request.getParameter("studentName");
		Timestamp studentAge = Timestamp.valueOf(request.getParameter("studentAge"));
		String studentAddress = request.getParameter("studentAddress");
		String studentMobile = request.getParameter("studentMobile");
		String studentEmail = request.getParameter("studentEmail");
		Timestamp studentCreatedDate = Timestamp.valueOf(request.getParameter("studentCreatedDate"));
		Integer studentCreatedName = Integer.parseInt(request.getParameter("studentCreatedName"));
		Timestamp studentUpdateDate = Timestamp.valueOf(request.getParameter("studentUpdateDate"));
		Integer studentUpdateName = Integer.parseInt(request.getParameter("studentUpdateName"));
		
		Student stu = new Student();
		stu = new Student();
		stu.setStudent_id(studentId);
		stu.setStudent_name(studentName);
		stu.setStudent_age(studentAge);
		stu.setStudent_address(studentAddress);
		stu.setStudent_mobile(studentMobile);
		stu.setStudent_email(studentEmail);
		stu.setStudent_created_date(studentCreatedDate);
		stu.setStudent_created_name(studentCreatedName);
		stu.setStudent_updated_date(studentUpdateDate);
		stu.setStudent_updated_name(studentUpdateName);
		
		this.iss.addStudentInfo(stu);
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
