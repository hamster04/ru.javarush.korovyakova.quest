package ru.javarush.korovyakova.quest.entity;
import java.util.ArrayList;

public class Answer  {

    private ArrayList<String> answers = new ArrayList<>();

    public Answer() {
        fillAnswers();
    }

    public ArrayList<String> getList() {
        return answers;
    }

    public void fillAnswers() {
        answers.add("Принять вызов");
        answers.add("Подняться на борт");
        answers.add("Рассказать правду");
    }
}
