<%@page import="pojo.Cart" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
function total(){
	let price=document.
}

</script>
</head>
<body>
<%
List<Cart>clist=(List)session.getAttribute("clist");
%>
<%@ include file="header.jsp" %>
        <form action="placholder">
          <table border="1">
             <caption><h1>Cart</h1></caption>
             <tr>
               <th>CartID</th>
               <th>EmailId</th>
               <th>FoodId</th>
               <th>FoodName</th>
               <th>Price</th>
               <th>Quantity</th>
               <th>TotalPrice</th>
             
               <th colspan="1">Action</th>
              
             </tr>
           <% 
              Iterator<Cart>itr=clist.iterator();
              while(itr.hasNext()){
            	Cart c=itr.next();  
           %>
             <tr>
               <td><%=c.getCartId() %></td>
               <td><%=c.getEmailId() %></td>
               <td><%=c.getFoodId() %></td>
               <td><%=c.getFoodName() %></td>
               
               <td><input type="text" name="fprice" id="fprice" value="<%=c.getPrice() %>"></td>
               <td><input type="number" name="fquan" id="fquan" value="<%=c.getQuantity() %>"></td>
               <td><input type="text" name="tprice" id="tprice" onclick="total()" value="<%=c.getTotalPrice() %>"></td>
               
  
               <td>
                 <a href="cart?action='delete'&cartid=<%=c.getCartId() %>"><Button>delete</Button></a>
               </td>
               
               </tr>
              <%} %>
               
          </table>
          <button type="submit" name="action" value="placeOrder">PlaceOrder</button>
        </form>
    <%@ include file="footer.jsp" %>
</body>
</html>