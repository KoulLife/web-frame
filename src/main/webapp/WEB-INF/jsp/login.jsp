<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h1>로그인</h1>
<sf:form method="post" action="${pageContext.request.contextPath}/login">
  <table class="formtable">

    <tr>
      <td class="label">USER NAME</td>
      <td><input class="control" type="text" name="username"/>
        <br/>
<%--        <sf:errors path="username"/>--%>
      </td>
    </tr>

    <tr>
      <td class="label">PASSWORD</td>
      <td><input class="control" type="text" name="password"/>
        <br/>
<%--        <sf:errors path="password"/>--%>
      </td>
    </tr>

    <tr>
      <td></td>
      <td><input type="submit" value="로그인"></td>
    </tr>

  </table>
</sf:form>
</body>
</html>