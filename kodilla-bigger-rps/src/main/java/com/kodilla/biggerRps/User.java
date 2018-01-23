package com.kodilla.biggerRps;

import java.util.Scanner;

public class User {
    private String name;
    private int declaredNumberOfGames;
    Scanner sc = new Scanner(System.in);

    public String getUserName() {
        return name;
    }

    public void askUserName() {
        System.out.println("What's your name?");
        name = sc.next();
    }

    public int getDeclaredNumberOfGames() {
        return declaredNumberOfGames;
    }

    public void setDeclaredNumberOfGames() {
        System.out.println("How many games do you wanna play?");
        declaredNumberOfGames = sc.nextInt();
    }

    public String getUserMove() {
        System.out.println("Select  (1)ROCK  (2)PAPER (3)SCISSORS (4)SPOCK (5)LIZARD");
        System.out.println("or press 'x' for exit, or 'n' for a new game");
        String input = sc.next();
        if (input == "1")
            return BiggerRSPLogic.ROCK;
        else if (input == "2")
            return BiggerRSPLogic.PAPER;
        else if (input == "3")
            return BiggerRSPLogic.SCISSORS;
        else if (input == "4")
            return BiggerRSPLogic.SPOCK;
        else if (input == "5")
            return BiggerRSPLogic.LIZARD;
        else if (input == "n")
            return BiggerRSPLogic.NEWGAME;
        else if (input == "x")
            return BiggerRSPLogic.EXIT;
        else {
            return getUserMove();
            }
        }


    public boolean anotherGame() {
        sc = new Scanner(System.in);
        System.out.print("Another game? Y/N");
        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }
}
