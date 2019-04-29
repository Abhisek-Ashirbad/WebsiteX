/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhisek Ashirbad Sethy
 * @date 31/03/2019
 * @version 1.0
 * 
 */
public class Signup extends HttpServlet 
{
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Kubber</title>"); 
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\"/>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css\\signup.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = 'profile'><img src=\"logos/kubber.png\" alt=\"Image not found.\" height=\"20\" width=\"20\"/> Kubber</div>");
            out.println("<div class = 'topmenu'>");
            out.println("<a href='index.html'>Home</a>");
            out.println("</div>");
            out.println("<br/>");
            out.println("<div>");
            out.println("<center>");
            out.println("<form>");
            out.println("<table class=\"signup\">");
            out.println("<tr>\n" +
"                        <th id=\"headrow\" colspan=\"2\">Sign Up</th>\n" +
"                    </tr>");
            out.println("<tr>\n" +
"                        <td>First Name : </td>\n" +
"                        <td><input type=\"text\" id=\"firstname\"/></td>\n" +
"                    </tr>");
            out.println("<tr>\n" +
"                        <td>Middle Name : </td>\n" +
"                        <td><input type=\"text\" id=\"middlename\"/></td>\n" +
"                    </tr>");
            out.println("<tr>\n" +
"                        <td>Last Name : </td>\n" +
"                        <td><input type=\"text\" id=\"lastname\"/></td>\n" +
"                    </tr>");
            out.println("<tr>\n" +
"                        <td>Date Of Birth : </td>\n" +
"                        <td><input type=\"date\" id=\"dob\"/></td>\n" +
"                    </tr>");
            out.println("<tr>\n" +
"                        <td>Gender : </td>\n" +
"                        <td>\n" +
"                            <input type=\"radio\" name=\"gender\" value=\"male\"> Male\n" +
"                            <input type=\"radio\" name=\"gender\" value=\"female\"> Female\n" +
"                            <input type=\"radio\" name=\"gender\" value=\"other\"> Other\n" +
"                        </td>\n" +
"                    </tr>");
            out.println("<tr>\n" +
"                        <td>Address : </td>\n" +
"                        <td><input type=\"text\" id=\"textaddress\"/></td>\n" +
"                    </tr>");
            out.println("");
            out.println("</table>");
            out.println("</form>");
            out.println("</center>");
            out.println("</div>");            
            out.println("");
            out.println("");
            out.println("");
            out.println("</body>");
            out.println("</html>");
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
