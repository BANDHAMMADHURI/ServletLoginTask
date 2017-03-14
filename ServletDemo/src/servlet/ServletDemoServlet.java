package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")

public class ServletDemoServlet extends HttpServlet {
	String internName, password;
	PrintWriter out;
	InternDetails intern = new InternDetails();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		//out.println("html/Login.html");
		//out.print("jhgfd");
		internName = request.getParameter("username").toLowerCase().trim();
		password = request.getParameter("password").trim();
		out = response.getWriter();
		intern.internDetails();
		validate();
	}

	public void validate() {
		if (intern.map.containsKey(internName)) {
			if (password.equals(internName)) {
				out.println("<html>");
				out.println("<h2 ><center><i>Intern Details</i></h2>");
				out.println("<center>=====================================");
				out.print("<h4>" + "<center>Hi " +  internName.toUpperCase() + "</h4>" + " Your Details are : \n");
				out.println(intern.map.get(internName.trim()));
			} else
				out.println("<h2>Oops.....Invalid Password</h2>");
		} else
			out.println("<h2>Unauthorized User</h2>");
		out.println("</html>");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.sendRedirect("/Login.html");
	}
}
