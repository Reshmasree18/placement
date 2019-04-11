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
public class SUpdate_Profile extends HttpServlet {

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
            String userid=request.getParameter("userid");
            String email=request.getParameter("email");
            String pass=request.getParameter("pass"); 
            String confirmpassword=request.getParameter("cpass");
            
            String Acadamic_gap=request.getParameter("Acadamic_gap");
            String Reason=request.getParameter("Reason");
               
            String HS_Name=request.getParameter("HS_sname");
            String HS_Mark=request.getParameter("HS_marks");
            String HS_PassingYear=request.getParameter("HS_pyear");
            String HS_PassingMonth =request.getParameter("HS_pmonth");
            String HS_certificate=request.getParameter("HS_certificate");
                    
            String HSS_Name =request.getParameter("HSS_sname");
            String HSS_Mark=request.getParameter("HSS_marks");
            String HSS_PassingYear=request.getParameter("HSS_pyear");
            String HSS_PassingMonth =request.getParameter("HSS_pmonth");
            String HSS_certificate=request.getParameter("HSS_certificate");
                    
            String UG_Name =request.getParameter("UG_sname");
            String UG_Mark=request.getParameter("UG_marks");
            String UG_PassingYear=request.getParameter("UG_pyear");
            String UG_PassingMonth =request.getParameter("UG_pmonth");
            String UG_certificate=request.getParameter("UG_certificate");
                    
            String PG_Name =request.getParameter("PG_sname");
            String PG_Mark=request.getParameter("PG_marks");
            String PG_PassingYear=request.getParameter("PG_pyear");
            String PG_PassingMonth =request.getParameter("PG_pmonth");
            String PG_certificate=request.getParameter("PG_certificate");
                    
            String FirstName =request.getParameter("fname");
            String LastName=request.getParameter("lname");
            String FathersName=request.getParameter("fathersname");
            String MothersName=request.getParameter("mothersname");
            String MobileNumber=request.getParameter("Mobile_Number");
            String Birth_Day=request.getParameter("DAY");
            String Birth_Month=request.getParameter("MONTH");
            String Birth_year=request.getParameter("YEAR");
            String gender =request.getParameter("gender");
                       
            String Address=request.getParameter("address");
            String City=request.getParameter("City");
            String Pin_Code=request.getParameter("Pin_Code");
            String State=request.getParameter("State");
            String Country=request.getParameter("Country");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SUpdate_Profile</title>");            
            out.println("</head>");
            out.println("<body>");
            
            try
            {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AAMI","root","");
               PreparedStatement ps = con.prepareStatement("update STUDENT_DETAILS set NAME=?,EMAIL=?,SCIENCE=?,MATHEMATICS=?,COMPUTER=?,GENERAL_KNOWLEDGE=?,TOTAL_MARKS=? WHERE REGISTER_NO=?");
               ps.setString(1,userid);
                ps.setString(2,pass);
                ps.setString(3,course);
                ps.setString(4,FirstName);
                ps.setString(5,LastName);
                ps.setString(6,FathersName);
                ps.setString(7,MothersName);
                ps.setString(8,MobileNumber);
                ps.setString(9,email);
                ps.setString(10,gender);
                ps.setString(11,Birth_Day);
                ps.setString(12,Birth_Month);
                ps.setString(13,Birth_year);
                
                ps.setString(14,Address);
                ps.setString(15,City);
                ps.setString(16,Pin_Code);
                ps.setString(17,State);
                ps.setString(18,Country);
                
                ps.setString(19,Acadamic_gap);
                ps.setString(20,Reason);
                
                ps.setString(21,HS_Name);
                ps.setString(22,HS_Mark);
                ps.setString(23,HS_PassingYear);
                ps.setString(24,HS_PassingMonth);
                ps.setString(25,HS_certificate);
                
                ps.setString(26,HSS_Name);
                ps.setString(27,HSS_Mark);
                ps.setString(28,HSS_PassingYear);
                ps.setString(29,HSS_PassingMonth);
                ps.setString(30,HSS_certificate);
                
                ps.setString(31,UG_Name);
                ps.setString(32,UG_Mark);
                ps.setString(33,UG_PassingYear);
                ps.setString(34,UG_PassingMonth);
                ps.setString(35,UG_certificate);
                
                ps.setString(36,PG_Name);
                ps.setString(37,PG_Mark);
                ps.setString(38,PG_PassingYear);
                ps.setString(39,PG_PassingMonth);
                ps.setString(40,PG_certificate);
                
             
               ps.executeUpdate();
               
               con.close();
                
            }
            
            catch(Exception e)
            {
                out.println("Exception ; "+e);
            }
            
            
            out.println("<h1>Servlet SUpdate_Profile at " + request.getContextPath() + "</h1>");
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
