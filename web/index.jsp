<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/5/11
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1 align="center">Beer Selection page</h1>
<form method="POST"
      action="SelectBeer.do">
    Select beer charaveristics<p>
    Color:
    <select name="color" size="1">
        <option>light
        <option>amber
        <option>brown
        <option>dark
        </option>
    </select>
    <br><br>
    <center>
        <input type="SUBMIT">
    </center>
</form>
</body>
</html>