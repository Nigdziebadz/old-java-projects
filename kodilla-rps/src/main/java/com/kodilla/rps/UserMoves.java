package com.kodilla.rps;
import java.util.Scanner;

public class UserMoves {
    Scanner sc = new Scanner(System.in);

    public int getInput() {
        System.out.println("Select  (1)ROCK  (2)PAPER (3)SCISSORS");
        System.out.println("or press 'x' for exit, or 'n' for a new game");
        while(true) {
            String s = sc.nextLine().toLowerCase();
            switch (s) {
                case "1":
                    return Logic.ROCK;
                case "2":
                    return Logic.PAPER;
                case "3":
                    return Logic.SCISSORS;
                case "x":
                    return Logic.EXIT;
                case "n":
                    return Logic.NEW_GAME;
            }
        }
    }
}