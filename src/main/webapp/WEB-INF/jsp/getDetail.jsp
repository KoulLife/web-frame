<%@ page import="com.hansung.firstAssignment.entity.Courses" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="jakarta.faces.component.EditableValueHolder" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<% List<Courses> courses = (List<Courses>) request.getAttribute("courses"); %>
<% int size = courses.size(); %>

<h1>학기별 수강 내역</h1>

<table border="1">
  <tr>
    <th>년도</th>
    <th>학기</th>
    <th>교과목명</th>
    <th>교과구분</th>
    <th>담당교수</th>
    <th>학점</th>
  </tr>

  <%
    for(int i = 0; i < size; i++) {
      int year = courses.get(i).getYear();
      int sem = courses.get(i).getSemester();
      String name = courses.get(i).getCourseName();
      String type = courses.get(i).getCourFilter();
      String professor = courses.get(i).getProfessor();
      int score = courses.get(i).getGpa();
  %>

  <tr>
    <th><%= year %></th>
    <th><%= sem %></th>
    <th><%= name %></th>
    <th><%= type %></th>
    <th><%= professor %></th>
    <th><%= score %></th>
  </tr>

  <%}%>


</table>
</body>
</html>