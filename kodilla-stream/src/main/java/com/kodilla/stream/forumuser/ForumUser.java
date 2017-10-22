package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int numberOfUserPosts;

    public ForumUser(final int userID, final String userName, final char userSex, final int numberOfUserPosts,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfUserPosts = numberOfUserPosts;
    }


    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public char getUserSex() {
        return userSex;
    }

    public int getNumberOfUserPosts() {
        return numberOfUserPosts;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", numberOfUserPosts=" + numberOfUserPosts +
                '}';
    }
}
