package ru.javarush.korovyakova.quest.entity;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    /*
     геттеры и сеттеры нет смысла тестировать
     https://stackoverflow.com/questions/16797665/unit-testing-of-setters-and-getters
     */

    @Test
    void fillQuestions() {
        Question question = new Question();
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Ты потерял память. Принять вызов НЛО?");
        expectedList.add("Ты принял вызов. Капитан предлагает подняться тебе на борт летающей тарелки. Твои действия");
        expectedList.add("Ты поднялся на борт. Тебя просят рассказать о себе...");
        assertEquals(question.getList(), (expectedList));
    }
}