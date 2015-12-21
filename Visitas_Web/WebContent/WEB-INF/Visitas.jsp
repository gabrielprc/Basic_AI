<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Visitas</title>
</head>
<body>
	<% if (request.getAttribute("visita") != null) {%>
		Última visita: <%= request.getAttribute("visita") %>
	<% } else { %>
		Primera visita.
	<% } %>
</body>
</html>