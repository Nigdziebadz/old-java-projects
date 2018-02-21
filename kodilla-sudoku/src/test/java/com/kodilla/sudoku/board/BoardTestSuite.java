package com.kodilla.sudoku.board;

import com.kodilla.sudoku.SudokuGame;
import org.junit.Test;

public class BoardTestSuite {

    private void generateTestData(Board board) {

    }

    @Test
    public void testBoard() {
        SudokuGame sudokuGame = new SudokuGame();
        generateTestData(sudokuGame.getBoard());
        System.out.println(sudokuGame.getBoard());
        sudokuGame.resolveSudoku();

    }
}
