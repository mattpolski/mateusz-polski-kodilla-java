package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateBirth().getYear() <= 1998)
                .filter(forumUser -> forumUser.getPostsQuantity() != 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("The list contains " + resultMap.size() + " users.");
            resultMap.entrySet().stream()
                .map(stringForumUserEntry -> stringForumUserEntry.getKey() + ": " + stringForumUserEntry.getValue())
                    .forEach(System.out::println);
    }
}