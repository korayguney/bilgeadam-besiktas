<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet?name=Koray&surname=Guney">Hello Servlet</a>

<%
    String name = (String) request.getSession().getAttribute("username");
%>

<p>Hello <%=name %></p>
<br>
<a href="securelogout">Log out</a>

</body>
</html>