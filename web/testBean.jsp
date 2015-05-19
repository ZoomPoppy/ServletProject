<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/5/19
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:useBean id="person" type="com.zz.web.Emplore" class="com.zz.web.Emplore"></jsp:useBean>
<%--<% person.setName(request.getParameter("userName"));%>--%>
<jsp:setProperty name="person" property="*"/>
<%--<jsp:setProperty name="person" property="name" param="name"/>--%>
<%--<jsp:setProperty name="person" property="empID" param="empID"/>--%>
Person is:<jsp:getProperty name="person" property="name"/>
ID is:<jsp:getProperty name="person" property="empID"/>
</body>
/html>
