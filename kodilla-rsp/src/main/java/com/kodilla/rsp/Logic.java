package com.kodilla.rsp;

public class Logic {

    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int EXIT = -1;
    public static final int NEW_GAME = -2;

    public static void logic(String who, int s) {
        switch (s) {
            case Logic.ROCK:
                System.out.print(who + " selected ROCK   ");
                break;
            case Logic.PAPER:
                System.out.print(who + " selected PAPER   ");
                break;
            case Logic.SCISSORS:
                System.out.print(who + " selected SCISSORS   ");
                break;
            default:
                break;
        }
    }

    public static int compareMoves(int userSelection, int computerSelection) {
    if(userSelection==computerSelection) return 0;
    switch (userSelection) {
        case ROCK:
            return (computerSelection == SCISSORS ? 1 : -1);

        case PAPER:
            return (computerSelection == ROCK ? 1 : -1);

        case SCISSORS:
            return (computerSelection == PAPER ? 1 : -1);
    }
    return 0;
}
}