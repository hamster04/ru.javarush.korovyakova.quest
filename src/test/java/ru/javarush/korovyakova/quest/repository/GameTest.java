package ru.javarush.korovyakova.quest.repository;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.javarush.korovyakova.quest.entity.Answer;
import ru.javarush.korovyakova.quest.entity.Option;
import ru.javarush.korovyakova.quest.entity.Outcome;
import ru.javarush.korovyakova.quest.entity.Question;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class GameTest {


    @Test
    void incrementId() {
        Game game = new Game();
        int expectedId = game.getId() + 1;
        game.incrementId();;
        assertEquals(expectedId, game.getId());
    }

    @Test
    void getCurrentQuestion() {
        Game game = new Game();
        Question question = new Question();
        String expectedCurrentQuestion = question.getList().get(game.getId());
        String result = game.getCurrentQuestion();
        assertEquals(expectedCurrentQuestion, result);
    }

    @Test
    void getCurrentAnswer() {
        Game game = new Game();
        Answer answer = new Answer();
        String expectedCurrentAnswer = answer.getList().get(game.getId());
        String result = game.getCurrentAnswer();
        assertEquals(expectedCurrentAnswer, result);
    }

    @Test
    void getCurrentOptions() {
        Game game = new Game();
        Option option = new Option();
        ArrayList<String> expectedCurrentOption = option.getList().get(game.getId());
        ArrayList<String> result = game.getCurrentOptions();
        assertEquals(expectedCurrentOption, result);
    }

    @Test
    void getCurrentOutcome() {
        Game game = new Game();
        Outcome outcome = new Outcome();
        String expectedCurrentOutcome = outcome.getList().get(game.getId());
        String result = game.getCurrentOutcome();
        assertEquals(expectedCurrentOutcome, result);
    }

    @Test
    void hasNextQuestion() {
        Game game = new Game();
        Question question = new Question();
        boolean expectedResult = game.getId() < question.getList().size();
        boolean result = game.hasNextQuestion();
        assertEquals(expectedResult, result);
    }

    @Test
    void checkAnswer() {
        Game game = new Game();
        Answer answer = new Answer();
        String parameter = answer.getList().get(game.getId());
        boolean expectedResult = answer.getList().get(game.getId()).equals(parameter);
        boolean result = game.checkAnswer(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void getQuestionNumber() {
        Game game = new Game();
        int expectedNumber = game.getId() + 1;
        int result = game.getQuestionNumber();
        assertEquals(expectedNumber, result);
    }

}