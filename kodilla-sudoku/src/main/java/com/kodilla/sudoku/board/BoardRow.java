package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Integer> numbers = new ArrayList<>();

    public BoardRow() {
        for (int n = 0; n < 9; n++ ) {
            numbers.add(Board.EMPTY);
        }
    }

    public int getNumber(int index) {
        return numbers.get(index);
    }

    public void setNumber(int index, int number) {
        numbers.add(index, number);
        numbers.remove(index+1);

    }
}
