package com.mall.handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mall.dao.UserDao;
import com.mall.model.Users;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String state = request.getParameter("state");
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		UserDao ud = new UserDao();
		if (state.equals("login")) {
			Users user = new Users();
			user.setUname(uname);
			user.setUpwd(upwd);
			Users user2 = ud.checkUser(user);
			if (user2==null) {
				response.sendRedirect("login.jsp");
			}else {
				request.getSession().setAttribute("user2", user2);
				System.out.println(user2.getUname());
				response.setContentType("text/html; charset=UTF-8");
				response.sendRedirect("index2.jsp");
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
