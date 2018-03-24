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
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        Calculations calculations = new Calculations();

        List<String> listOfUsers = statisticsMock.usersNames();

        Assert.assertEquals(100, listOfUsers.size());
    }

    @Test
    public void testCalculateAdvStatisticsWithMock2() {
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 100;
        when(statisticsMock.postsCount()).thenReturn(posts);
        Calculations calculations = new Calculations();
        Assert.assertEquals(100, statisticsMock.postsCount());
    }


}
