<%-- 
    Document   : test
    Created on : Mar 20, 2019, 1:13:52 PM
    Author     : KHSCI5MCA16089
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <style>
            .content{
width:960px;
margin:20px auto
}
.main{
float:left;
width:650px;
margin-top:80px
}
#progressbar{
margin:0;
padding:0;
font-size:18px
}
#active1{
color:red
}
fieldset{
display:none;
width:350px;
padding:20px;
margin-top:50px;
margin-left:85px;
border-radius:5px;
box-shadow:3px 3px 25px 1px gray
}
#first{
display:block;
width:350px;
padding:20px;
margin-top:50px;
border-radius:5px;
margin-left:85px;
box-shadow:3px 3px 25px 1px gray
}
input[type=text],input[type=password],select{
width:100%;
margin:10px 0;
height:40px;
padding:5px;
border:3px solid #ecb0dc;
border-radius:4px
}
textarea{
width:100%;
margin:10px 0;
height:70px;
padding:5px;
border:3px solid #ecb0dc;
border-radius:4px
}
input[type=submit],input[type=button]{
width:120px;
margin:15px 25px;
padding:5px;
height:40px;
background-color:#a0522d;
border:none;
border-radius:4px;
color:#fff;
font-family:'Droid Serif',serif
}
h2,p{
text-align:center;
font-family:'Droid Serif',serif
}
li{
margin-right:52px;
display:inline;
color:#c1c5cc;
font-family:'Droid Serif',serif
}
            
        </style>
          <script >
            /*------------Validation Function-----------------*/
var count = 0; // To count blank fields.
function validation(event) {
var radio_check = document.getElementsByName('gender'); // Fetching radio button by name.
var input_field = document.getElementsByClassName('text_field'); // Fetching all inputs with same class name text_field and an html tag textarea.
var text_area = document.getElementsByTagName('textarea');
//Validating radio button.
if (radio_check[0].checked == false && radio_check[1].checked == false) {
var y = 0;
} else {
var y = 1;
}
// For loop to count blank inputs.
for (var i = input_field.length; i > count; i--) {
if (input_field[i - 1].value == '' || text_area.value == '') {
count = count + 1;
} else {
count = 0;
}
}
if (count != 0 || y == 0) {
alert("*All Fields are mandatory*"); // Notifying validation
event.preventDefault();
} else {
return true;
}
}
/*---------------------------------------------------------*/
// Function that executes on click of first next button.
function next_step1() {
document.getElementById("first").style.display = "none";
document.getElementById("second").style.display = "block";
document.getElementById("active2").style.color = "red";
}
// Function that executes on click of first previous button.
function prev_step1() {
document.getElementById("first").style.display = "block";
document.getElementById("second").style.display = "none";
document.getElementById("active1").style.color = "red";
document.getElementById("active2").style.color = "gray";
}
// Function that executes on click of second next button.
function next_step2() {
document.getElementById("second").style.display = "none";
document.getElementById("third").style.display = "block";
document.getElementById("active3").style.color = "red";
}
// Function that executes on click of second previous button.
function prev_step2() {
document.getElementById("third").style.display = "none";
document.getElementById("second").style.display = "block";
document.getElementById("active2").style.color = "red";
document.getElementById("active3").style.color = "gray";
}
 
        </script>
        

      
</head>
<body>
<div class="content">
<div class="main">

<form action="SRegisters" method="POST">
    
<ul id="progressbar">
<li id="active1">Create Account</li>
<li id="active2">Educational Profiles</li>
<li id="active3">Personal Details</li>
</ul>
    

<fieldset id="first">
<h2 class="title">Create your account</h2>
<p class="subtitle">Step 1</p>


<select class="options" id="course">
<option>--Select Course--</option>
  
  <option value="BCA">B. Sc. (Visual Media)</option>
  <option value="BCA">B. B. A. (Logistics Management)</option>
  <option value="BCA">B. Com. (Finance and I.T.)</option>
  <option value="BCA">B. Com. (Taxation and Finance)</option>
  <option value="BCA">B.F.A. (Photography)</option>
  <option value="BCA">B.F.A. (Painting)</option>
  
  <option value="BCA">M.C.A. [Lateral Entry to IInd Year]</option>
  <option value="BCA">M.A. (English Language and Literature)</option>
  <option value="BCA">M. Com. (Finance and Systems)</option>
  <option value="BCA">M.Sc. Mathematics</option>
  <option value="BCA">M.A. Journalism and Mass Communication
 [Specialisation: Video Production and Broadcasting]</option>
  <option value="BCA">M.A. Visual Media and Communication </option>
  <option value="BCA">M.A. Corporate Communication and Advertising </option>
  <option value="BCA">M.F.A. (Visual Media) - Animation and Content Management</option>
  <option value="BCA">M.F.A. (Visual Media) - Digital Film Making</option>
  <option value="BCA">M.F.A. (Visual Media) - Applied Art and Advertising</option>
 

  <option value="B.Tech">Integrated B.C.A. - M.C.A.</option>
  <option value="MCA">Integrated B.Sc. - M.Sc.</option>
  <option value="MBA">Integrated B.A. - M.A. (English Language and Literature)</option>
  
</select>

<form>
    <input class="text_field" name="userid" placeholder="User_ID" type="text" value="" required>
</form>
    <%
    String name = request.getParameter("userid");
    if(userid.value==null)
    {
        
    }
    
%>
<input class="text_field" name="email" placeholder="Email" type="text" value="">
<!--<input class="text_field" name="pass" placeholder="Password" type="password" value="">-->

 <input type="password" id="pass" name="pass" placeholder="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>

<input class="text_field" name="cpass" placeholder="Confirm Password" type="password" value="">
<center>
    
<input id="next_btn1" onclick="next_step1()" type="button" value="Next"></center>
</fieldset>
    
<fieldset id="second">
<h2 class="title">Educational Profiles</h2>
<p class="subtitle">Step 2</p>


<label>Acadamic gap</label>
<input name="Acadamic_gap" type="radio" value="Yes">Yes
<input name="Acadamic_gap" type="radio" value="No">NO<br><br>
[if yes,reason for that]
<textarea name="Reason" placeholder="Reason">
</textarea>

<label>Acadamic Details</label>
<p> High school informations </p>
<input class="text_field" name="HS_sname" placeholder="School Name" type="text" value="">
<input class="text_field" name="HS_marks" placeholder="Marks Obtained [percentage]" type="text" value="">
<input class="text_field" name="HS_pyear" placeholder="Passing Year" type="text" value="">
<select class="options" name="HS_pmonth">
<option value="-1">--passing Month--</option>
<option value="January">Jan</option>
<option value="February">Feb</option>
<option value="March">Mar</option>
<option value="April">Apr</option>
<option value="May">May</option>
<option value="June">Jun</option>
<option value="July">Jul</option>
<option value="August">Aug</option>
<option value="September">Sep</option>
<option value="October">Oct</option>
<option value="November">Nov</option>
<option value="December">Dec</option>
</select>
certificate(scanned copy of SSLC certificate)
<input class="text_field" name="HS_certificate" placeholder="Marks" type="file" value="">

<p> higher secondary school informations </p>
<input class="text_field" name="HSS_sname" placeholder="School Name" type="text" value="">
<input class="text_field" name="HSS_marks" placeholder="Marks Obtained [percentage]" type="text" value="">
<input class="text_field" name="HSS_pyear" placeholder="Passing Year" type="text" value="">
<select class="options" name="HSS_pmonth">
<option value="-1">--passing Month--</option>
<option value="January">Jan</option>
<option value="February">Feb</option>
<option value="March">Mar</option>
<option value="April">Apr</option>
<option value="May">May</option>
<option value="June">Jun</option>
<option value="July">Jul</option>
<option value="August">Aug</option>
<option value="September">Sep</option>
<option value="October">Oct</option>
<option value="November">Nov</option>
<option value="December">Dec</option>
</select>
certificate(scanned copy of HSS certificate)
<input class="text_field" name="HSS_marks" placeholder="Marks" type="file" value="">

<p> UG informations </p>
<input class="text_field" name="UG_sname" placeholder="School Name" type="text" value="">
<input class="text_field" name="UG_marks" placeholder="CGPA" type="text" value="">
<input class="text_field" name="UG_pyear" placeholder="Passing Year" type="text" value="">
<select class="options" name="UG_pmonth">
<option value="-1">--passing Month--</option>
<option value="January">Jan</option>
<option value="February">Feb</option>
<option value="March">Mar</option>
<option value="April">Apr</option>
<option value="May">May</option>
<option value="June">Jun</option>
<option value="July">Jul</option>
<option value="August">Aug</option>
<option value="September">Sep</option>
<option value="October">Oct</option>
<option value="November">Nov</option>
<option value="December">Dec</option>
</select>
certificate(scanned copy of UG certificate)
<input class="text_field" name="UG_marks" placeholder="Marks" type="file" value="">

<p> PG informations </p>
<input class="text_field" name="PG_sname" placeholder="School Name" type="text" value="">
<input class="text_field" name="PG_marks" placeholder="CGPA" type="text" value="">
<input class="text_field" name="PG_pyear" placeholder="Passing Year" type="text" value="">
<select class="options"name="PG_pmonth">
<option value="-1">--passing Month--</option>
<option value="January">Jan</option>
<option value="February">Feb</option>
<option value="March">Mar</option>
<option value="April">Apr</option>
<option value="May">May</option>
<option value="June">Jun</option>
<option value="July">Jul</option>
<option value="August">Aug</option>
<option value="September">Sep</option>
<option value="October">Oct</option>
<option value="November">Nov</option>
<option value="December">Dec</option>
</select>
certificate(scanned copy of PG certificate)
<input class="text_field" name="PG_marks" placeholder="Marks" type="file" value="">

<input id="pre_btn1" onclick="prev_step1()" type="button" value="Previous">
<input id="next_btn2" name="next" onclick="next_step2()" type="button" value="Next">



</fieldset>
<fieldset id="third">
<h2 class="title">Personal Details</h2>
<p class="subtitle">Step 3</p>
<input class="text_field" name="fname" placeholder="First Name" type="text">
<input class="text_field" name="lname" placeholder="Last Name" type="text">
<input class="text_field" name="fathersname" placeholder="Father's Name" type="text">
<input class="text_field" name="mothersname" placeholder="Mother's Name" type="text">
<input class="text_field" name="Mobile_Number" maxlength="10"  placeholder="Mobile_Number" type="text" value="">
(10 digit number)
<table  cellpadding = "5">
   <tr>
<td>DATE OF BIRTH</td>
 
<td>
<select name="Birthday_day" id="Birthday_Day">
<option value="-1">Day:</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
 
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
 
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
 
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
 
<option value="31">31</option>
</select>
 
<select id="Birthday_Month" name="Birthday_Month">
<option value="-1">Month:</option>
<option value="January">Jan</option>
<option value="February">Feb</option>
<option value="March">Mar</option>
<option value="April">Apr</option>
<option value="May">May</option>
<option value="June">Jun</option>
<option value="July">Jul</option>
<option value="August">Aug</option>
<option value="September">Sep</option>
<option value="October">Oct</option>
<option value="November">Nov</option>
<option value="December">Dec</option>
</select>
 
<select name="Birthday_Year" id="Birthday_Year">
 
<option value="-1">Year:</option>
<option value="2012">2012</option>
<option value="2011">2011</option>
<option value="2010">2010</option>
<option value="2009">2009</option>
<option value="2008">2008</option>
<option value="2007">2007</option>
<option value="2006">2006</option>
<option value="2005">2005</option>
<option value="2004">2004</option>
<option value="2003">2003</option>
<option value="2002">2002</option>
<option value="2001">2001</option>
<option value="2000">2000</option>
 
<option value="1999">1999</option>
<option value="1998">1998</option>
<option value="1997">1997</option>
<option value="1996">1996</option>
<option value="1995">1995</option>
<option value="1994">1994</option>
<option value="1993">1993</option>
<option value="1992">1992</option>
<option value="1991">1991</option>
<option value="1990">1990</option>
 
<option value="1989">1989</option>
<option value="1988">1988</option>
<option value="1987">1987</option>
<option value="1986">1986</option>
<option value="1985">1985</option>
<option value="1984">1984</option>
<option value="1983">1983</option>
<option value="1982">1982</option>
<option value="1981">1981</option>
<option value="1980">1980</option>
</select>
</td>
</tr>
  </table>


<label>Gender</label>
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
<input id="pre_btn2" onclick="prev_step2()" type="button" value="Previous">
<input class="submit_btn" onclick="validation(event)" type="submit" value="Submit">
</script>
</fieldset>
</form>
</div>
</div>
</body>
</html>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
