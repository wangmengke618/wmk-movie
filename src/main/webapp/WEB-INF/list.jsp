<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<table>
  <tr>
    <td>序号</td>
    <td>电影名称</td>
    <td>导演</td>
    <td>上映日期</td>
    <td>年代</td>
    <td>类型</td>
    <td>区域</td>
    <td>状态</td>
  </tr>
      <c:forEach items="${movies}" var="m" varStatus="i">
        <tr>
          <td>${i.count}</td>
          <td>${m.name}</td>
          <td>${m.actor}</td>
          <td>${m.uptime}</td>
          <td>${m.longtime}</td>
          <td>${m.years}</td>
          <td>${m.area}</td>
          <td>${m.status}</td>
        </tr>
      
      </c:forEach>
</table>
</body>
</html>