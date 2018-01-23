package com.kodilla.rps;

public class RPSRunner {
    private User user;
    private Comp comp;
    private int userScore;
    private int compScore;
    private int numberOfGames;

    public RPSRunner() {
        user = new User();
        comp = new Comp();
        userScore = 0;
        compScore = 0;
        numberOfGames = 1;
    }

    public static void main(String[] args) {
        RPSRunner rps = new RPSRunner();
        rps.getplayerName();
        rps.getNumberOfGames();
        rps.startGame();
    }

    public void startGame() {

        while (user.getSetNumberOfGames() > userScore && user.getSetNumberOfGames() > compScore) {
            int userInput = user.getInput();
            if (userInput == Logic.NEW_GAME) {
                userScore = 0;
                compScore = 0;
                numberOfGames = 1;
                continue;
            }
            if (userInput == Logic.EXIT) {
                break;
            }

            Logic.logic(user.getName(), userInput);
            int compInput = comp.getInput();
            Logic.logic("computer", compInput);
            int compareResult = Logic.compareMoves(userInput, compInput);

            switch (compareResult) {
                case 0:
                    System.out.println("Tie!");
                    printStats();
                    break;
                case 1:
                    System.out.println(user.getName() + " Beats " + "computer" + " You won!");
                    userScore++;
                    printStats();
                    break;
                case -1:
                    System.out.println("Computer" + " Beats " + user.getName() + " You Lost!");
                    compScore++;
                    printStats();
                    break;
            }
            numberOfGames++;

            if (userScore == user.getSetNumberOfGames()) {
                System.out.println(user.getName() + " has won with " + user.getSetNumberOfGames());
                new RPSRunner();
            }
            if (compScore == user.getSetNumberOfGames()) {
                System.out.println("Computer " + " has won with " + user.getSetNumberOfGames());
                new RPSRunner();
            }
        }

        if (user.playAgain()) {
            RPSRunner rps = new RPSRunner();
            rps.getplayerName();
            rps.getNumberOfGames();
            rps.startGame();
        } else {
            printStats();
        }
    }

    public void getplayerName() {
        user.askName();
    }

    public void getNumberOfGames() {
        user.setNumberOfGames();
    }

    public void printStats() {
        System.out.println("\n" + "------------------------------------------");
        System.out.println("Number of games played is " + numberOfGames);
        System.out.println(user.getName() + "'s score " + userScore);
        System.out.println("Computers score " + compScore);
        System.out.println("\n" + "------------------------------------------");

    }
}