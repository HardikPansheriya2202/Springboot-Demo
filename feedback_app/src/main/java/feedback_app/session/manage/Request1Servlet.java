package feedback_app.session.manage;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Request1Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("username", "hards");
		cookie.setMaxAge(10*60);
		resp.addCookie(cookie);
		
		HttpSession session = req.getSession();
		session.setAttribute("userSecret", UUID.randomUUID().toString());
//		session.setAttribute("userid", "123456");
		session.setMaxInactiveInterval(10*60);
	}

}
