

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Handle")
public class Handle extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
	                     HttpServletResponse response)
	        throws IOException {

	    response.getWriter().println("Servlet Reached!");
	}
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String name = request.getParameter("name");
        String city = request.getParameter("city");
        String course = request.getParameter("course");

        PrintWriter pw = response.getWriter();

        pw.println("<h1>Student Details</h1>");
        pw.println("<h3>Name: " + name + "</h3>");
        pw.println("<h3>City: " + city + "</h3>");
        
    pw.println("<h3>Course: " + course + "</h3>");
    }
}