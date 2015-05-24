<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/5/24
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page errorPage="errorPage.jsp" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

About to be bad.....
<c:catch var="myException">
  <% int x = 10/0;%>
</c:catch>
<c:if test="${myException != null}">
  There was  an exception : ${myException.message}<br/>
</c:if>
if you see this  you are survived
</body>
</html>
