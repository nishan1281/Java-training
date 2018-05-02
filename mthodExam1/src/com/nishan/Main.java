package com.nishan;

public class Main
{

    public static void main(String[] args)
    {
        int position = calcualteHighScorePostion(1000);
        displayHighScorePosition("nishan",position);

        position = calcualteHighScorePostion(900);
        displayHighScorePosition("nishan",position);

        position = calcualteHighScorePostion(400);
        displayHighScorePosition("nishan",position);

        int newPosition = calcualteHighScorePostion(50);
        displayHighScorePosition("mishal",newPosition);
    }

    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName + " managed to get into position "
                +position + " on the high score table.");
    }

    public static int calcualteHighScorePostion(int score)
    {
        if (score>=1000){return 1;}
        else if (500<=score && score<1000){return 2;}
        else if (100<=score && score<500){return 3;}
        else return 4;
    }
}
