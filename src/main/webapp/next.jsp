<%--
  Created by IntelliJ IDEA.
  User: Evelina
  Date: 05.09.2022
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Next</title>
    <link href="static/main.css" rel="stylesheet">
</head>
<body>
<h1><b>Продолжаем</b></h1>
<h3>Кэп, ты должен верно ответить на следующие вопросы! У тебя всего <b>одна</b> попытка!</h3>
<h4>Если где-то ты допустишь <u>ошибку</u>, то тебя <i>выбросят</i> в открытый космос! Ты же в курсе, кэп, что пираты стали очень изобретательны...</h4>
<div>

<form action="next" method="POST">
    <h3>Вопрос №1.</h3>
    <h4><b>На какой планете Солнечной системы наблюдается самый крупный циклон?</b></h4>
    <input type = "checkbox" name="answer" value="yes">Юпитер<br>
    <input type = "checkbox" name="answer" value="no">Нептун<br>

    <h3>Вопрос №2.</h3>
    <h4><b>На поверхности какой планеты Солнечной системы самая высокая температура?</b></h4>
    <input type = "checkbox" name="answer" value="no">Меркурий<br>
    <input type = "checkbox" name="answer" value="yes">Венера<br>

    <h3>Вопрос №3.</h3>
    <h4><b>Какая планета Солнечной системы имеет спутник с самой плотной атмосферой?</b></h4>
    <input type = "checkbox" name="answer" value="yes">Сатурн<br>
    <input type = "checkbox" name="answer" value="no">Юпитер<br><br>

    <input type = "submit" value="Ответить">

</form>
</div>
<div class = "statistic">
    <h3>Statistic:</h3>
    <h5>IP address : ${ip}</h5>
    <h5>Name : ${firstname}</h5>
    <h5>Games : ${count}</h5>
    <h5>Number of players : ${games}</h5>

</div>
</body>
</html>
