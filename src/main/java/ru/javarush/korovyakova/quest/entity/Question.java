package ru.javarush.korovyakova.quest.entity;
import java.util.ArrayList;

public class Question{

    private ArrayList<String> questions = new ArrayList<>();
    public Question() {
        fillQuestions();
    }

    public ArrayList<String> getList() {
        return questions;
    }

    public void fillQuestions() {
        questions.add("Ты потерял память. Принять вызов НЛО?");
        questions.add("Ты принял вызов. Капитан предлагает подняться тебе на борт летающей тарелки. Твои действия");
        questions.add("Ты поднялся на борт. Тебя просят рассказать о себе...");
    }
}
