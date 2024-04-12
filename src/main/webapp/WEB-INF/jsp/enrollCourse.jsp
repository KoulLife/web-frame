<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<sf:form method="post" action="${pageContext.request.contextPath}/enroll-course" modelAttribute="courseDto">
  <h1>수강 신청하기</h1>
  <hr>


  <table class="formtable">

    <tr>
      <td class="label">교과코드</td>
      <td><sf:input class="control" type="text" path="courseCode"/>
        <br/>
        <sf:errors path="courseCode"/>
      </td>
    </tr>

    <tr>
      <td class="label">교과목명</td>
      <td><sf:input class="control" type="text" path="courseName"/>
        <br/>
        <sf:errors path="courseName"/>
      </td>
    </tr>

    <tr>
      <td class="label">교과구분</td>
      <td><sf:input class="control" type="text" path="courseFilter"/>
        <br/>
        <sf:errors path="courseFilter"/>
      </td>
    </tr>

    <tr>
      <td class="label">담당교수</td>
      <td><sf:input class="control" type="text" path="professor"/>
        <br/>
        <sf:errors path="professor"/>
      </td>
    </tr>

    <tr>
      <td class="label">학점</td>
      <td><sf:input class="control" type="text" path="gpa"/>
        <br/>
        <sf:errors path="gpa"/>
      </td>
    </tr>

  </table>

  <tr>
    <td></td>
    <td><input type="submit" value="등록"></td>
  </tr>

</sf:form>
</body>
</html>