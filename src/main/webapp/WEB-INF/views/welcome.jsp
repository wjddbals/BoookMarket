<%--
  Created by IntelliJ IDEA.
  User: FULLSTACK
  Date: 2023-06-01
  Time: 오후 4:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="./resources/css/bootsatrap.min.css" rel="stylesheet">
    <title>Welcome</title>
</head>
<body>

<p>${strapline}</p>

<nav class="navbar navbar-expand navbar-dark bg-dark">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="./home">Home</a>
        </div>
    </div>
</nav>
<div class="jumbotron">
    <div class="container">
        <h1 class="display-3">${greeting}</h1>
    </div>
</div>
<div class="container">
    <div class="text-center">
        <h3>${strapline}</h3>
    </div>
</div>
<footer class="container">
    <hr>
    <p>&copy;WebMarket</p>
</footer>

</body>
</html>
