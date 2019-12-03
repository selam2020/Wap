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
import javax.servlet.http.HttpSession;


/**
 *
 * @author 610594
 */
@WebServlet(name="quizsession", urlPatterns={"/quizsession"})
public class quizsession extends HttpServlet {
   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {



HttpSession session = request.getSession();
if (session.isNew()) {
    session.setAttribute("quiz", new Quiz());
} else {

int answer = Integer.parseInt( request.getParameter("answer"));

Quiz r = new Quiz();
Quiz q = (Quiz) session.getAttribute("quiz");
r.score=q.getScore();
r.qnumber=q.getQnumber();
r.ourLogic(answer);

    session.setAttribute("quiz", r);
}


response.sendRedirect("sessionServlet");

    } 

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
