<%--
  Created by IntelliJ IDEA.
  User: FULLSTACK
  Date: 2023-06-02
  Time: 오후 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <link href="<c:url value="/resources/css/bootstrap-grid.min.css"/>"
    rel="stylesheet">
    <title>도서목록</title>//http://localhost:3000/books
</head>
<body>
<nav class="navbar navbar-expand navbar-dark bg-dark">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="./home">Home</a>
        </div>
    </div>
</nav>
<div class="jumbotron">
    <div class="container">
        <h1 class="display-3">도서목록</h1>
    </div>
</div>
<div class="container">
    <div class="row" align="center">
        <c:forEach items="${bookList}" var="book">
            <div class="col-md-4">
                <h3>${book.name}</h3>
                <p>${book.author}
                <br>${book.publisher} | ${book.releaseDate}   </p>
                 <p align="left">${fn:substring(book.description,0,100)}....</p>
                    <p>${book.unitPrice}원

            </div>

        </c:forEach>
    </div>
    <hr>
    <footer>
        <p>&copy;BookMarket</p>
    </footer>
</div>
</body>
</html>
