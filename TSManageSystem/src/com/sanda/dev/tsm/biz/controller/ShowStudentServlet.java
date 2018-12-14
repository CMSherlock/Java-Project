package com.sanda.dev.tsm.biz.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanda.dev.tsm.biz.model.Student;
import com.sanda.dev.tsm.biz.service.IStudentService;
import com.sanda.dev.tsm.biz.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class ShowStudentServlet
 */
@WebServlet("/ShowStudentServlet")
public class ShowStudentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private IStudentService iss =null;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudentServlet() {
        super();
        this.iss = new StudentServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("type");
//		switch(str) {
//		case "ALL":
//			request.setAttribute("allStudents", this.iss.showAllStudents());
//			request.getRequestDispatcher("/student_list.jsp").forward(request, response);		//转发
//			return;
//		case "SINGLE":
//			String input = request.getParameter("studentId");
//			Integer studentId = Integer.parseInt(input);
//			request.setAttribute("targetStudent", this.iss.QueryStudentById(studentId));
//			request.getRequestDispatcher("student_Info.jsp").forward(request, response);		//转发
//			return;
//		}
		if(str != null && str.equals("SINGLE")) {
			String input = request.getParameter("studentId");
			Integer studentId = Integer.parseInt(input);
			request.setAttribute("targetStudent", this.iss.QueryStudentById(studentId));
			request.getRequestDispatcher("student_Info.jsp").forward(request, response);		//转发
			return;
		}else {
			List<Student> studentList = this.iss.showAllStudents();
			
			Collections.sort(studentList, new Comparator<Student>() {
					@Override
					public int compare(Student stu1, Student stu2) {
						if(stu1.getStudent_id() >= stu2.getStudent_id()){
				            return 1;
				        }else 
				        	return -1;
					}
	
		        });
			
			request.setAttribute("allStudents", studentList);
			request.getRequestDispatcher("/student_list.jsp").forward(request, response);		//转发
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}	

}
