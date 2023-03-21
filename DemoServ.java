package web;
import javax.servlet.http.*;  
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*; 
@WebServlet("/welcome")
public class DemoServ extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter(); 
int i=Integer.parseInt(req.getParameter("num1"));
int j=Integer.parseInt(req.getParameter("num2"));
int k=i+j;
  
String name=req.getParameter("name");//will return value  
pw.println("Welcome "+k);  
  
pw.close();  
}}  
