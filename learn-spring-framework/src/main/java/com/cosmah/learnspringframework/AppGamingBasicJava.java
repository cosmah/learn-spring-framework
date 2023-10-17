package com.cosmah.learnspringframework;

import com.cosmah.learnspringframework.game.GameRunner;
import com.cosmah.learnspringframework.game.MarioGame;
import com.cosmah.learnspringframework.game.PacmanGame;
import com.cosmah.learnspringframework.game.superContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args){

//        var game = new MarioGame();
//        var game = new superContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
