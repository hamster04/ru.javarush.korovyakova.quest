package ru.javarush.korovyakova.quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ru.javarush.korovyakova.quest.repository.Repository;

import java.io.IOException;

@WebServlet(name = "LogicServ", value = "/logicServ")
public class LogicServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String radio = request.getParameter("inlineRadioOptions");
        if (radio == null) request.getRequestDispatcher("/quest.jsp").forward(request, response);
        else {
            Repository repository = (Repository) session.getAttribute("repository");
            boolean isRightAnswer = repository.checkAnswer(radio);
            String outcome = repository.getCurrentOutcome();
            repository.incrementId();// след вопрос
            if (isRightAnswer && repository.hasNextQuestion()) {
                session.setAttribute("currentQuestion", repository.getCurrentQuestion());
                session.setAttribute("currentOptions", repository.getCurrentOptions());
                session.setAttribute("gameId", repository.getQuestionNumber());
                response.sendRedirect("/quest.jsp");
            }
            else {
                String s = isRightAnswer ? "Вы молодец и все сделали правильно!" : outcome;
                session.setAttribute("outcome", s);
                session.setAttribute("result", isRightAnswer);
                response.sendRedirect("/restart.jsp");
            }
        }
    }
}