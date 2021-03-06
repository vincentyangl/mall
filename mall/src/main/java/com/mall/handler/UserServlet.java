package com.mall.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mall.dao.UserDao;
import com.mall.model.Users;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String state = request.getParameter("state");
		UserDao ud = new UserDao();
		if (state.equals("list")) {
			List<Users> users = ud.listAll();
			request.setAttribute("users", users);
			response.setContentType("text/html; charset=UTF-8");
			System.out.println("2");
			request.getRequestDispatcher("usermanager.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
