package com.mall.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mall.dao.PowerDao;
import com.mall.model.Powers;

/**
 * Servlet implementation class PowerServlet
 */
public class PowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String state = request.getParameter("state");
		PowerDao pd = new PowerDao();
		if (state.equals("list")) {
			List<Powers> powers = pd.listAll();
			request.setAttribute("powers", powers);
			response.setContentType("text/html; charset=UTF-8");
			System.out.println("3");
			request.getRequestDispatcher("powermanager.jsp").forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
