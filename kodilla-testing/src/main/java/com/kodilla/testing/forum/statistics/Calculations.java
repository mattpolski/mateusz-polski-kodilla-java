package com.kodilla.testing.forum.statistics;

public class Calculations {
    Statistics statistics;

    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsForUser;
    double averageCommentsForUser;
    double averageCommentsForPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersQuantity = statistics.usersNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();
        this.averagePostsForUser = postsQuantity / usersQuantity;
        this.averageCommentsForUser = commentsQuantity / usersQuantity;
        this.averageCommentsForPost = commentsQuantity / postsQuantity;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }

    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }
}