package com.sanda.dev.tsm.biz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanda.dev.tsm.biz.service.IStudentService;
import com.sanda.dev.tsm.biz.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class DeleteStudentServlet
 */
@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IStudentService iss = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStudentServlet() {
        super();
        iss = new StudentServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idStr = request.getParameter("studentLists");
		String[] idStrList =  idStr.split(",");
		for(int i=0;i<idStrList.length;i++) {
			Integer id = Integer.parseInt(idStrList[i]);
			iss.deleteStudentById(id);
		}
  		response.sendRedirect("ShowStudentServlet");
  		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
