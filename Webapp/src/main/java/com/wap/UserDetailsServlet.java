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
public class UserDetailsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		out.println("<html><body>");
		
		if  (session != null) {
			
			User user = (User)session.getAttribute("user");
			out.println("<h2> email: "+user.getEmail() + "</h2>");
			out.println("<h2> name: "+user.getName()+ "</h2>");
			// itd.
			
		} else {
			out.println("Brak użytkownika! Należy zarejestrować/zalogować");
			
		}
 		
		out.print("</body></html>");
	}
}
