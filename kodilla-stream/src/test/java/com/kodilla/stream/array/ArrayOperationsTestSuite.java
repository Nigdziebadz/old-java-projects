package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {16, 2, 3, 4, 5, 1, 2, 3, 5, 6,
                16, 2, 3, 4, 5, 1, 2, 3, 5, 6};

        //When
        double result = ArrayOperations.getAverage(numbers);


        //Then
        Assert.assertEquals(4.7, result, 0);

    }
}
