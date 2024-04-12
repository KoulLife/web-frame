<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h1>학년별 이수학점 조회</h1>
<table border="1">
  <tr>
    <th>년도</th>
    <th>학기</th>
    <th>취득학점</th>
    <th>상세보기</th>
  </tr>
  <c:forEach var="course" items="${courses}">
    <tr>
      <td>${course.year}</td>
      <td>${course.semester}</td>
      <td>${course.gpa}</td>
      <td>링크</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>