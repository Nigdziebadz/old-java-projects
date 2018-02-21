package com.kodilla.sudoku;

import com.kodilla.sudoku.board.Board;

import static com.kodilla.sudoku.board.SudokuElement.EMPTY;

public class SudokuGame {

    private Board board = new Board();

    public Board getBoard() {
        return board;
    }

    public boolean resolveSudoku() {
        boolean result = false;
        boolean modified = true;

        while(modified) {
            modified = false;
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (board.getRows().get(row).getCols().get(col).getValue() == EMPTY) {
                        removeAllFromRow(row, col);
                        removeAllFromCol(row, col);
//                        removeAllFromSquare(row, col);
                    }
                }
            }
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (board.getRows().get(row).getCols().get(col).getAllowedValues().size() == 1) {
                        Integer value = board.getRows().get(row).getCols().get(col).getAllowedValues().get(0);
                        board.getRows().get(row).getCols().get(col).setValue(value);
                        modified = true;
                    }
                }
            }
            System.out.println(board);
        }
        return result;
    }

    private void removeAllFromCol(int row, int col) {
        for (int scannedCol = 0; scannedCol < 9; scannedCol++) {
            Integer value = board.getRows().get(row).getCols().get(scannedCol).getValue();
            if (value != EMPTY ) {
                board.getRows().get(row).getCols().get(col).getAllowedValues().remove(value);
            }
        }
    }

    private void removeAllFromRow(int row, int col) {
        for (int scannedRow = 0; scannedRow < 9; scannedRow++) {
            Integer value = board.getRows().get(scannedRow).getCols().get(col).getValue();
            if (value != EMPTY ) {
                board.getRows().get(row).getCols().get(col).getAllowedValues().remove(value);
            }
        }
    }
}
