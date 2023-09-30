package ru.javarush.korovyakova.quest.repository;

import java.util.ArrayList;

public class Repository {

    private Game game = new Game();

    public String getCurrentQuestion() {
        return game.getCurrentQuestion();
    }

    public ArrayList<String> getCurrentOptions() {
        return game.getCurrentOptions();
    }

    public String getCurrentAnswer() {
        return game.getCurrentAnswer();
    }

    public String getCurrentOutcome() { return game.getCurrentOutcome(); }

    public boolean checkAnswer(String answer) {
        return game.checkAnswer(answer);
    }

    public int getId() {
        return game.getId();
    }

    public void incrementId() { game.incrementId();}

    public int getQuestionNumber() {
        return game.getQuestionNumber();
    }
    public boolean hasNextQuestion() {
        return game.hasNextQuestion();
    }
}
