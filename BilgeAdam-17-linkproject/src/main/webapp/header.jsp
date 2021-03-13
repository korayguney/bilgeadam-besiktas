<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="border: 1px solid; padding: 10px">

        <h3>My Links</h3>
        <c:if test="${empty username}">
            <form action="${pageContext.request.contextPath}/login" method="post">
                <table>
                    <tr>
                        <td>Username :</td>
                        <td><input type="text" name="username"></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" name="password"></td>
                    </tr>
                    <c:if test="${not empty wronglogin}">
                        <tr>
                            <td></td>
                            <td><img alt="captcha img" src="gencapt"></td>
                        </tr>
                        <tr>
                            <td>Captcha :</td>
                            <td><input type="text" name="captcha"></td>
                        </tr>
                    </c:if>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login"></td>
                    </tr>
                </table>
            </form>
            <a href="${pageContext.request.contextPath}/index">Home</a>
            <a href="register.jsp">Register</a>
        </c:if>
        <c:if test="${not empty error}">
            <p style="color: red">${error}</p>
        </c:if>
        <c:if test="${not empty username}">
            <p>Welcome ${username}</p>
            <a href="${pageContext.request.contextPath}/index">Home</a>
            <a href="${pageContext.request.contextPath}/mylinks">My Links</a>
            <a href="${pageContext.request.contextPath}/secure/postlink.jsp">Post Link</a>
            <a href="${pageContext.request.contextPath}/signout">Sign out</a>
        </c:if>


    </div>
</body>
</html>
