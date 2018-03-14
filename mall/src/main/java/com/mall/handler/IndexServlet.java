package com.mall.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.mall.dao.UserDao;
import com.mall.model.Powers;
import com.mall.model.Roles;
import com.mall.model.Users;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String state = request.getParameter("state");
		UserDao ud = new UserDao();
		if (state.equals("getPower")) {
			Users user2 =(Users) request.getSession().getAttribute("user2");
			Roles role = user2.getRole();
			List<Powers> powers = ud.getPowerById(role.getRoleId());
			System.out.println(powers);
			String json = JSON.toJSONString(powers);
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().println(json);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
