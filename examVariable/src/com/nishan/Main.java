package com.nishan;

public class Main{

    public static void main(String[] args) {

        boolean gameOver = false;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 500;
        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your high score is : " + highScore);

    }

    public static int calculateScore (boolean gameOver, int score,  int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            return finalScore;
        }
        else return -1;

    }

}