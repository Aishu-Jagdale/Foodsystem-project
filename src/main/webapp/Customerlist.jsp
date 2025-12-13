<%@page import="pojo.Customer" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
List<Customer>flist=(List)session.getAttribute("clist");
%>
<%@include file="header.jsp" %>
<form action="">
<table border="1">
<caption>Customer </caption>
<tr>
<th>EmailId</th>
<th>password</th>
<th>Address</th>
<th>ContactNo</th>
</tr>
<%
  Iterator<Customer>itr=flist.iterator();
  while(itr.hasNext()){
	  Customer c=itr.next();
%>

<tr>
<td><%=c.getcEmailId()%> </td>
<td><%= c.getcPassword()%></td>
<td><%=c.getcAddress() %></td>
<td><%=c.getcContactNo() %></td>
<td>
<a href="Customer.jsp?CustomerId=<%=c.getcEmailId()%>"><button>add profile</button></a>
<a href="Customer.jsp?CustomerId=<%=c.getcEmailId()%>"><button>delete profile</button></a>

</td>
<%} %>
</tr>
</table>
</form>
<%@include file="footer.jsp" %>
</body>
</html>