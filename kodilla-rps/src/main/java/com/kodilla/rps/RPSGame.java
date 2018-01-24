package com.kodilla.rps;

public class RPSGame {
    private UserMoves user;
    private CompMoves comp;
    private UserComm userComm;
    private int userScore;
    private int compScore;
    private int numberOfGamesPlayed;

    public void getplayerName() {
        userComm.askName();
    }

    public void getNumberOfGames() {
        userComm.setNumberOfGames();
    }

    public RPSGame() {
        user = new UserMoves();
        comp = new CompMoves();
        userComm = new UserComm();
        userScore = 0;
        compScore = 0;
        numberOfGamesPlayed = 1;
    }

    public void runGame() {
        RPSGame rps = new RPSGame();
        rps.getplayerName();
        rps.getNumberOfGames();
        rps.startGame();
    }

    public void startGame() {

        while (userComm.getSetNumberOfGames() > userScore
                && userComm.getSetNumberOfGames() > compScore) {
            int userInput = user.getInput();
            if (userInput == Logic.NEW_GAME) {
                userScore = 0;
                compScore = 0;
                numberOfGamesPlayed = 1;
                continue;
            }
            if (userInput == Logic.EXIT) {
                break;
            }

            Logic.logic(userComm.getName(), userInput);
            int compInput = comp.getInput();
            Logic.logic("computer", compInput);
            int compareResult = Logic.compareMoves(userInput, compInput);

            switch (compareResult) {
                case 0:
                    System.out.println("Tie!");
                    printStats();
                    break;
                case 1:
                    System.out.println(userComm.getName() + " Beats "
                            + "computer" + " You won!");
                    userScore++;
                    printStats();
                    break;
                case -1:
                    System.out.println("Computer" + " Beats "
                            + userComm.getName() + " You Lost!");
                    compScore++;
                    printStats();
                    break;
            }
            numberOfGamesPlayed++;

            if (userScore == userComm.getSetNumberOfGames()) {
                System.out.println(userComm.getName() + " has won with "
                        + userComm.getSetNumberOfGames());
                new RPSRunner();
            }
            if (compScore == userComm.getSetNumberOfGames()) {
                System.out.println("Computer " + " has won with "
                        + userComm.getSetNumberOfGames());
                new RPSRunner();
            }
        }

        if (userComm.playAgain()) {
            RPSGame rps = new RPSGame();
            rps.getplayerName();
            rps.getNumberOfGames();
            rps.startGame();
        } else {
            printStats();
        }
    }

    public void printStats() {
        System.out.println("\n" + "------------------------------------------");
        System.out.println("Number of games played is " + numberOfGamesPlayed);
        System.out.println(userComm.getName() +"'s score " + userScore);
        System.out.println("Computers score " + compScore);
        System.out.println("\n" + "------------------------------------------");
    }
}

