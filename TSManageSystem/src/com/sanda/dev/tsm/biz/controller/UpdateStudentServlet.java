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
 * Servlet implementation class UpdateStudentServlet
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IStudentService iss = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super();
        iss = new StudentServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str = request.getParameter("type");
		//这两步以下两种处理方式都需要
		Integer studentId = Integer.parseInt(request.getParameter("studentId"));
		Student student = iss.QueryStudentById(studentId);
		if(str!=null && str.equals("submitted")) {
			//用户已经提交了修改信息后执行
			String studentName = request.getParameter("studentName");
			String studentAge_tmp = request.getParameter("studentAge");
			String studentAddress = request.getParameter("studentAddress");
			String studentMobile = request.getParameter("studentMobile");
			String studentEmail = request.getParameter("studentEmail");
			Timestamp studentUpdateDate = Timestamp.valueOf(request.getParameter("studentUpdatedDate"));
			Integer studentUpdateName = Integer.parseInt(request.getParameter("studentUpdatedName"));
			
			if(studentAge_tmp.equals("")) {
				System.out.println("ININININ");
			}
			Timestamp studentAge = (studentAge_tmp.equals("")) ? student.getStudent_age() : Timestamp.valueOf(studentAge_tmp);
			studentName = (studentName.equals("")) ? student.getStudent_name() : studentName;
			studentAddress = (studentAddress.equals("")) ? student.getStudent_address() : studentAddress;
			studentMobile = (studentMobile.equals("")) ? student.getStudent_mobile() : studentMobile;
			studentEmail = (studentEmail.equals("")) ? student.getStudent_email() : studentEmail;
			
			
			Student stu = new Student();
			stu = new Student();
			stu.setStudent_id(studentId);
			stu.setStudent_name(studentName);
			stu.setStudent_age(studentAge);
			stu.setStudent_address(studentAddress);
			stu.setStudent_mobile(studentMobile);
			stu.setStudent_email(studentEmail);
			stu.setStudent_created_date(student.getStudent_created_date());
			stu.setStudent_created_name(student.getStudent_created_name());
			stu.setStudent_updated_date(studentUpdateDate);
			stu.setStudent_updated_name(studentUpdateName);
			this.iss.updateStudentInfo(stu);
			request.getRequestDispatcher("index.jsp").forward(request, response);		//转发
		}else {
			//当从其他界面第一次跳转到这里时
			request.setAttribute("targetStudent", student);
			request.getRequestDispatcher("student_edit.jsp").forward(request, response);		//转发
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
