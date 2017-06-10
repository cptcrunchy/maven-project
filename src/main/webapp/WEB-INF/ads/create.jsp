<%-- Created by cpt_crunch --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <jsp:include page="/WEB-INF/components/head.jsp">
        <jsp:param name="title" value="Create a new Ad" />
    </jsp:include>
<body>
<jsp:include page="/WEB-INF/components/navbar.jsp" />
<div class="container">
    <h1>Create a new Ad</h1>
    <form action="/ads/create" method="POST">
        <div class="form-group">
            <label for="title">Title</label>
            <input id="title" name="title" class="form-control" type="text" required />
        </div>
        <div class="form-group">
            <label for="description">Description</label>
            <textarea id="description" name="description" class="form-control" type="text"></textarea>
        </div>
        <input type="submit" class="btn btn-block btn-primary">
    </form>
</div>
</body>
</html>