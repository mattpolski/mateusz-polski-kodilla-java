package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTestSuite {

    @Before
    public void addLog() {
        Logger.getInstance().log("First log");
    }

    @Test
    public void testGetLastLog() {
        String lastLog = Logger.getInstance().getLastLog();
        Assert.assertEquals(lastLog, "First log");
    }
}