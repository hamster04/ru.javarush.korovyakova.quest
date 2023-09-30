package ru.javarush.korovyakova.quest.repository;

import ru.javarush.korovyakova.quest.entity.Answer;
import ru.javarush.korovyakova.quest.entity.Option;
import ru.javarush.korovyakova.quest.entity.Outcome;
import ru.javarush.korovyakova.quest.entity.Question;

import java.util.ArrayList;

public class Game {

    private int id = 0;
    private Question question = new Question();
    private Option option = new Option();
    private Answer answer = new Answer();
    private Outcome outcome = new Outcome();


    public int getId() {
        return id;
    }
    public void incrementId() {
        ++ id;
    }
    public String getCurrentQuestion() {
        return question.getList().get(id);
    }
    public String getCurrentAnswer() {
        return answer.getList().get(id);
    }
    public ArrayList<String> getCurrentOptions() {
        return option.getList().get(id);
    }
    public String getCurrentOutcome() {
        return outcome.getList().get(id);
    }
    public boolean hasNextQuestion() {
        return id < question.getList().size();
    }
    public boolean checkAnswer(String answer) {
        return getCurrentAnswer().equals(answer);
    }
    public int getQuestionNumber() {
        return id + 1;
    }

}
