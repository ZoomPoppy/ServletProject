<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/5/17
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%! int count = 0; %>
<%! int doubelCount(){
  count = count*2;
  return  count;
} %>
<%= doubelCount() %>
</body>
</html>
