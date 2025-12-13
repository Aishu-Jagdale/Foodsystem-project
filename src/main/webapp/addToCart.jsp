<%@page import="pojo.Food" %>
<%@page import="Dao.FoodDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
function total() {
	let price=document.getElementById("fprice").value;
	let quan=document.getElementById("fquan").value;
    document.getElementById("tprice").value=price*quan;
}

</script>
</head>
<body>

<%String uEmailId=(String)session.getAttribute("uEmailId"); 

FoodDaoImpl  fd=new FoodDaoImpl();
int fid=Integer.parseInt(request.getParameter("foodid"));
Food f=fd.searchFoodById(fid);
%>
 <form action="cart" style="margin-left: 2% 0% 2% 33%">
 <table border="1">
 <caption>Add Food</caption>
 <tr>
 <td><label> EmailId:</label></td>
 <td><input type="email" name="email" id="email" value="<%=uEmailId%>"></td>
 <td><span id="emailerror" style="color: red" ></span>
 </td>
 </tr>
 
 <tr>
<td><label>FoodId:</label></td>
 <td><input type="text" name="fid" id="fid" value="<%=f.getFoodId()%>"></td>
 <td><span id="fiderror" style="color: red" ></span>
 </td>
 </tr>
 
 <tr>
 <td><label> Food Name:</label></td>
 <td><input type="text" name="fname"id="fname" value="<%=f.getfName()%>"></td>
 <td><span id="ferroraddr" style="color: red" ></span>
</td>
</tr>

 <tr>
 <td><label>Food Price:</label></td>
 <td><input type="text" name="fprice" id="fprice" value="<%=f.getfPrice()%>"></td>
<td><span id="ferrorprice" style="color: red" ></span>
 </td>
 </tr>
 
 <tr>
 <td><label>Food Category:</label></td>
 <td><input type="number" name="fquan" id="fquan" value="<%=f.getfCategory()%>"></td>
<td><span id="fcaterror" style="color: red" ></span>
 </td>
 </tr>
 </table>
 <button type="submit" name="action" value="addToCart" style="margin-left: 13%">AddToCart</button>
 <button type="reset">clear</button>
</form>
<%@include file="footer.jsp" %>
 
</body>
</html>