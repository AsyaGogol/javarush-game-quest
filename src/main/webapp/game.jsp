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
        <jsp:include page="statistic.jsp"></jsp:include>
        <img class=img-pic" srcset="${image}" width="400" alt="catJava">
        <h3>
            ${question}


            <form>
                <input type="hidden" name="username" value="${username}" hidden>
                <input type="hidden" name="counter" value="${counter}" hidden>

                <c:forEach var="answersList" items="${answers}">
                    <c:if test="${answersList.trueAnswer}">
                        <input type="radio" name="nextQuestion" value="${idNextQuestion}"> ${answersList.answer}
                        <br>
                    </c:if>

                    <c:if test="${!answersList.trueAnswer}">
                        <input type="hidden" name="fail" value="${fail}">
                        <input type="radio" name="nextQuestion" value="wrong"> ${answersList.answer}
                        <br>
                    </c:if>
                </c:forEach>

                <button class="button-neon white" type="submit">Ответить</button>

            </form>
        </h3>
    </div>

</div>
</body>
</html>
