package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum mainForumList = new Forum();
        Map<Integer, ForumUser> filteredForumUsersList = mainForumList.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'm')
                .filter(forumUser -> (LocalDate.now().getYear() -
                        forumUser.getBirthDate().getYear() > 20))
                .filter(forumUser -> forumUser.getNumberOfUserPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        filteredForumUsersList.entrySet().stream()
                .map(entry -> "userID: " + entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}


