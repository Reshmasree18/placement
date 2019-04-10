/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KHSCI5MCA16089
 */
public class ProfilePg extends HttpServlet {

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
            
            
            String userid=" ", pass=" ", course=" ", firstname=" ",lastname=" ",mob=" ",gender=" ",email=" ",HS_mark=" ",HSS_mark=" ",UG_mark="",PG_mark="";            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style>\n" +
"     html,body{\n" +
"                   width:100%;\n" +
"                   height:100%;\n" +
"               }         \n" +
".bg\n" +
"{\n" +
"    height:80%;\n" +
"    background-position: center;\n" +
"    background-repeat: no-repeat;\n" +
"    background-size: cover;\n" +
"}\n" +
"\n" +
"box {\n" +
"  background-color: lightgrey;\n" +
"  width: 300px;\n" +
"  border: 25px solid green;\n" +
"  padding: 25px;\n" +
"  margin: 25px;\n" +
"}\n" +
"\n" +
"* {box-sizing: border-box;}\n" +
"\n" +
"body { \n" +
"  margin: 0;\n" +
"  font-family: Arial, Helvetica, sans-serif;\n" +
"}\n" +
"\n" +
".header {\n" +
"  overflow: hidden;\n" +
"  background-color:lightskyblue;\n" +
"  padding: 20px 10px;\n" +
"}\n" +
"\n" +
".header a {\n" +
"  float: left;\n" +
"  color: black;\n" +
"  text-align: center;\n" +
"  padding: 12px;\n" +
"  text-decoration: none;\n" +
"  font-size: 18px; \n" +
"  line-height: 25px;\n" +
"  border-radius: 4px;\n" +
"}\n" +
"\n" +
".header a.logo {\n" +
"  font-size: 25px;\n" +
"  font-weight: bold;\n" +
"}\n" +
"\n" +
".header a:hover {\n" +
"  background-color: #ddd;\n" +
"  color: black;\n" +
"}\n" +
"\n" +
".header a.active {\n" +
"\n" +
"  color: white;\n" +
"}\n" +
"\n" +
".header-right {\n" +
"  float: right;\n" +
"}\n" +
"\n" +
"@media screen and (max-width: 500px) {\n" +
"  .header a {\n" +
"    float: none;\n" +
"    display: block;\n" +
"    text-align: left;\n" +
"  }\n" +
"  \n" +
"  .header-right {\n" +
"    float: none;\n" +
"  }\n" +
" \n" +
"}\n" +
"  </style>\n" +
"    </head>\n" +
"    <body class=\"bg\" background=\"\">\n" +
"    <div class=\"header\">\n" +
"    <a class=\"logo\"><B>STUDENT PROFILE</B> </a>\n" +
"   <div class=\"header-right\"><br><br><br>\n" +
"      \n" +
"    <a class=\"active\" href=\"Reset_Password.html\">Change Password</a> \n" +
"    <a class=\"active\" href=\"StudUpdate\">Update Profile</a>\n" +
"    <a class=\"active\" href=\"placement.html\">Placement Details</a>\n" +
"    <a class=\"active\" href=\"\">questions</a>\n" +
"    <a class=\"active\" href=\"\">Logout</a>\n" +
"     </div>\n" +
"  </div>\n" +
"        <div class=\"box\"> \n" +
"          <h1> PERSONAL DETAILS </h1>\n" +
"          \n" +
"          <br><br>\n" +
"\n" );
            
         
            
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AAMI","root","");
                
                PreparedStatement ps = con.prepareStatement("select * from student_details where RegistrationID=?");
                ps.setString(1, MyGlobals.user);
                
                ResultSet rs = ps.executeQuery();
                
                while(rs.next())
                {
                    userid = rs.getString(2);
                    course = rs.getString(1);
                    firstname=rs.getString(3);
                    lastname=rs.getString(4);
                    gender=rs.getString(5);
                    mob= rs.getString(7);
                    email= rs.getString(6);
                    
                
                    HS_mark= rs.getString(9);
                   
                   
                    HSS_mark= rs.getString(10);
                   
                    UG_mark= rs.getString(11);
                    
                    PG_mark= rs.getString(12);
                    
                }
                
            }
            
            catch(Exception e)
            {
                out.println(e);
            }
            
            
            
            
            
            
            
            
      out.print("<label for=\"Course\"> Course :"+course+"</label><br><br>\n" +   
"          <label for=\"FirstName\">RegistrationID : "+userid +" </label><br><br>\n" + 
"          <label for=\"FirstName\">FirstName : "+firstname +" </label><br><br>\n" + 
"          <label for=\"LastName\">LastName : "+ lastname+"</label><br><br> \n" +
"          <label for=\"username\">Gender :"+ gender+" </label><br><br>\n" +
"          <label for=\"username\">Email :"+email+" </label><br><br>\n" +
"          <label for=\"username\">MobileNumber : "+ mob+"</label><br><br>\n" +

"          \n" +
"          \n" +
"          <h1>ACADAMIC DETAILS </h1>\n" +
"          <br>\n" +

"          \n" +

"          <label for=\"username\">  HS_Marks obtained : "+HS_mark +"</label><br><br>\n" +

"         \n" +

"          \n" +

"          <label for=\"username\">  HSS_Marks obtained : "+HSS_mark +"</label><br><br>\n" +
"          \n" +
"          \n" +
          
"          \n" +

"          <label for=\"username\">  UG_Marks obtained :"+UG_mark +" </label><br><br>\n" +

"          \n" +
"          \n" +

"           \n" +

"          <label for=\"username\">  PG_Marks obtained : "+PG_mark +"</label><br><br>\n" +

"          \n" +
"    </div>  </body> ");
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
