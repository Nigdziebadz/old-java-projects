package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> exterminatedNumbers = new ArrayList<>();
        for(Integer theNumber : numbers) {
            if (theNumber % 2 == 0) {
                exterminatedNumbers.add(theNumber);
            }
        }
        return exterminatedNumbers;
    }
}
