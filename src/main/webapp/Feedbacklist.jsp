<%@page import="pojo.Feedback" %>
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
List<Feedback>flist=(List)session.getAttribute("flist");
%>
<%@include file="header.jsp" %>
<form action="">
<table border="1">
<caption>Feedback </caption>
<tr>
<th>EmailId</th>
<th>suggestion</th>
<th>Rank</th>
<th>Review</th>
</tr>
<%
  Iterator<Feedback>itr=flist.iterator();
  while(itr.hasNext()){
	  Feedback f=itr.next();
%>

<tr>
<td><%=f.getEmailid()%> </td>
<td><%=f.getSuggestion() %></td>
<td><%=f.getRank() %></td>
<td><%=f.getReview() %></td>
<td>
<a href="Feedback.jsp?FeedbackId=<%=f.getEmailid()%>"><button>add profile</button></a>
<a href="FeedbackId.jsp?FeedbackId=<%=f.getEmailid()%>"><button>delete profile</button></a>

</td>
<%} %>
</tr>
</table>
</form>
<%@include file="footer.jsp" %>
</body>
</html>