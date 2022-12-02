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
        <img class="img-pic" src="img\neo.jpg" width="700" alt="Картинка">
        <div class="intro__inner">

            <h2>Ты смог!</h2>
            <br>
            <h3>За это тебя превратили в человека! Ну, чтобы удобнее было печатать!</h3>

            <form method="post">
                <input type="text" name="username" value="${username}" hidden>
                <input type="text" name="counter" value="${counter}" hidden>
                <button class="button-neon white" type="submit">Если хочешь снова стать котом, тебе сюда!</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
