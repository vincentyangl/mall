package com.mall.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mall.dao.RoleDao;
import com.mall.model.Roles;

/**
 * Servlet implementation class RoleServlet
 */
public class RoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String state = request.getParameter("state");
		RoleDao rd = new RoleDao();
		if (state.equals("list")) {
			List<Roles> roles = rd.listAll();
			request.setAttribute("roles", roles);
			response.setContentType("text/html; charset=UTF-8");
			System.out.println("5");
			request.getRequestDispatcher("rolemanager.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
