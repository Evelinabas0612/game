<%--
  Created by IntelliJ IDEA.
  User: Evelina
  Date: 05.09.2022
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start Game</title>
    <link href="static/main.css" rel="stylesheet">
</head>
<body>
<h1>Кэп, ты должен пройти тест, чтобы мы убедились, что ты настоящий <b>капитан</b>, а не самозванец!</h1>
<h1><b>Готов?</b></h1>
<form action="start" method="POST">
    <input type = "radio" name="answer" value="yes">Принять вызов<br>
    <input type = "radio" name="answer" value="no">Отклонить вызов<br><br>
    <input type = "submit" value="Ответить">

</form>
<div class = "statistic">
    <h3>Statistic:</h3>
    <hr>
    <h5>IP address : ${ip}</h5>
    <hr>
    <h5>Name : ${firstname}</h5>
    <hr>
    <h5>Games : ${count}</h5>
    <hr>
    <h5>Number of players : ${games}</h5>

</div>
</body>
</html>
