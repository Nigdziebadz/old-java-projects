package com.kodilla.biggerRps;

public class BiggerRSPRunner {
    private User user;
    private AI ai;
    private int userScore;
    private int aiScore;
    private int numberOfGames;

    public BiggerRSPRunner() {
        user = new User();
        ai = new AI();
        userScore = 0;
        aiScore = 0;
        numberOfGames = 1;
    }

    public static void main(String[] args) {
        BiggerRSPRunner rps = new BiggerRSPRunner();
        rps.getplayerName();
        rps.getNumberOfGames();
        rps.startGame();

    }

    public void startGame() {
        while(user.getDeclaredNumberOfGames() > userScore) {
            String userInput = user.getUserMove();
            BiggerRSPLogic.logic(user.getUserName(), userInput);
            String compInput = ai.getAIMove();
            BiggerRSPLogic.logic("AI", compInput);
            int compareResult = BiggerRSPLogic.compareMoves(userInput, compInput);

            switch (compareResult) {
                case 0:
                    System.out.println("Tie!");
                    printStats();
                    break;
                case 1:
                    System.out.println(user.getUserName() + " Beats " + "computer" + " You won!");
                    userScore++;
                    printStats();
                    break;
                case -1:
                    System.out.println("Computer" + " Beats " + user.getUserName() + " You Lost!");
                    aiScore++;
                    printStats();
                    break;
            }
            numberOfGames++;


            if (userScore == user.getDeclaredNumberOfGames()) {
                System.out.println(user.getUserName() + " has won with " + user.getDeclaredNumberOfGames());
                new BiggerRSPRunner();
            }
            if (aiScore == user.getDeclaredNumberOfGames()) {
                System.out.println("Computer " + " has won with " + user.getDeclaredNumberOfGames());
                new BiggerRSPRunner();
            }
        }

        if (user.anotherGame()) {
            System.out.println();
            startGame();
        } else {
            printStats();
        }
    }

    public void getplayerName() {
        user.askUserName();
    }

    public void getNumberOfGames() {
        user.setDeclaredNumberOfGames();
    }

    public void printStats() {
        System.out.println("\n" + "------------------------------------------");
        System.out.println("Number of games played is " + numberOfGames);
        System.out.println(user.getUserName() + "'s score " + userScore);
        System.out.println("Computers score " + aiScore);
        System.out.println("\n" + "------------------------------------------");

    }
}