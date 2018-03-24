package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationsTestSuite {

    @Test
    public void testCalculateAdvStatisticsWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        int quantity = 100;
        for(int i=0; i<quantity; i++) {
        String names = new String();
            users.add(names);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        Calculations calculations = new Calculations();

        int quantityOfUsers = calculations.getUsersQuantity();

        Assert.assertEquals(100, users.size());
    }


}
