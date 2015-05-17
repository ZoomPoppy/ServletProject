<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/5/17
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
the frients who share your hobby of
<%= request.getAttribute("hobby")%>
<%! String fred = "fred";
    String Pradeep = "Pradeep";
    String philippe = "prilippe";
    String xujc = "xujiacheng";
    String xzx = "xiezongxin";
    String wm = "Wangmian";
%>
<%! ArrayList<String> hobby(String hb){
  ArrayList<String> list = new ArrayList<String>();
  if (hb.equals("horse skiing")){
    list.add(fred);
    list.add(Pradeep);
    list.add(philippe);
    return list;
  }
  else if (hb.equals("extreme knitting")){
    list.add(xujc);
    list.add(wm);
    list.add(xzx);
    list.add(Pradeep);
    return list;
  }
  else if (hb.equals("alpine scuba")){
    list.add(fred);
    list.add(Pradeep);
    list.add(xujc);
    list.add(wm);
    return list;
  }
  else if (hb.equals("speed dating")){
    list.add(wm);
    return list;
  }
  return null;
} %>
<br><br>
<p>----------------</p>
<%ArrayList<String> list = hobby((String)request.getAttribute("hobby"));
  Iterator iterator = list.iterator();
  while (iterator.hasNext()){
    out.println(iterator.next()+"<br>");
  }
%>


</body>
</html>
