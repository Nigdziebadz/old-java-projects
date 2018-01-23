package com.kodilla.biggerRps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AI {
    public String getAIMove() {
        List<String> AIMoves = Arrays.asList("1", "2", "3", "4", "5");
        Collections.shuffle(AIMoves);
        String AIMove = AIMoves.get(0);
        return AIMove;
    }
}
