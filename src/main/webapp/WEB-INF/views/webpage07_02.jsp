<%--
  Created by IntelliJ IDEA.
  User: FULLSTACK
  Date: 2023-06-01
  Time: 오후 4:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>form Tag</title>
</head>
<body>
<h3>회원가입</h3>

    <p>아이디 :${member.id}
    <p>비밀번호 :${member.password}
    <p>거주지:${member.city}
    <p>성별 : ${member.sex}
    <p 취미: <c:forEach items="${member.hobby}" var="hobby">
    [<c:out value="${hobby}"/>]
    </c:forEach>
</body>
</html>