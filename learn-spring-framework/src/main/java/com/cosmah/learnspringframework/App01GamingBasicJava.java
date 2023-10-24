package com.cosmah.learnspringframework;

import com.cosmah.learnspringframework.game.GameRunner;
import com.cosmah.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args){

//        var game = new MarioGame();
//        var game = new superContraGame();
        var game = new PacmanGame(); //1.Object creation

        var gameRunner = new GameRunner(game);
        //2.Object creation and wiring dependencies
        //game is a dependency of GameRunner
        gameRunner.run();
    }
}
