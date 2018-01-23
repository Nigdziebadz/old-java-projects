package com.kodilla.biggerRps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AI {
    public int getAIMove() {
        List<Integer> AIMoves = Arrays.asList(1, 2, 3, 4, 5);
        Collections.shuffle(AIMoves);
        int AIMove = AIMoves.get(0);
        return AIMove;
    }
}
