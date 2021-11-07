package com.pb.leonov.hw6.Example.s03enum;

public class Game {
    private GameLevel gameLevel;

    public Game(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }

    public GameLevel getGameLevel() {
        return gameLevel;
    }

    public void start() {
        System.out.println("Игра запущена на уровне " + gameLevel);
    }
}
