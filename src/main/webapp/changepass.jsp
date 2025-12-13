<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.jsp" %>
 <form action="login"> 
  <table border="1"> 
 <caption><h1>Change Password</h1></caption>
   
   <% if(uEmail==null && aEmail!=null){ %>
     <tr>
     <td><label>Enter EmailId:</label></td>
   <td><input type="text" name="email" id="email" placeholder="Enter EmailId" disabled="disabled"></td>
   <td><span id="emailerror" style="color: red"></span></td>  
     </tr>
   <%} %>
   
   <% if(uEmail!=null && aEmail==null){ %>
     <tr>
     <td><label>Enter EmailId:</label></td>
   <td><input type="text" name="email" id="email" placeholder="Enter EmailId" disabled="disabled"></td>
   <td><span id="emailerror" style="color: red"></span></td>  
     </tr>
   <%} %>
  
   <tr>
    <td><label>Enter Old Password:</label></td>
  <td><input type="password" name="pass" id="pass" placeholder="Enter Old Password"></td>
  <td><span id="passerror" style="color: red"></span></td>  
   </tr>
   
   <tr>
    <td><label>Enter New Password</label></td>
  <td><input type="password" name="pass" id="pass" placeholder="Enter New Password"></td>
  <td><span id="passerror" style="color: red"></span></td>  
   </tr>
   
   <tr>
    <td><label>Enter Confirm Password:</label></td>
  <td><input type="password" name="pass" id="pass" placeholder="Enter Confirm Password"></td>
  <td><span id="passerror" style="color: red"></span></td>  
   </tr>
   </table>
   <button type="submit" name="action" value="changepass">ChangePass</button>
   <button type="reset">Clear</button>
   
</form>   
<%@ include file="footer.jsp" %>
</body>
</html>