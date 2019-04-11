/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KHSCI5MCA16089
 */
public class SLogin extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
          String uname=request.getParameter("SU");
        String pass=request.getParameter("SP");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet SLogin at " + request.getContextPath() + "</h1>");
            
             try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AAMI","root","");
                PreparedStatement ps =con.prepareStatement("select * from STUDENT_LOGIN");
                ResultSet rs = ps.executeQuery();
               while(rs.next())
               {
                   
                if(uname!=null && uname.equals(rs.getString(1)))
                {
                    if(pass.equals(rs.getString(2)))
                    {
                        MyGlobals.user = uname;
                        response.sendRedirect("ProfilePg");
                     }
                     else
                    {
                        //out.println("<html><head></head><body onload=\"alert('Kindly use a valid Password!')\"></body></html>");
                        out.println("<script type=\"text/javascript\">\n" +
"                     alert(\"Kindly enter a valid password ! \");\n" +
"                     window.location.assign(\"Student.html\")\n" +
"                    </script>\n");
                     }
                }
                else
                 {
                        //out.println("<html><head></head><body onload=\"alert('Kindly use a valid Password!')\"></body></html>");
                    out.println("<script type=\"text/javascript\">\n" +
"                     alert(\"Kindly enter a valid username ! \");\n" +
"                     window.location.assign(\"Student.html\")\n" +
"                    </script>\n");
                }
            
               }
            
                
                con.close();
            }
            catch(Exception e)
            {
                out.println("Exception : "+e);
            }
             
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
