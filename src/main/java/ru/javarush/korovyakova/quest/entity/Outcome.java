package ru.javarush.korovyakova.quest.entity;
import java.util.ArrayList;

public class Outcome {

    private ArrayList<String> outcomes = new ArrayList<>();
    public Outcome() {
        fillOutcomes();
    }

    public ArrayList<String> getList() {
        return outcomes;
    }


    public void fillOutcomes()    {
        outcomes.add("Тебя похитили насильно и будут ставить на тебе опыты...");
        outcomes.add("Серьезно? Думаешь смог убежать от них?");
        outcomes.add("Инопланетяне тебя раскусили и кинули в клетку для подопытных...");
    }
}
