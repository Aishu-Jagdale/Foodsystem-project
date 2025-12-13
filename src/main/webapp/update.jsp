<%@page import="pojo.Food" %>
<%@page import="Dao.FoodDaoImpl" %>

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
FoodDaoImpl fd=new FoodDaoImpl();
int fid=Integer.parseInt(request.getParameter("fid"));
Food f=fd.searchFoodById(fid);
%>
<%@include file="header.jsp" %>
<form action="food" method="post">

<table border="1">
 <caption>Add Food</caption>
 
  <tr>
 <td><label>Existing Id:</label></td>
  <td><input type="text" name="fid" id="fid" placeholder="Enter FoodId" value="<%=f.getFoodId() %>"></td>
  <td><span id="ferrorname" style="color: red" ></span>
  </tr>
 
  <tr>
<td><label>Enter Name:</label></td>
 <td><input type="text" name="fname" id="fname"placeholder="enter name" value="<%=f.getfName()%>"></td>
 <td><span id="ferrorname" style="color: red" ></span>
  </tr>
  
   <tr>
 <td><label>Enter Type:</label></td>
<td><input type="text" name="fType"id="ftype" placeholder="enter type" value="<%=f.getfType()%>"></td>
 <td><span id="ferrortype" style="color: red" ></span>
 </tr>
 
  <tr>
 <td><label>Enter price:</label></td>
 <td><input type="text" name="fprice" id="fprice" placeholder="enter price" value="<%=f.getfPrice()%>"></td>
 <td><span id="ferrorprice" style="color: red" ></span>
  </tr>
  
   <tr>
 <td><label>Enter category:</label></td>
  <td><input type="text" name="fcat"  id="fcat"  placeholder="enter Quantity" value="<%=f.getfCategory() %>"></td>
 <td><span id="ferrorcat" style="color: red"></span>
 </tr>
 </table>
 <button type="submit" name="action" value="foodupdate">update</button>
 <button type="reset">clear</button>
</form>
<%@include file="footer.jsp" %>
</body>
</html>