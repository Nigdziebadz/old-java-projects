import java.util.Scanner;

public class User {
    private String name;
    private int declaredNumberOfGames;
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void askUserName(String name) {
        System.out.println("What's your name?");
        name = sc.next();
    }

    public int getDeclaredNumberOfGames() {
        return declaredNumberOfGames;
    }

    public void setDeclaredNumberOfGames(int declaredNumberOfGames) {
        System.out.println("How many games do you wanna play?");
        declaredNumberOfGames = sc.nextInt();
    }

    public int getInput() {
        System.out.println("Select  (1)ROCK  (2)PAPER (3)SCISSORS (4)SPOCK (5)LIZARD");
        System.out.println("or press 'x' for exit, or 'n' for a new game");
        while(true) {
            String s = sc.nextLine().toLowerCase();
            switch (s) {
                case "1":
                    return BiggerRSPLogic.ROCK;
                case "2":
                    return BiggerRSPLogic.PAPER;
                case "3":
                    return BiggerRSPLogic.SCISSORS;
                case "4":
                    return BiggerRSPLogic.SPOCK;
                case "5":
                    return BiggerRSPLogic.LIZARD;
                case "x":
                    return BiggerRSPLogic.EXIT;
                case "n":
                    return BiggerRSPLogic.NEWGAME;
                default:
                    System.out.println("Wrong selection, try again");

            }
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
