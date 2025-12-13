<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String uEmailId=(String)session.getAttribute("uEmailId"); %>
       <%@ include file="header.jsp" %>
  
       <form action="feedback" style="margin: 2% 0% 2% 34%">
          <table border="1">
            <caption><h1>Add FeedBack</h1></caption>
            
            <tr>
              <td><label>Enter EmailId:</label></td>
              <td><input type="email" name="fmail" id="fmail" placeholder="Enter EmailId" value="<%=uEmailId %>"disabled="disabled"></td>
              <td><span id="mailerror" style="color: red"></span></td>
            </tr>
            
            <tr>
              <td><label>Enter Review:</label></td>
              <td><input type="text" name="rev" id="rev" placeholder="Enter Review"></td>
              <td><span id="reverror" style="color: red"></span></td>
            </tr>
            
            <tr>
              <td><label>Enter Rank:</label></td>
              <td><input type="number" name="rank" id="rank" min="1" max="5"></td>
              <td><span id="rankerror" style="color: red"></span></td>
            </tr>
            
            <tr>
              <td><label>Enter Suggestion:</label></td>
              <td><input type="text" name="sugg" id="sugg" placeholder="Enter Suggestion"></td>
              <td><span id="suggerror" style="color: red"></span></td>
            </tr>
            
          </table>
          
          <button type="submit" name="action" value="addfeedback" style="margin-left: 13%">AddFeedback</button>
          <button type="reset">Clear</button>
          
       </form>
       
       <%@ include file="footer.jsp" %>
</body>
</html>