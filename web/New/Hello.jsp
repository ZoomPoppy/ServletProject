<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/5/22
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
Welcome to our page!
<% if (request.getParameter("userName")==null){ %>
  <jsp:forward page="HandleIt.jsp"/>
<% } %>
Hello ${param.userName}
</body>
</html>
