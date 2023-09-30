package ru.javarush.korovyakova.quest.entity;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnswerTest {

    /*
     геттеры и сеттеры нет смысла тестировать
     https://stackoverflow.com/questions/16797665/unit-testing-of-setters-and-getters
     */

    @Test
    void fillAnswers() {
        Answer answer = new Answer();
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Принять вызов");
        expectedList.add("Подняться на борт");
        expectedList.add("Рассказать правду");
        assertEquals(answer.getList(), (expectedList));
    }
}