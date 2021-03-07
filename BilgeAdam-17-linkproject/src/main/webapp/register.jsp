<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>

<jsp:include page="header.jsp"/>
<br>
<div style="border: 1px solid; padding: 10px">
    <h3>Register Page</h3>

    <div>
        <form action="register" method="post">
            <table>
                <tr>
                    <td>Username :</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password :</td>
                    <td><input type="password" name="password1"></td>
                </tr>
                <tr>
                    <td>Password(Again) :</td>
                    <td><input type="password" name="password2"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Sign Up"></td>
                </tr>
            </table>

        </form>

        <c:if test="${not empty error1}">
            <p style="color: #ff0000">${error1}</p>
        </c:if>
        <c:if test="${not empty success}">
            <p style="color: green">${success}</p>
        </c:if>


    </div>
</div>
<br>
<jsp:include page="footer.jsp"/>

</body>
</html>
