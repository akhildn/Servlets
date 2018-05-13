package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet(description = "InitParams Servlet", urlPatterns = { "/InitParamsServlet" },

initParams = {@WebInitParam(name = "city", value = "Hyderabad"),
@WebInitParam(name = "country", value = "India")	
})
public class InitParamsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParamsServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<b>ServletConfig</b>");
		out.println("<br>City: " + getServletConfig().getInitParameter("city"));
		out.println("<br>Country: " + getServletConfig().getInitParameter("country"));
		
		out.println("<br><br><b>ServletContext()</b>");
		out.println("<br>Server: " + getServletContext().getInitParameter("server"));
		out.println("<br>Version: " + getServletContext().getInitParameter("version"));
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
