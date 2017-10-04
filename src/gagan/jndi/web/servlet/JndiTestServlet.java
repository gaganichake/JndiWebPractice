package gagan.jndi.web.servlet;

import gagan.jndi.web.service.JndiTestService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JndiTestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8289905935688564214L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		JndiTestService jndiTestService = new JndiTestService();
		try {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();

		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>JNDI Web Practice</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println(jndiTestService.getValue("TestJNDIKey"));
		    out.println("</body>");
		    out.println("</html>");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
