<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Comment Tag</h1>
<!-- This is HTML Comment -->
<%-- This is JSP Comment --%>
<h1>Expression Tag</h1>
<p><%= 5*7*Math.PI %></p>

<h1>Scriptlet Tag</h1>
<% for(int i=0;i<10;i++) { %>
<%= i %>
<% } %>

<h1>Declaration Tag</h1>
<%! int a = 0; %>
<%= a++ %>
</body>
</html>