package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationsTestSuite {

    @Test
    public void testAveragePostsForUser() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        Calculations calculations = new Calculations();
        calculations.calculateAdvStatistics(statisticsMock);
        double averagePosts = calculations.getAveragePostsForUser();

        Assert.assertEquals(10, averagePosts, 0);
    }

    @Test
    public void testAverageCommentsForUser() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        Calculations calculations = new Calculations();
        calculations.calculateAdvStatistics(statisticsMock);
        double averageComments = calculations.getAverageCommentsForUser();

        Assert.assertEquals(20, averageComments, 0);
    }

    @Test
    public void testAverageCommentsForPost() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(350);
        Calculations calculations = new Calculations();
        calculations.calculateAdvStatistics(statisticsMock);
        double averageCommentsForPost = calculations.getAverageCommentsForPost();
        Assert.assertEquals(0.35 , averageCommentsForPost, 0.35);

    }
}
