<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tea and Meal - Free CSS Template</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%
 String uEmail=(String)session.getAttribute("uEmail");
 String aEmail=(String)session.getAttribute("aEmail");
%>
 <div id="templatemo_container">
  <div id="templatemo_header">
   <div id="site_title"></div>
  </div>
  <!-- end of header -->

  <div id="templatemo_menu">
  <%if (uEmail==null && aEmail==null){ %>
   <ul>
    <li><a href="index.jsp"><b>Home</b></a></li>
    <li><a href="food"><b>Menu</b></a></li>    
    <li><a href="login.jsp"><b>Login</b></a></li>
    <li><a href="addCustomer.jsp"><b>Registration</b></a></li>
      <li><a href="contactUs.jsp"><b>ContactUs</b></a></li>
    
   </ul>
  <%}%>
  <%if(uEmail==null && aEmail!=null){ %>
   <ul>
       <li><a href="index.jsp"><b>Home</b></a></li>
    <li><a href="food"><b>Menu</b></a></li>
    <li><a href="addfood.jsp"><b>AddFood</b></a></li>
    <li><a href="customerlist.jsp"><b>Customers</b></a></li>
    <li><a href="feedbacklist.jsp"><b>FeedBack</b></a></li>
    <li><a href="changepass.jsp"><b>changepassword</b></a></li>
    <li><a href="login"><b>Logout</b></a></li>
   </ul> 
  <% }%>
  <%if(uEmail!=null && aEmail==null){ %>
   <ul>
       <li><a href="index.jsp"><b>Home</b></a></li>
    <li><a href="food"><b>Menu</b></a></li>
        <li><a href="cart"><b>Viewcart</b></a></li>
    <li><a href="addFeedback.jsp"><b>FeedBack </b></a></li>
    <li><a href="changepass.jsp"><b>chagepass</b></a></li>
    <li><a href="contactUs.jsp"><b>ContactUs</b></a></li>
    <li><a href="login"><b>Logout</b></a></li>
   </ul> 
  <% }%>
  </div>
</body>
</html>