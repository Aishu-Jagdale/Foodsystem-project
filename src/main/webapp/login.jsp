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
<form action="login" method="post" style="margin: 2% 0% 2% 34%">
 <table border="1">
   <caption><h1 style="color:green;">Login</h1></caption>
   <tr>
    <td><label>Select Type:</label></td>
    <td>
      <select name="type" id="type">
       <option>select</option>
        <option value="admin">Admin</option>
        <option value="user">User</option>
      </select>
    </td>
    <td><span id="selecterror" style="color:red"></span></td>
   </tr>
   <tr>
    <td><label>Enter EmailId:</label></td>
  <td><input type="email" name="email" id="email" placeholder="Enter EmailId"></td>
  <td><span id="emailerror" style="color: red"></span></td>  
   </tr>
   
   <tr>
    <td><label>Enter Password:</label></td>
  <td><input type="password" name="pass" id="pass" placeholder="Enter Password"></td>
  <td><span id="passerror" style="color: red"></span></td>  
   </tr>
 </table>
 <button type="submit" name="action" value="login">Login</button>
 <button type="reset">Clear</button>
</form>
<%@ include file="footer.jsp" %>

       
</body>
</html>
