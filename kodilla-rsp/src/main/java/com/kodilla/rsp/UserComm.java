package com.kodilla.rsp;

import java.util.Scanner;

public class UserComm {
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
        System.out.println("How many games do you want to play?");
        numberOfGames = sc.nextInt();
    }

    public boolean playAgain() {
        sc = new Scanner(System.in);
        System.out.print("Play again? Y/N");
        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }
}
