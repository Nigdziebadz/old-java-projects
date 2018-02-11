package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public static final Integer EMPTY = -1;
    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for (int n = 0; n < 9; n++); {
            rows.add(new BoardRow());
        }
    }

    public int getNumber(int row, int column) {
        return rows.get(row).getNumber(column);
    }

    public void setNumber(int row, int column, int number) {
        rows.get(row).setNumber(column, number);
    }
}

