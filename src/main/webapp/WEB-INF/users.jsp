<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<jsp:include page="components/head.jsp">
    <jsp:param name="title" value="Users Page"/>
</jsp:include>

<body>
    <%--<jsp:include page="components/navbar.jsp" />--%>
    <div class="container">
        <h1>Users Page</h1>
        <c:forEach var="user" items="${users}">
            <p>models.User's name: ${user.username}</p>
        </c:forEach>
    </div>
</body>
</html>
