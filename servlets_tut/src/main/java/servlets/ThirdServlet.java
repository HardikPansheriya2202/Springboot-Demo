package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("processing doGet request by third servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message = req.getParameter("message");
		System.out.println("form submitted using post method");
		System.out.println("message :" + message);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<h1> form submitted </h1>");
		writer.print("""
				<h2>message : %s </h2>
				""".formatted(message));
	}
	
}
