package ru.javarush.korovyakova.quest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.mockito.Mockito.*;

class InitServletTest {

    @Test
    void doPost() throws IOException, ServletException {
        // mock для запроса
        HttpServletRequest request = mock(HttpServletRequest.class);
        // mock для ответа
        HttpServletResponse response = mock(HttpServletResponse.class);
        // mock для сессии
        HttpSession session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        // mock для RequestDispatcher (перенаправление на jsp-файл)
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        when(request.getRequestDispatcher("/quest.jsp")).thenReturn(dispatcher);
        // запускаем сервлет
        InitServlet initServlet = new InitServlet();
        initServlet.doPost(request, response);
        // тестим на вызовы методов (1 раз)
        verify(session, times(1)).getAttribute("name");
        verify(session, times(1)).getAttribute("counter");
        verify(dispatcher, times(1)).forward(request, response);
    }
}