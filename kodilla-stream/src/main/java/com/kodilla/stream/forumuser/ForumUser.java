package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate dateBirth;
    private final int postsQuantity;


    public ForumUser(int id, String userName, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int postsQuantity) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateBirth +
                ", postsQuantity=" + postsQuantity +
                '}';

    }
}
