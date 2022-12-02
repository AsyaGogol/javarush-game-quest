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
        <img class="img-pic" src="img\catComp.jpg" width="500" alt="Картинка">

        <div class="intro__inner">


            <h1>Какой ты озорной! ${username} </h1>
            <h1>Ты увидел незнакомые символы и смог лишь прочитать слово JAVA</h1>
            <br>
            <h3>
                "Так вот почему моя хозяйка сыплет проклятия и ругается как сапожник!
                Это JAVA! Да любой кот справится!" - думает твой пушистный котелок.
                <br>
                <br>
                Пора покорять новые вершины, кроме люстр и шкафов!
            </h3>

            <form>
                <input type="text" name="username" value="${username}" hidden>
                <input type="text" name="counter" value="${counter}" hidden>
                <input type="text" name="nextQuestion" value="${nextQuestion}" hidden>
                <button class="button-neon white" type="submit">гуглить</button>
            </form>
        </div>
    </div>
</div>


<jsp:include page="statistic.jsp"></jsp:include>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous">
</script>
</form>
</div>
</div>
</div>
</body>
</html>
