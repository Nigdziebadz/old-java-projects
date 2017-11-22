package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Last log of the last log on earth");

        //When
        String checkLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals(checkLog, "Last log of the last log on earth");
    }
}
