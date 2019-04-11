<%-- 
    Document   : Update_Student
    Created on : Mar 15, 2019, 1:02:19 PM
    Author     : KHSCI5MCA16089
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
          body{
                height:100%;
            }
            .bg{
                background-color:#adebeb;
                
            }
            .container{
	position:absolute;
	width: auto;
	height:auto;
	top: calc(50% - 300px);
	left: calc(50% - 200px);
}

form {
	position: absolute;
	text-align: center;
	background: #fff;
	width: 550px;
	height: 720px;
	border-radius: 5px;
	padding: 30px 20px 0 20px;
	box-shadow: 0 10px 50px 0 rgba(0, 0, 0, 0.25);
	box-sizing: border-box;
}

            
input {
	border: none;
	border-bottom: 1px solid #2db9b9 ;
	width: 90%;
	font-family: 'Roboto';
	color: #2db9b9 ;
	text-align: center;
	font-size: 21px;
	font-weight:100;
	margin-bottom:25px;
}

::-webkit-input-placeholder {
   color:#adebeb ;
	font-family: 'Roboto';
	font-weight:100;
}

:-moz-placeholder {
   color: #adebeb;  
	font-family: 'Roboto';
	font-weight:100;
}

::-moz-placeholder {
   color: #adebeb;  
	font-family: 'Roboto';
	font-weight:100;
}

:-ms-input-placeholder {  
   color: #adebeb; 
	font-family: 'Roboto';
	font-weight:100;
}
  .button {
	
	width: 95%;
	height: 60px;
	bottom: 0;
	border: 0;
	font-family: 'Dosis';
	font-size: 24px;
	text-transform: uppercase;
	cursor: pointer;
        text-align: center;
        color:white;
        background-color: #2db9b9;  
	font-family: cooper;
	
}
            </style>
    </head>
    
         <body class="bg">
        <div class="container">
       <form action="update_stud" method="POST">
           
            <h2 style="color:#006699 ;font-family:Lucida Calligraphy;">Update Student<h2>
          <br><br>
            <input type="text" name="userid" placeholder="User_ID" type="text" value="" required>
            <input type="text" name="email" placeholder="Email" type="text" value="">
             <input type="text" name="cpass" placeholder="Confirm Password" type="password" value="">
         <input type="text" name="HS_sname" placeholder="School Name" type="text" value="">
<input type="text" name="HS_marks" placeholder="Marks Obtained [percentage]" type="text" value="">
<input type="text" name="HS_pyear" placeholder="Passing Year" type="text" value="">
<input type="text" name="HS_pmonth" placeholder="Passing Month" type="text" value="">

<input class="text_field" name="HS_certificate" placeholder="Marks" type="file" value="">
<input class="text_field" name="HSS_sname" placeholder="School Name" type="text" value="">
<input class="text_field" name="HSS_marks" placeholder="Marks Obtained [percentage]" type="text" value="">
<input class="text_field" name="HSS_pyear" placeholder="Passing Year" type="text" value="">
<select class="options" name="HSS_pmonth">
<input class="text_field" name="HSS_marks" placeholder="Marks" type="file" value="">
<input class="text_field" name="UG_sname" placeholder="School Name" type="text" value="">
<input class="text_field" name="UG_marks" placeholder="CGPA" type="text" value="">
<input class="text_field" name="UG_pyear" placeholder="Passing Year" type="text" value="">
<select class="options" name="UG_pmonth">
<input class="text_field" name="UG_marks" placeholder="Marks" type="file" value="">
<input class="text_field" name="PG_sname" placeholder="School Name" type="text" value="">
<input class="text_field" name="PG_marks" placeholder="CGPA" type="text" value="">
<input class="text_field" name="PG_pyear" placeholder="Passing Year" type="text" value="">
<select class="options"name="PG_pmonth">
<input class="text_field" name="PG_marks" placeholder="Marks" type="file" value="">
<input class="text_field" name="fname" placeholder="First Name" type="text">
<input class="text_field" name="lname" placeholder="Last Name" type="text">
<input class="text_field" name="fathersname" placeholder="Father's Name" type="text">
<input class="text_field" name="mothersname" placeholder="Mother's Name" type="text">
<input class="text_field" name="Mobile_Number" maxlength="10"  placeholder="Mobile_Number" type="text" value="">
(10 digit number)
<input name="gender" type="radio" value="Male">Male
<input name="gender" type="radio" value="Female">Female
<textarea name="address" placeholder="Address">
</textarea>
<input class="text_field" name="City" placeholder="City" type="text">
(max 30 characters a-z and A-Z)
<input class="text_field" name="Pin_Code" maxlength="6" placeholder="PIN CODE" type="text">
(6 digit number)
<input class="text_field" name="State" placeholder="STATE" type="text">
<input class="text_field" name="Country" placeholder="COUNTRY" type="text">
            
                 <input type="text" name="uname" placeholder=" Name " required><br>
              <input type="email" name="mail" placeholder="  E-mail "><br>
              <input type="text" name="science" placeholder="Science Marks" required><br>
                <input type="text" name="math" placeholder=" Maths Marks " required><br>
                <input type="text" name="com" placeholder="Computer Marks" required><br>
              <input type="text" name="gk" placeholder="GK Marks " required><br><br><br><br>
          
              <button type="submit" class="button" name = "created">update</button><br><br><br>
           
          
           </form>
            </div>
    </body>
</html>

