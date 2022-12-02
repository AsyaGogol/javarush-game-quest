package ru.javarush.catJava.servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.javarush.catJava.data.Question;
import ru.javarush.catJava.repository.Questions;
import ru.javarush.catJava.repository.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DispatcherServlet", value = "/hello")
public class DispatcherServlet extends HttpServlet {
    private static final Logger log = LogManager.getLogger(DispatcherServlet.class);
    Users users;
    Questions questions;

    @Override
    public void init()  {
        log.info("Start DispatcherServlet");
        users = new Users(DispatcherServlet.class.getClassLoader().getResourceAsStream("users.json"));
        questions = new Questions(DispatcherServlet.class.getClassLoader().getResourceAsStream("questions.json"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        String username = request.getParameter("username");
        int counter = 0;
        if (users.getNameAndCountUser().containsKey(username)) {
            counter = users.getUser(username).getCountOfGamesPlayed();
            log.info("the player{} is back in the game. number of games {}", username, counter);
        } else {
            users.update(username);
            log.info("new players: {} started the game {}", username, this);
        }

        request.setAttribute("counter", counter);
        request.setAttribute("username", username);
        request.setAttribute("nextQuestion", 1);

        getServletContext().getRequestDispatcher("/begin.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String counter = request.getParameter("counter");
        String stringNextQuestion = request.getParameter("nextQuestion");
        Long nextQuestion = 0L;

        nextQuestion = nextStep(request, response, username, stringNextQuestion, nextQuestion);

        Question question = questions.getQuestion(nextQuestion);

        request.setAttribute("counter", counter);
        request.setAttribute("username", username);
        request.setAttribute("idNextQuestion", nextQuestion+1);
        request.setAttribute("questionId", nextQuestion);
        request.setAttribute("question", question.getTextQuestion());
        request.setAttribute("answers", question.getAnswers());
        request.setAttribute("fail", question.getFail());
        request.setAttribute("image", question.getPathToImage());

        getServletContext().getRequestDispatcher("/game.jsp").forward(request, response);
    }

    private Long nextStep(HttpServletRequest request, HttpServletResponse response, String username, String stringNextQuestion, Long nextQuestion) throws ServletException, IOException {
        if (stringNextQuestion.equals("wrong")) {
            String whyFail = request.getParameter("fail");
            request.setAttribute("fail", whyFail);
            users.incrementCountOfGamesPlayer(username);
            getServletContext().getRequestDispatcher("/defeat.jsp").forward(request, response);
            log.info("user: {} lost  {}", username, this);
        } else {
            nextQuestion = Long.parseLong(stringNextQuestion);
            log.info("user {} moved on to the next question {}", username, this);
        }

        if (nextQuestion == questions.getIdToQuestion().size()) {
            users.incrementCountOfGamesPlayer(username);
            getServletContext().getRequestDispatcher("/win.jsp").forward(request, response);
            log.info("user: {} won {}", username, this);
        }
        return nextQuestion;
    }
}
