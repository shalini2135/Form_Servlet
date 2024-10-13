package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
res.setContentType("text/html");
	PrintWriter out=res.getWriter()	;
String name=req.getParameter("username");
String gender=req.getParameter("gender");
String email=req.getParameter("email");
String dob=req.getParameter("dob");
String course=req.getParameter("course");
String branch=req.getParameter("branch");
String[] Skills=req.getParameterValues("tech");

out.println("<h1>User INFORMATION</h1>");
out.println("<p><b>Name:</b>"+name+"</p>");
out.println("<p><b>Gender:</b>"+gender+"</p>");
out.println("<p><b>Email:</b>"+email+"</p>");
out.println("<p><b>Date of Birth:</b>"+dob+"</p>");
out.println("<p><b>Course:</b>"+course+"</p>");
out.println("<p><b>Branch:</b>"+branch+"</p>");
out.println("<p><b>Technical Skills:</b></p>");
if(Skills!=null) {
	for(String skill:Skills) 
		out.println("<p>"+skill+"</p>");
}
	else {
		out.println("<p>No technical Skills Selected</p>");
	}
out.close();
}
}
