package com.coforge.training.shopstop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String msg;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        msg="HttpServlet Demo";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set the content type of Web Page response
		response.setContentType("text/html");
		
		//write the message on Web Page
		PrintWriter out= response.getWriter();
		out.println("<h1> Hello World from Servlet</h1>");
		out.println("<h3>"+msg+"</h3>");
		out.println("<p> Web Applications Using Servlet</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
