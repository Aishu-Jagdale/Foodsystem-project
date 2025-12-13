<%@page import="pojo.Customer" %>
<%@page import="Dao.CustomerDaoImpl" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
CustomerDaoImpl cd=new CustomerDaoImpl();
Customer c =cd.searchCustomerById("cEmailId");

%>
<%@include file="header.jsp" %>
<form action="food">

<table border="1">
 <caption>modify Registration</caption>
 
  <tr>
 <td><label>Existing EmailId:</label></td>
 <td><input type="email" name="cemail" id="cemail" placeholder="Enter EmailId" value="<%=c.getcEmailId()%> "disabled="disabled"></td>
 <td><span id="ferroremail" style="color: red" ></span>
  </tr>
  
   <tr>
<td><label>Enter password:</label></td>
 <td><input type="password" name="cpass" id="cpass"placeholder="enter password" value="<%=c.getcPassword()%>"disabled="disabled"></td>
 <td><span id="ferrorpass" style="color: red" ></span>
  </tr>
  
   <tr>
 <td><label>Enter Address:</label></td>
<td><input type="text" name="caddr"id="caddr" placeholder="enter Address" value="<%=c.getcAddress()%>"></td>
 <td><span id="ferroraddr" style="color: red" ></span>
 </tr>
 
  <tr>
 <td><label>Enter ContactNo:</label></td>
 <td><input type="number" name="ccont" id="ccont" placeholder="enter contactno" value="<%=c.getcContactNo()%>"></td>
 <td><span id="ferrorprice" style="color: red" ></span>
 </tr>
 </table>
 <button type="submit" name="action" value="customerupdate">registration update</button>
 <button type="reset">clear</button>
</form>
<%@include file="footer.jsp" %>
</body>
</html>