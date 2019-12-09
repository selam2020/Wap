package edu.mum.cs545;
import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


public class ChooseServlet extends HttpServlet
{

 protected void doGet(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException
 {

 RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
 dispatch.forward(request, response);
 }

 protected void doPost(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException
 {
     HttpSession session= request.getSession();
     
      
 String choice = request.getParameter("radioJSPCool");
 if (choice != null)
 {
     if(choice.equals("1")){
              session.setAttribute("radioJSPCooly","checked");

     }
     else{
             session.setAttribute("radioJSPCooln","checked");
     }
 System.out.println ("choice= "+ choice);
 }
  String choice2 = request.getParameter("JSFwayCool");
 if (choice2 != null)
 {
     if(choice2.equals("1")){
              session.setAttribute("JSFwayCooly","checked");

     }
     else{
             session.setAttribute("JSFwayCooln","checked");
     }
 System.out.println ("choice= "+ choice);
 
 

 }
 
 
 
 String choice3 = request.getParameter("moonCheese");
 
 if(choice3!=null){
    if(choice3.equals("1")){
        session.setAttribute("moonCheesey", "checked");
        
    }
    else{
         session.setAttribute("moonCheesen", "checked");
    }
 }
 
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 else
 System.out.println("No choice made");
 RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
 dispatch.forward(request, response);
 }
}