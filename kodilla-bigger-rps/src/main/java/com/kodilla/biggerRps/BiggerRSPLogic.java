package com.kodilla.biggerRps;

public class BiggerRSPLogic {

    public static final int ROCK = 1;
    public static final int LIZARD = 2;
    public static final int SPOCK = 3;
    public static final int SCISSORS = 4;
    public static final int PAPER = 5;
    public static final int EXIT = 6;
    public static final int NEWGAME = 7;

    public static void logic(String who, int s) {
        switch (s) {
            case BiggerRSPLogic.ROCK:
                System.out.print(who + " selected ROCK   ");
                break;
            case BiggerRSPLogic.LIZARD:
                System.out.print(who + " selected LIZARD   ");
                break;
            case BiggerRSPLogic.SPOCK:
                System.out.print(who + " selected SPOCK   ");
                break;
            case BiggerRSPLogic.SCISSORS:
                System.out.print(who + " selected SCISSORS   ");
                break;
            case BiggerRSPLogic.PAPER:
                System.out.print(who + " selected PAPER   ");
                break;
            default:
                break;
        }
    }

    public static int compareMoves(int userSelection, int computerSelection) {
        if (userSelection == ROCK && computerSelection == PAPER) {
            return 1;
        } else if (userSelection == ROCK && computerSelection == LIZARD) {
            return 1;
        } else if (userSelection == SCISSORS && computerSelection == PAPER) {
            return 1;
        } else if (userSelection == SCISSORS && computerSelection == LIZARD) {
            return 1;
        } else if (userSelection == LIZARD && computerSelection == PAPER) {
            return 1;
        } else if (userSelection == LIZARD && computerSelection == SPOCK) {
            return 1;
        } else if (userSelection == PAPER && computerSelection == SPOCK) {
            return 1;
        } else if (userSelection == PAPER && computerSelection == ROCK) {
            return 1;
        } else if (userSelection == SPOCK && computerSelection == SCISSORS) {
            return 1;
        } else if (userSelection == SPOCK && computerSelection == ROCK) {
            return 1;
        } else {
            return 0;
        }
    }
}
