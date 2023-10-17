package com.cosmah.learnspringframework.game;

public class PacmanGame implements GamingConsole{
    public void up(){
        System.out.println("High");
    }

    public void down(){
        System.out.println("Low");
    }

    public void left(){
        System.out.println("Back");
    }

    public void right(){
        System.out.println("Forward");
    }
}
