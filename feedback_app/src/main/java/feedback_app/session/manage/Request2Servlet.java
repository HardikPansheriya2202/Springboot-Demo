package feedback_app.session.manage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class Request2Servlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");
		var writer = resp.getWriter();
		Cookie[] cookies = req.getCookies();

		var flag = false;
		if (cookies != null)
		{
			for (Cookie cookie : cookies)
			{
				String name = cookie.getName();
				if (name.equals("username"))
				{
					System.out.println("username :" + cookie.getValue());
					writer.println("""
							<h1> Welcome : %s </h1>
							""".formatted(cookie.getValue()));
					flag = true;
				}
			}
		}
		
		HttpSession session = req.getSession();
		String secret = (String)session.getAttribute("userSecret");
		
		if (!flag) {
			writer.println("""
					<h1> This user's cookie not found </h1>
					""");
		}else {
			writer.println("""
					<h1> This user's cookie not found </h1>
					<h2> Session secret : %s </h2>
					""".formatted(secret));
		}
	}

}
