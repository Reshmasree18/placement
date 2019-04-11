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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KHSCI5MCA16089
 */
public class SRegisters extends HttpServlet {

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
            String course=request.getParameter("course");
            String RegistrationID=request.getParameter("RegistrationID");
            String FirstName =request.getParameter("fname");
            String LastName=request.getParameter("lname");
            String gender =request.getParameter("gender");
            String email=request.getParameter("email");
            String MobileNumber=request.getParameter("Mobile_Number");
            String pass=request.getParameter("PASS"); 
            String confirmpassword=request.getParameter("cpass");
            String HS_Mark=request.getParameter("HS_Marks");
            String HSS_Mark=request.getParameter("HSS_Marks");
            String UG_Mark=request.getParameter("UG_Marks");
            String PG_Mark=request.getParameter("PG_Marks");
            
                       
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SRegisters</title>");            
            out.println("</head>");
            out.println("<body>");
            
             try
              {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AAMI","root","");
                PreparedStatement ps   =  con.prepareStatement("insert into STUDENT_DETAILS values(?,?,?,?,?,?,?,?,?,?,?,?)");
                
                ps.setString(1,course);
                ps.setString(2,RegistrationID);
                ps.setString(3,FirstName);
                ps.setString(4,LastName);
                ps.setString(5,gender);
                ps.setString(6,email);
                ps.setString(7,MobileNumber);
                ps.setString(8,pass);
                ps.setString(9,HS_Mark);
                ps.setString(10,HSS_Mark);
                ps.setString(11,UG_Mark);
                ps.setString(12,PG_Mark);
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
                PreparedStatement ps   =  con.prepareStatement("insert into STUDENT_LOGIN values(?,?)");
                    ps.setString(1,RegistrationID);
                    ps.setString(2,pass);
                    ps.executeUpdate();
                    con.close();
                
               
              }
                catch(Exception e)
                {
                    out.println("Exception: "+e);
                }
            out.println("<h1>Servlet SRegisters at " + request.getContextPath() + "</h1>");
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
