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

 <form action="food" method="post" style="margin-left: 2% 0% 2% 33%">
 <table border="1">
 <caption>Add Food</caption>
 <tr>
 <td><label>Enter Name:</label></td>
 <td><input type="text" name="fname" placeholder="enter name"></td>
 <td><span id="ferrorname" style="color: red" ></span></td>
 </tr>
 
 <tr>
 <td><label>Enter Type:</label></td>
 <td><input type="text" name="fType" placeholder="enter type"></td>
 <td><span id="ferrortype" style="color: red" ></span></td>
 </tr>
 
  <tr>
 <td><label>Enter price:</label></td>
 <td><input type="text" name="fprice" placeholder="enter price"></td>
 <td><span id="ferrorprice" style="color: red" ></span></td>
  </tr>
  
   <tr>
 <td><label>Enter category:</label></td>
 <td><input type="text" name="fcat" placeholder="enter category"></td>
 <td><span id="ferrorcat" style="color: red"></span></td>
 </tr>
 </table>
 <button type="submit" name="action" value="addfood" style="margin-left: 13%">AddFood</button>
 <button type="reset">clear</button>
</form>
<%@include file="footer.jsp" %>
</body>
</html>