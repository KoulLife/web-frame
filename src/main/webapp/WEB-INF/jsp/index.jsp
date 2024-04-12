<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h1>학사 정보 시스템</h1>
<table class="formtable">
  <tr>
    <td class="label">로그인</td>
    <td><input type="button" value="login" onclick="location.href='login'"></td>
  </tr>
  <tr>
    <td class="label">학년별 이수 학점 조회</td>
    <td><input type="button" value="submit" onclick="location.href='get-gpa'"></td>
  </tr>
  <tr>
    <td class="label">수강 신청하기</td>
    <td><input type="button" value="submit" onclick="location.href='enroll-course'"></td>
  </tr>
  <tr>
    <td class="label">수강 신청 조회</td>
    <td><input type="button" value="submit" onclick="location.href='view-course'"></td>
  </tr>
</table>
</body>
</html>