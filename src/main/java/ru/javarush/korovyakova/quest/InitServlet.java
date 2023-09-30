package ru.javarush.korovyakova.quest;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import ru.javarush.korovyakova.quest.repository.Repository;

@WebServlet(name = "InitServlet", value = "/init")
public class InitServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String name = (String) session.getAttribute("name");
        if (name == null) {
            name = request.getParameter("name");
            session.setAttribute("name", name);
        }

        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            session.setAttribute("counter", 0);
        } else session.setAttribute("counter", ++counter);

        Repository repository = new Repository();

        session.setAttribute("currentQuestion", repository.getCurrentQuestion());
        session.setAttribute("currentOptions", repository.getCurrentOptions());
        session.setAttribute("gameId", repository.getQuestionNumber());
        session.setAttribute("repository", repository);
        request.getRequestDispatcher("/quest.jsp").forward(request, response);
    }
}