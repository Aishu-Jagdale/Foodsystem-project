<%@page import="pojo.Food" %>

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
List<Food>flist=(List)session.getAttribute("flist");
%>
<%@include file="header.jsp" %>

<form action="">
<table border="1">
<caption>Food Menu</caption>
<tr>
<th>Id</th>
<th>Name</th>
<th>Type</th>
<th>price</th>
<th>category</th>
<%if(uEmail==null && aEmail!=null){%>
<th colspan="2">Action</th>
<%}%>
<% if(uEmail!=null && aEmail==null){%>
<th colspan="1">Action</th>
<%}

%>
</tr>
<%
  Iterator<Food>itr=flist.iterator();
  while(itr.hasNext()){
	  Food f=itr.next();
%>

<tr>
<td><%=f.getFoodId() %></td>
<td><%=f.getfName() %></td>
<td><%=f.getfType() %></td>
<td><%=f.getfCategory() %></td>
<td><%=f.getfPrice() %></td>
<%if(uEmail==null && aEmail!=null){ %>
<td>
<a href="updateFood.jsp?foodid=<%=f.getFoodId() %>"><button>update</button></a>
<a href="food?action='delete'&foodid=<%=f.getFoodId() %> %>"><button>Delete</button></a>
</td>
<%} %>
<%if(uEmail!=null && aEmail==null){%>
<td>
<a href="addcart.jsp?foodid=<%=f.getFoodId() %>"><button>add</button></a>
</td>
<%} %>
</tr>
<%} %>
</table>
</form>
<%@include file="footer.jsp" %>
</body>
</html>