/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 610594
 */
@WebServlet(urlPatterns = {"/Calculate"})
public class Calculate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        
        if (request.getParameter("number1").length() != 0 && request.getParameter("number2").length() != 0) {

            int number1 = Integer.parseInt(request.getParameter("number1"));
            int number2 = Integer.parseInt(request.getParameter("number2"));

            int sum=number1+number2;
            out.print("<p>"+number1 + " + " + number2 + " = " + sum+ " </p>");

        }

        if (request.getParameter("number3").length() != 0 && request.getParameter("number4").length() != 0) {
            int number4 = Integer.parseInt(request.getParameter("number4").replaceAll(" ",""));
            int number3 = Integer.parseInt(request.getParameter("number3").replaceAll(" ",""));
            out.print("<p>" +  number3 + " * " + number4 + " = " + number3 * number4 + "</p>");
        }

       
        
        
        
        
        
        
        

}

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>




protected void doGet(HttpServletRequest request,
 HttpServletResponse response)throws ServletException, IOException
 {
 PrintWriter out = response.getWriter();



 }



}
