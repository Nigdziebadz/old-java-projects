package com.kodilla.rps;
import java.util.Scanner;

public class User {
    private String name;
    private int numberOfGames;
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void askName() {
        System.out.println("Please enter your name");
        name = sc.next();
    }

    public int getSetNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames() {
        System.out.println("How many games you wanna play?");
        numberOfGames = sc.nextInt();
    }


    public int getInput() {
        System.out.println("Select  (1)ROCK  (2)PAPER (3)SCISSORS");
        System.out.println("or press 'x' for exit, or 'n' for a new game");
        int input = sc.nextInt();
        if (input == 1)
            return Logic.ROCK;
        else if (input == 2)
            return Logic.PAPER;
        else if (input == 3)
            return Logic.SCISSORS;
        else {
            getInput();
            return 0;
        }
    }

    public boolean playAgain() {
        sc = new Scanner(System.in);
        System.out.print("Do you want to play again? Y/N");
        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }
}