<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>CatJava</title>
    <link rel="stylesheet" href="styleCss/test1.css">
    <link href="<link href=" https:
    //fonts.googleapis.com/css2?family= Pacifico & display = swap"
    rel="stylesheet">
</head>

<body>
<header class="header">
    <div class="container">
        <div class="header__inner">
            <div class="header__logo">Java Cat</div>
        </div>
    </div>
</header>

<div class="intro">
    <div class="container">
        <img class=img-pic" src="img\cats.jpg" width="400" alt="catJava">
        <h2>
            ${fail}
            <br>
            ФУФ!!! Ты открываешь глаза, а вокруг твои друзья! Это был всего лишь страшный сон!
            <br>
            <br>
            Ты снова самый обычный кот!
            <br>
        </h2>
        <form method="post">
            <input type="text" name="username" value="${username}" hidden>
            <input type="text" name="counter" value="${counter}" hidden>
            <button class="button-neon white" type="submit">Или всё таки нет?</button>
        </form>
    </div>
</div>
</body>
</html>
