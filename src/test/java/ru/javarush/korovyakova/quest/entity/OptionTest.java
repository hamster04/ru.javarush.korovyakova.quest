package ru.javarush.korovyakova.quest.entity;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class OptionTest {

    /*
     геттеры и сеттеры нет смысла тестировать
     https://stackoverflow.com/questions/16797665/unit-testing-of-setters-and-getters
     */

    @Test
    void fillOptions() {
        Option option = new Option();
        ArrayList<ArrayList<String>> expectedList = new ArrayList<>();
        expectedList.add(new ArrayList<>(Arrays.asList("Принять вызов", "Отклонить вызов")));
        expectedList.add(new ArrayList<>(Arrays.asList("Подняться на борт", "Убежать как можно быстрее")));
        expectedList.add(new ArrayList<>(Arrays.asList("Солгать о себе", "Рассказать правду", "Сделать вид что не умеешь говорить")));
        assertEquals(option.getList(), (expectedList));
    }
}