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
public class QBView extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet QBView</title>");            
            out.println("</head>");
            out.println("<body>");
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AAMI","root","");
                PreparedStatement ps = con.prepareStatement("select * from QUESTION_BANK");
                ResultSet rs = ps.executeQuery();
                out.println("<center>");
                out.println("<h1>OUESTION BANK<h1>");
               
                out.println("</center>"); 
              
                out.println("<table border=1 width=60% height=80% align=center>"
                        + "<tr>"
                        + "<th> TESTID </th>"
                        + "<th> QUESTIONID</th>"
                        +"<th> QUESTION</th>"
                        +"<th>OPTION1</th>"
                        +"<th>OPTION2</th>"
                        +"<th>OPTION3</th>"
                        +"<th>OPTION4</th>"
                        +"<th>ANSWER</th>"
                        + "</tr>");
              
                while(rs.next())
                {
                    String TESTID = rs.getString("Department");
                    String QID= rs.getString("UserID");
                    String Question = rs.getString("FirstName");
                    String Option1 = rs.getString("LastName");
                    String option2= rs.getString("Gender");
                    String option3= rs.getString("Email");
                    String option4 = rs.getString("MobileNumber");
                    String ans = rs.getString("MobileNumber");
                    
                   
                    String psw = rs.getString("Password");
                    
                    out.println("<tr align=center>"+"<td>"+TESTID+"<td width='20%'>"+QID+"<td width='20%'>"+Question+"<td>"+Option1+"<td>"+option2+"<td>"+option3+"<td>"+option4+"<td>"+ans+"</tr>");
                                 
                   // out.println("<tr align=center >"+ "<td >" +CIR+"<td width ='20%' >"+RID+"<td > "+FName+"<td > "+ LastName +" <td > "+Gender+" <td> "+Email+"<td >  "+" <td> "+Mobile+"<td >  "+" <td> "+psw+"<td >  "+" <td> "++"<td >  "+Mobile+"</tr>");
                    
                   // out.println("<tr align=center >"+ "<td >" +CRS+"<td width ='20%' >"+"<td >" +RID+"<td width ='20%' >"+"<td >" +FName+"<td width ='20%' >"+"<td >" +LastName+"<td width ='20%' >"+"<td >" +Gender+"<td width ='20%' >"+Email+"<td > "+Mobile+"<td > "+HS+" <td > "+HSS+" <td> "+UG+"<td >  "+PG+"</tr>");
                   
                    out.println("<br>");
                   
                    out.println("<br>");
                    
                }
                 out.println("</table>");
                con.close();
                
            }
            catch(Exception e)
            {
                out.println("Exception : "+e);
            } 
            
            out.println("<h1>Servlet QBView at " + request.getContextPath() + "</h1>");
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
