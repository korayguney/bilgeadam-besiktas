<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Post Link Page</title>
</head>
<body>

<jsp:include page="../header.jsp"/>
<br>
<div style="border: 1px solid; padding: 10px">
    <h3>Post Link Page</h3>

    <div>
        <form action="postlink" method="post">
            <table>
                <tr>
                    <td>Title :</td>
                    <td><input type="text" name="title"></td>
                </tr>
                <tr>
                    <td>URL :</td>
                    <td><input type="text" name="url"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Post"></td>
                </tr>
            </table>

        </form>

        <c:if test="${not empty error2}">
            <p style="color: #ff0000">${error2}</p>
        </c:if>
        <c:if test="${not empty success}">
            <p style="color: green">${success}</p>
        </c:if>


    </div>
</div>
<br>
<jsp:include page="../footer.jsp"/>

</body>
</html>
