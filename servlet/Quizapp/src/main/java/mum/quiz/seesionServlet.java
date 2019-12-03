/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mum.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

/**
 *
 * @author 610594
 */
@WebServlet(name="seesionServlet", urlPatterns={"/sessionServlet"})
public class seesionServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    PrintWriter out = response.getWriter();

HttpSession session = request.getSession();

Quiz q = (Quiz) session.getAttribute("quiz");

int score = q.getScore();
int qnumber = q.getQnumber();



if(qnumber==5){

  session.invalidate();
out.print("<!DOCTYPE html> \n" +
"<html >\n" +
"    <body> <div style=\"padding:10px; border: 2px solid black;\">\n" +
"\n" +
"        <h>The number Quiz</h1>\n" +
"            <h2>Your current Score is "+score+"</h2>\n" +
"            <h3>You have completed the quiz  whith a score of "+score +" out of  "+qnumber+"</h3>\n" +
"\n" +
"        </div>");
out.print("    </body>\n" +
"</html>");
}

    else{
out.print("<!DOCTYPE html> \n" +
"<html >\n" +
"    <body>\n" +
"        <h1> The number quiz </h1>\n" +
"        <h3>Your current score is "+score+" </h3>\n" +
"        <h3>guess the next number in the sequence </h3>\n" +
"\n" +
"        <p> "+QuizDb.questions[qnumber]+" </p>\n" +
"\n" +
"        <form action=\"quizsession\" method=\"GET\">\n" +
"            <label for=\"answer\">Your Answer:</label>\n" +
"            <input type=\"text\" name=\"answer\" id=\"answer\" placeholder=\"answer\">\n" +
"            <br><input type=\"submit\" name=\"sumbit\" value=\"submit\" id=\"\">\n" +
"        </form>\n" +
"\n" +
"\n" +
"    </body>\n" +
"</html>");


 }
 
    
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
