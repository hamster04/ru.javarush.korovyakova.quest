package ru.javarush.korovyakova.quest.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Game game = new Game();
    Repository repository = new Repository();

    @Test
    void getCurrentQuestion() {
        assertEquals(game.getCurrentQuestion(), repository.getCurrentQuestion());
    }

    @Test
    void getCurrentOptions() {
        assertEquals(game.getCurrentOptions(), repository.getCurrentOptions());
    }

    @Test
    void getCurrentAnswer() {
        assertEquals(game.getCurrentAnswer(), repository.getCurrentAnswer());
    }

    @Test
    void getCurrentOutcome() {
        assertEquals(game.getCurrentOutcome(), repository.getCurrentOutcome());
    }

    @Test
    void checkAnswer() {
        String parameter = "Uncorrect";
        assertEquals(game.checkAnswer(parameter), repository.checkAnswer(parameter));
    }

    @Test
    void getId() {
        assertEquals(game.getId(), repository.getId());
    }

    @Test
    void incrementId() {
        game.incrementId();
        int expectedNumber = game.getId();
        repository.incrementId();
        int result = repository.getId();
        assertEquals(expectedNumber, result);
    }

    @Test
    void getQuestionNumber() {
        assertEquals(game.getQuestionNumber(), repository.getQuestionNumber());
    }

    @Test
    void hasNextQuestion() {
        assertEquals(game.hasNextQuestion(), repository.hasNextQuestion());
    }
}