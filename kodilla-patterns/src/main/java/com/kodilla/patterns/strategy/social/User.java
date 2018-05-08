package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String sharePost() {
        return socialPublisher.share();
    }

    public void changeMedia(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
