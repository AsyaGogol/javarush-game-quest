<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

        <img class="img-pic" src="img\assistants.jpg" alt="Картинка">

        <div class="intro__inner">


            <h1 class="header__inner">Привет, кот!</h1>
            <br>
            <h2>Твоя хозяйка ушла и оставила тебя дома. Но экран ее ноутбука не погас! <br>
                Надо срочно проверить что там!</h2>
            <br>

            <form action="hello" method="post">
                <h3>Введи свою кличку:</h3> <input class="input-name" name="username"/>
                <button class="button-neon white" type="submit">КЛАЦ!</button>

            </form>
        </div>
    </div>
</div>
</body>
</html>
