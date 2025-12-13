<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
 <form action="customer" style="margin: 2% 0% 2% 34%">
 <table border="1">
 <caption>Registration</caption>
 
 <tr>
 <td><label>Enter Name:</label></td>
 <td><input type="text" name="cname" id="cname" placeholder="Enter Name"></td>
 <td><span id="cnameemail" style="color: red" ></span>
 </tr>
 
 <tr>
 <td><label>Enter EmailId:</label></td>
 <td><input type="email" name="cemail" id="cemail" placeholder="Enter EmailId"></td>
 <td><span id="cerroremail" style="color: red" ></span>
 </tr>
 
 <tr>
<td><label>Enter password:</label></td>
 <td><input type="password" name="cpass" id="cpass"placeholder="enter password"></td>
 <td><span id="cerrorpass" style="color: red" ></span></td>
 </tr>
 
 <tr>
 <td><label>Enter Address:</label></td>
<td><input type="text" name="caddr"id="caddr" placeholder="enter Address"></td>
 <td><span id="cerroraddr" style="color: red" ></span>
</tr>

<tr>
 <td><label>Enter ContactNo:</label></td>
 <td><input type="number" name="ccont" id="ccont" placeholder="enter contactno"></td>
 <td><span id="ferrorcont" style="color: red" ></span></td>
 </tr>
 </table>
 <button type="submit" name="action" value="addCustomer" style="margin-left: 13%">Registration</button>
 <button type="reset">clear</button>
</form>
<%@include file="footer.jsp" %>
 
</body>
</html>