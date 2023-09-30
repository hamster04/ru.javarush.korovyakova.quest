package ru.javarush.korovyakova.quest.entity;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class OutcomeTest {

    /*
     геттеры и сеттеры нет смысла тестировать
     https://stackoverflow.com/questions/16797665/unit-testing-of-setters-and-getters
     */

    @Test
    void fillOutcomes() {
        Outcome outcome = new Outcome();
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Тебя похитили насильно и будут ставить на тебе опыты...");
        expectedList.add("Серьезно? Думаешь смог убежать от них?");
        expectedList.add("Инопланетяне тебя раскусили и кинули в клетку для подопытных...");
        assertEquals(outcome.getList(), (expectedList));
    }
}