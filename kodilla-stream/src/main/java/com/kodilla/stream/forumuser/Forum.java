package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersMainList = new ArrayList<>();

    public Forum() {
        forumUsersMainList.add(new ForumUser(12, "Alex",
                'm', 10, 1980, 10,
                11));
        forumUsersMainList.add(new ForumUser(14, "Pavel",
                'm', 0, 1990, 9,
                5));
        forumUsersMainList.add(new ForumUser(8, "Samatha",
                'm', 22, 2005, 12,
                6));
        forumUsersMainList.add(new ForumUser(122, "Violet",
                'f', 0, 1985, 1,
                16));
        forumUsersMainList.add(new ForumUser(140, "Ultraviolet",
                'f', 7, 1976, 2,
                22));
        forumUsersMainList.add(new ForumUser(45, "Never",
                'f', 103, 2000, 4,
                25));
        forumUsersMainList.add(new ForumUser(33, "Anywhere",
                'm', 129, 1980, 5,
                7));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsersMainList);
    }
}
