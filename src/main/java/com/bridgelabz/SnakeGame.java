package com.bridgelabz;

import java.util.Random;

public class SnakeGame {
    int position=0;
    public static void main(String[] args){
        System.out.println("Welcome To Snake And Ladder Game");
        SnakeGame snakeLadder = new SnakeGame();
        snakeLadder.rollDice();
    }
    public int rollDice(){
        Random random = new Random();
        int dice = (random.nextInt(6)+1);
        System.out.println("Die Roll Is :" + dice);
        return dice;
    }
}
