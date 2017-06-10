<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/WEB-INF/components/head.jsp">
    <jsp:param name="title" value="Register User" />
</jsp:include>
<body>
<%@include file="/WEB-INF/components/navbar.jsp" %>

<div class="container">
    <form action="/register" method="POST">
        <h2>New User Registration</h2>
        <%--@declare id="username"--%>
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" name="username" value='${param.username}' placeholder="username">
        </div>
        <%--@declare id="email"--%>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" name="email" value='${param.email}' placeholder="enter email here">
        </div>

        <%--@declare id="password"--%>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" value='${param.password}'>
        </div>

        <input type="submit" class="btn btn-primary" value="Register">
    </form>

</div>

</body>
</html>