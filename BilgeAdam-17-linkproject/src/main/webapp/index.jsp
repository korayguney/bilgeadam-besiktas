<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Link Sharing App</title>
</head>
<body>
    <jsp:include page="header.jsp"/>
    <br>
    <div style="border: 1px solid; padding: 10px">
        <h3>All Link Posted</h3>
        <div>
            <form action="search" method="post">
                <input type="text" name="searchedtext" placeholder="Enter your keywords" />
                <input type="submit" value="Search" />
            </form>
            <a href="${pageContext.request.contextPath}/index">Reset</a>
        </div>

        <div>
            <table>
                <tr>
                    <th>Title</th>
                    <th>Link</th>
                    <th>Date</th>
                    <th>Views</th>
                    <th>Posted By</th>
                </tr>
                <c:forEach items="${links}" var="link">
                    <tr>
                        <td>${link.title}</td>
                        <td><a href="${pageContext.request.contextPath}/viewcount?link=${link.postedlink}">${link.postedlink}</a></td>
                        <td>${link.postdate}</td>
                        <td align="center">${link.viewcount}</td>
                        <td>${link.username}</td>
                    </tr>
                </c:forEach>
            </table>

        </div>
    </div>
    <br>
    <jsp:include page="footer.jsp"/>
</body>
</html>
