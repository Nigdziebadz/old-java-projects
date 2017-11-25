package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    private Logger logger = Logger.getInstance();

    @Test
    public void testGetLastLog() {
        //Given
        logger.log("Last log of the last log on earth");

        //When
        String checkLog = logger.getLastLog();

        //Then
        Assert.assertEquals(checkLog, "Last log of the last log on earth");
    }
}
