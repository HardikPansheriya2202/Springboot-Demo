package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String feedback = req.getParameter("feedback_message");
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.print("<h1>Feedback servlet working</h1>");
		
		writer.print("""
				<h2> You submited details : </h2>
				<h3> Email address : %s </h3>
				<h3> Phone number : %s </h3>
				<h3> Feedback : %s </h3>
				""".formatted(email, phone, feedback));
	}

}
