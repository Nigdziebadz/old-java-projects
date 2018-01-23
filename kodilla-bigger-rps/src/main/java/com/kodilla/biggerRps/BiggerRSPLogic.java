package com.kodilla.biggerRps;

public class BiggerRSPLogic {

    public static final String ROCK = "1";
    public static final String LIZARD = "2";
    public static final String SPOCK = "3";
    public static final String SCISSORS = "4";
    public static final String PAPER = "5";
    public static final String EXIT = "x";
    public static final String NEWGAME = "n";

    public static void logic(String who, String s) {
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

    public static int compareMoves(String userSelection, String computerSelection) {
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
