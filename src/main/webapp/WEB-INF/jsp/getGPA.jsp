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
<% int total = 0; %>
<% ArrayList<String> kList = new ArrayList<String>(); %>
<% ArrayList<Integer> vList = new ArrayList<Integer>(); %>

<h1>학년별 이수학점 조회</h1>

<%
  List<Courses> courses = (List<Courses>) request.getAttribute("courses");
  Map<String, Integer> groupedCourses = new HashMap<String, Integer>();

  for (Courses course : courses) {
    String key = course.getYear() + "," + course.getSemester();
    if(groupedCourses.containsKey(key) == false){
      groupedCourses.put(key, course.getGpa());
    }
    else {
      int tmp = groupedCourses.get(key);
      tmp += course.getGpa();

      System.out.println("&&&&&" + key + " : " + tmp);

      groupedCourses.put(key, tmp);
    }
  }
%>

<table border="1">
  <tr>
    <th>년도</th>
    <th>학기</th>
    <th>취득학점</th>
    <th>상세보기</th>
  </tr>

  <%
    for (Map.Entry<String, Integer> entrySet : groupedCourses.entrySet()) {
      kList.add(entrySet.getKey());
      vList.add(entrySet.getValue());
      total += entrySet.getValue();
    }
  %>

  <% for (int i = 0; i < groupedCourses.size(); i++){
    int tmp = kList.get(i).indexOf(",");
    String year = kList.get(i).substring(0,tmp);
    String sem = kList.get(i).substring(tmp + 1);
    int score = groupedCourses.get(kList.get(i));
    System.out.println("year : " + year + " sem : " + sem + " score " + score);
  %>
  <tr>
    <th><%= year %></th>
    <th><%= sem %></th>
    <th><%= vList.get(i) %></th>
    <th><a href="/gpa-details/<%=year%>/<%=sem%>">링크</a></th>
  </tr>
<% } %>

  <tr>
    <td>총계</td>
    <td></td>
    <td><%= total %></td>
    <td></td>
  </tr>
</table>
</body>
</html>