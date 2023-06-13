package com.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Library
 */
@WebServlet("/Library")
public class Library extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Library() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter write = response.getWriter();
		 String btn = request.getParameter("btn");
		 if(btn.equals("x1"))
		 {
		String Sub1marks = request.getParameter("Sub1marks");
		String Sub2marks = request.getParameter("Sub2marks");
		String Sub3marks = request.getParameter("Sub3marks");
		
		int M1 =Integer.parseInt(Sub1marks);
		int M2 =Integer.parseInt(Sub2marks);
		int M3 =Integer.parseInt(Sub3marks);
		 int total =M1 + M2 +M3;
		 int percentage = ((total*100)/300);
		
			 if( percentage > 60) 
				{
					write.print("<h2> Congratulations............</h2>");
				}
				else {
					write.print("<h2> Sorry you're failed............</h2>");

				}
		 }
		 else {
			 String value = request.getParameter("website");
			 if(value.equals("Google"))
			 {
				 response.sendRedirect("http://www.google.com");
			 }
				else if(value.equals("LinkedIn"))
				{
					response.sendRedirect("http://www.linkedin.com");
				}
				else {
					response.sendRedirect("http://www.javatpoint.com");
				}
		 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
