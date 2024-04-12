<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<sf:form method="post" action="${pageContext.request.contextPath}/create-user" modelAttribute="userDto">
  <table class="formtable">

    <tr>
      <td class="label">USER NAME</td>
      <td><sf:input class="control" type="text" path="username"/>
      <br/>
      <sf:errors path="username"/>
      </td>
    </tr>
    <tr>
      <td class="label">EMAIL</td>
      <td><sf:input class="control" type="text" path="email"/>
        <br/>
        <sf:errors path="email"/>
      </td>
    </tr>
    <tr>
      <td class="label">PASSWORD</td>
      <td><sf:input class="control" type="text" path="password"/>
        <br/>
        <sf:errors path="password"/>
      </td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="새 제안"></td>
    </tr>

  </table>
</sf:form>
</body>
</html>