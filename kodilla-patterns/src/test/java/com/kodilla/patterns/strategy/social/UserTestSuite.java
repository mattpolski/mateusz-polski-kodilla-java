package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        User mark = new Millenials("Mark");
        User tom = new YGeneration("Tom");
        User john = new ZGeneration("John");

        String markMedia = mark.sharePost();
        String tomMedia = tom.sharePost();
        String johnMedia = john.sharePost();

        Assert.assertEquals("Facebook", markMedia);
        Assert.assertEquals("Twitter", tomMedia);
        Assert.assertEquals("Snapchat", johnMedia);

    }

    @Test
    public void testIndividualSharingStrategy() {

        User mark = new Millenials("Mark");

        mark.changeMedia(new TwitterPublisher());
        String markMedia = mark.sharePost();

        Assert.assertEquals("Twitter", markMedia);

    }
}
