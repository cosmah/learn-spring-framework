package com.cosmah.learnspringframework.game;

public class GameRunner {

    private GamingConsole game;

    //constructor
    public GameRunner(GamingConsole game) {

        this.game = game;
    }
    public void run() {
        System.out.println("Running game: "+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
