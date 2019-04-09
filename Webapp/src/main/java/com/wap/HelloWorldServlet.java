package com.wap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = -1479705137809675907L;

	public HelloWorldServlet() {
		System.out.println("Wywołanie konstruktora");
	}
	

	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printWriter = response.getWriter();

		String value = request.getParameter("param1");
		
		response.setContentType("text/html");
		printWriter.write("<html><body><h2> Helllo World from servlet!!! Param="+value +" </h2></body></html>");
	}
}
