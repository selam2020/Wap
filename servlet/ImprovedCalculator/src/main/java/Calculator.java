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
@WebServlet(urlPatterns={"/Calculate"})
public class Calculator extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
protected void doGet(HttpServletRequest request,
 HttpServletResponse response)throws ServletException, IOException{

}
protected void doPost(HttpServletRequest request,
 HttpServletResponse response)throws ServletException, IOException
 {
 PrintWriter out = response.getWriter();
 out.print(" \n"
                + "        <form action=\"Calculate\" method=\"POST\">\n"
                + "            ");

           out.print("<input name=\"number1\" type=\"text\" size=\"5\" value=\"");
           out.print(request.getParameter("number1").replaceAll(" ","") + "\" > + <input name=\"number2\" type=\"text\" size=\"5\" value=\"");
            out.print(request.getParameter("number2").replaceAll(" ","") + "\" > ");
            
        if (request.getParameter("number1").length() != 0 && request.getParameter("number2").length() != 0) {
            int number1 = Integer.parseInt(request.getParameter("number1").replaceAll(" ",""));
            int number2 = Integer.parseInt(request.getParameter("number2").replaceAll(" ",""));
            
            out.print(" = <input size=\"6\" type=\"text\" value= \"");
           
            out.print(number2 + number1 + "\" >");

        }
        else{
            
            out.print(" = <input size=\"6\" type=\"text\" value= \"\" >");
           
    }
        out.print("<br>\n"
                + "            <br>");

          out.print("<input name=\"number3\" type=\"text\" size=\"5\" value=\"");
           out.print(request.getParameter("number3").replaceAll(" ","") + "\" > * <input name=\"number4\" type=\"text\" size=\"5\" value=\"");
            out.print(request.getParameter("number4").replaceAll(" ","") + "\" > ");
            
        if (request.getParameter("number3").length() != 0 && request.getParameter("number4").length() != 0) {
            int number4 = Integer.parseInt(request.getParameter("number4").replaceAll(" ",""));
            int number3 = Integer.parseInt(request.getParameter("number3").replaceAll(" ",""));
            
            out.print(" = <input size=\"6\" type=\"text\" value= \"");
           
            out.print(number4 * number3 + "\" >");

        }
        else{
            
            out.print(" = <input size=\"6\" type=\"text\" value= \"\" >");
           
    }
        
        out.print(" <br> <br>\n" +
"            <input type=\"submit\" value=\"Submit\">\n" +
"\n" +
"        </form>");
 }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
