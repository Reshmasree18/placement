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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KHSCI5MCA16089
 */
public class FRegisters extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
             String department=request.getParameter("dept");
   
            String id=request.getParameter("fid");
            String email=request.getParameter("email");
            String pass=request.getParameter("pass"); 
            String confirmpassword=request.getParameter("cpass");
            
            
            String FirstName =request.getParameter("fname");
            String LastName=request.getParameter("lname");
            String MobileNumber=request.getParameter("Mobile_Number");
          
            String gender =request.getParameter("gender");
          
            
            
                          
                          
                    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FRegisters</title>");            
            out.println("</head>");
            out.println("<body>");
            
             try
              {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AAMI","root","");
                PreparedStatement ps   =  con.prepareStatement("insert into FACULTY_DETAILS values(?,?,?,?,?,?,?,?)");
                
                ps.setString(1,department);
                ps.setString(2,id);
                ps.setString(8,pass);
                ps.setString(3,FirstName);
                ps.setString(4,LastName);
                ps.setString(7,MobileNumber);
                ps.setString(6,email);
                ps.setString(5,gender);
            
               
               
                
               
             
                
                ps.executeUpdate();
                con.close();
                
                
                
                
            }
            catch(Exception e) 
            {
                out.println("Exception : "+e);
            }
             
                try
              {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AAMI","root","");
                PreparedStatement ps   =  con.prepareStatement("insert into FACULTY_LOGIN values(?,?)");
                    ps.setString(1,id);
                    ps.setString(2,pass);
                    ps.executeUpdate();
                    con.close();
                
               
              }
                catch(Exception e)
                {
                    out.println("Exception: "+e);
                }
            out.println("<h1>Servlet FRegisters at " + request.getContextPath() + "</h1>");
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
