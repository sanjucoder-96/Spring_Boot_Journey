

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/response")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public FirstServlet() {
        // TODO Auto-generated constructor stub
    	System.out.println("Servlet has started dude");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fName=request.getParameter("fname");
		String lName=request.getParameter("lname");
		
		response.sendRedirect("/DynamicPage/success.jsp");
		
//		PrintWriter writer = response.getWriter();
//		writer.println("<html>");
//        writer.println("<head><title>Servlet Response</title></head>");
//        writer.println("<body>");
//        writer.println("<h1>Hello " + fName + " " + lName + "</h1>");
//        writer.println("<h2>Finally Started Java Development</h2>");
//        writer.println("</body>");
//        writer.println("</html>");
		
		
		
	}

}
