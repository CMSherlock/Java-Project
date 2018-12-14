package com.sanda.dev.tsm.biz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanda.dev.tsm.biz.service.ITeacherService;
import com.sanda.dev.tsm.biz.service.impl.TeacherServiceImpl;

/**
 * Servlet implementation class DeleteTeacherServlet
 */
@WebServlet("/DeleteTeacherServlet")
public class DeleteTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ITeacherService its = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTeacherServlet() {
        super();
        its = new TeacherServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
  		String idStr = request.getParameter("teacherLists");
		String[] idStrList =  idStr.split(",");
		for(int i=0;i<idStrList.length;i++) {
			Integer id = Integer.parseInt(idStrList[i]);
			its.deleteTeacherById(id);
		}
  		response.sendRedirect("ShowTeacherServlet");
  		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
