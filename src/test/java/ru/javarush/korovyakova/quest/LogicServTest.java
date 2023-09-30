package ru.javarush.korovyakova.quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import ru.javarush.korovyakova.quest.repository.Game;
import ru.javarush.korovyakova.quest.repository.Repository;
import java.io.IOException;
import static org.mockito.Mockito.*;


class LogicServTest {

    @Test
    void doPost() throws ServletException, IOException {
        Game game = new Game();
        // mock для запроса
        HttpServletRequest request = mock(HttpServletRequest.class);
        // mock для ответа
        HttpServletResponse response = mock(HttpServletResponse.class);
        // mock для сессии
        HttpSession session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        // создаем нужные ответы для проверки на нужные методы для request
        when(request.getParameter("inlineRadioOptions")).thenReturn(game.getCurrentAnswer());
        Repository repository = mock(Repository.class);
        // создаем нужные ответы для проверки на нужные методы для repository
        when(repository.checkAnswer(game.getCurrentAnswer())).thenReturn(true);
        when(repository.getCurrentOutcome()).thenReturn(game.getCurrentOutcome());
        when(repository.hasNextQuestion()).thenReturn(true);
        game.incrementId();
        when(repository.getCurrentQuestion()).thenReturn(game.getCurrentQuestion());
        when(repository.getCurrentOptions()).thenReturn(game.getCurrentOptions());
        when(repository.getQuestionNumber()).thenReturn(game.getQuestionNumber());
        //устанавливаем mock-сессии mock-репозиторий
        when(session.getAttribute("repository")).thenReturn(repository);
        // запускаем сервлет
        LogicServ logicServ = new LogicServ();
        logicServ.doPost(request, response);
        // тестим на вызовы методов (1 раз)
        verify(request, times(1)).getParameter("inlineRadioOptions");
        verify(session, times(1)).getAttribute("repository");
        verify(repository, times(1)).checkAnswer("Принять вызов");
        verify(repository, times(1)).getCurrentOutcome();
        verify(repository, times(1)).incrementId();
        verify(repository, times(1)).hasNextQuestion();
        verify(repository, times(1)).getCurrentQuestion();
        verify(repository, times(1)).getCurrentOptions();
        verify(repository, times(1)).getQuestionNumber();
        verify(response, times(1)).sendRedirect("/quest.jsp");

    }
}