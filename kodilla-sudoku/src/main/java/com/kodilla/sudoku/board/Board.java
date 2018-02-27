package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for (int n = 0; n < 9; n++) {
            rows.add(new BoardRow());
        }
    }

    public List<BoardRow> getRows() {
        return rows;
    }

    public void setElement(int row, int col, Integer value) {
        rows.get(row).getCols().get(col).setValue(value);
        rows.get(row).getCols().get(col).getAllowedValues().clear();
    }

    public Integer getElement(int row, int col) {
        return rows.get(row).getCols().get(col).getValue();
    }

    @Override
    public String toString() {
        String s = "|===|===|===|===|===|===|===|===|===|";
        for (BoardRow row : rows) {
            s += "\n|";
            for (SudokuElement element : row.getCols()) {
                if (element.getValue() != SudokuElement.EMPTY) {
                    s += " " + element.getValue() + " |";
                } else {
                    s += "   |";
//                    s += "(" + element.getAllowedValues().size() + ")|";
                }
            }
            s += "\n|===|===|===|===|===|===|===|===|===|";
        }
        return s;
    }
}

