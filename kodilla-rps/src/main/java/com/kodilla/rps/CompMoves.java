package com.kodilla.rps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CompMoves {

    public int getInput() {
        List<Integer> computerMoves = Arrays.asList(1, 2, 3);
        Collections.shuffle(computerMoves);
        int compMove = computerMoves.get(0);
        return compMove;
    }
}