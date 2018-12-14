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

import com.sanda.dev.tsm.biz.model.Teacher;
import com.sanda.dev.tsm.biz.service.ITeacherService;
import com.sanda.dev.tsm.biz.service.impl.TeacherServiceImpl;

/**
 * Servlet implementation class ShowTeacherServlet
 */
@WebServlet("/ShowTeacherServlet")
public class ShowTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ITeacherService its = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowTeacherServlet() {
        super();
        its = new TeacherServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("type");
//		switch(str) {
//		case "ALL":
//			request.setAttribute("allTeachers", this.its.showAllTeachers());
//			request.getRequestDispatcher("/teacher_list.jsp").forward(request, response);		//转发
//			return;
//		case "SINGLE":
//			String input = request.getParameter("teacherId");
//			Integer teacherId = Integer.parseInt(input);
//			request.setAttribute("targetTeacher", this.its.QueryTeacherById(teacherId));
//			request.getRequestDispatcher("teacher_Info.jsp").forward(request, response);		//转发
//			return;
//		default:
//			System.out.println("Parameter ( type ) Wrong!");
//			return;
//		}
		
		if(str != null && str.equals("SINGLE")) {
			String input = request.getParameter("teacherId");
			Integer teacherId = Integer.parseInt(input);
			request.setAttribute("targetTeacher", this.its.QueryTeacherById(teacherId));
			request.getRequestDispatcher("teacher_Info.jsp").forward(request, response);		//转发
			return;
		}else {
			List<Teacher> teacherList = this.its.showAllTeachers();
			
			Collections.sort(teacherList, new Comparator<Teacher>() {
					@Override
					public int compare(Teacher tea1, Teacher tea2) {
						if(tea1.getTeacher_id() >= tea2.getTeacher_id()){
				            return 1;
				        }else 
				        	return -1;
					}
		        });
			
			request.setAttribute("allTeachers", teacherList);
			request.getRequestDispatcher("/teacher_list.jsp").forward(request, response);		//转发
			return;
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
