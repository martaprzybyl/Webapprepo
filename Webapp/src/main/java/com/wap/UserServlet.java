package com.wap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wap.user.User;

@SuppressWarnings("serial")
public class UserServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String login = req.getParameter("login");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		
		// walidacja danych 
		
		HttpSession session =  req.getSession(true);
		
		User user = new User();
		user.setEmail(email);
		user.setLogin(login);
		user.setPassword(password);
		user.setName(name);
		user.setSurname(surname);
		
		session.setAttribute("user", user);
		session.setMaxInactiveInterval(10);
		
		PrintWriter out = resp.getWriter();
		out.println("Użytkownik zapisany; sesja ustawiona na 10s.");
		
	}
}
