package ru.javarush.korovyakova.quest.entity;
import java.util.ArrayList;
import java.util.Arrays;

public class Option {

    private ArrayList<ArrayList<String>> options = new ArrayList<>();

    public Option() {
        fillOptions();
    }

    public ArrayList<ArrayList<String>> getList() {
        return options;
    }

    public void fillOptions()     {
        options.add(new ArrayList<>(Arrays.asList("Принять вызов", "Мне нужно подумать...", "Отклонить вызов")));
        options.add(new ArrayList<>(Arrays.asList("Подняться на борт", "Убежать как можно быстрее")));
        options.add(new ArrayList<>(Arrays.asList("Солгать о себе", "Рассказать правду", "Сделать вид что не умеешь говорить")));
    }
}
