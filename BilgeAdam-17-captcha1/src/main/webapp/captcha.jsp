<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Captcha Example for Java</title>
</head>
<body>
    <div align="center">
        <hr/>
        <h3>Login Page with Captcha</h3>
        <hr/>
        <%
            String captcha = (String) request.getSession().getAttribute("newCapt");
        %>

        Captcha : <b><%=captcha%></b>

        <br>
        <br>

        <form action="control" method="post">

            <input type="text" name="captcha" />
            <input type="submit" value="Send" />

        </form>

        <hr/>


    </div>



</body>
</html>
