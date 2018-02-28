package com.kodilla.sudoku.input;

import java.util.Scanner;

public class UserDialogs {

    public static String getOneData() {

        Scanner scanner = new Scanner(System.in);
        String result;

        while(true) {
            System.out.println("Type value in format XYV (X: 0-8, Y: 0-8, V: 1-9) " +
                    "or type Q to quit and resolve Sudoku. (E - load example data)");

            result = scanner.nextLine();
            if (result.equalsIgnoreCase("Q")) {
                break;
            }
            if (result.equalsIgnoreCase("E")) {
                break;
            }
            if (result.length() == 3) {
                break;
            }
        }
        return result;
    }
}
