package com.kawacho;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("uname");
		String password = request.getParameter("upass");
		
		if(name.equals("rabin") && password.equals("admin")) {
			
			HttpSession session = request.getSession();
			
			session.setAttribute("userName", name);
			
			
			response.sendRedirect("profile.jsp");
			
			
		}else {
			out.println("<html><body><h2>password incorrect</h2></body></html>");
			
			
		}
		
		
	}

}
