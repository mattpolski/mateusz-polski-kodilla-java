package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(0221, "john12", 'M', 1997,12, 12, 5));
        listOfUsers.add(new ForumUser(0223, "Mary67", 'F', 1989, 1, 13, 15));
        listOfUsers.add(new ForumUser(3152, "aleJandroS", 'M', 2000, 4, 23, 7));
        listOfUsers.add(new ForumUser(1475, "user12", 'M', 1995,11, 05, 0));
        listOfUsers.add(new ForumUser(1327, "IhaveNoIdea", 'F', 1994, 3, 19, 10));
        listOfUsers.add(new ForumUser(1452, "michaelR", 'M', 1995,10, 11, 0));
        listOfUsers.add(new ForumUser(0121, "matt87", 'M', 1987,2, 2, 2));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfUsers);
    }
}
