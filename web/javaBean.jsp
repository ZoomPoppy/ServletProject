<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/5/19
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:include page=""
<jsp:useBean id="person" class="com.zz.web.NewPerson" scope="request"/>
Dog's name is <jsp:getProperty name="newPerson" property="dog"/>
</body>
</html>
