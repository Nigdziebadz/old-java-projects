package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    private Integer value;
    private List<Integer> allowedValues = new ArrayList<>();
    public final static int EMPTY = -1;

    public SudokuElement() {
        for (int i = 1; i < 10; i++) {
            allowedValues.add(i);
        }
        value = EMPTY;
    }

    public List<Integer> getAllowedValues() {
        return allowedValues;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

