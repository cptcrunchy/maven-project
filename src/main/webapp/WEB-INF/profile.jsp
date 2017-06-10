<%-- Created by cpt_crunch--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <jsp:include page="components/head.jsp">
        <jsp:param name="title" value="User Profile" />
    </jsp:include>
<body>
    <jsp:include page="components/navbar.jsp" />
    <div class="container">
        <h1>Welcome, ${sessionScope.user}!</h1>
    </div>

</body>
</html>
