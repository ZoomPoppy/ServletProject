<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/5/12
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1 align="center">Beer Recommendation JSP</h1>
<p></p>
<%
  List styles = (List)request.getAttribute("styles");
  Iterator it = styles.iterator();
  while (it.hasNext()){
    out.print("<br>try : " +it.next());
  }
%>
</body>
</html>
