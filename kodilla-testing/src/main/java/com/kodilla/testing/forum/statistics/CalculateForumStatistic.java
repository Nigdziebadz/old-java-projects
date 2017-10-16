package com.kodilla.testing.forum.statistics;

public class CalculateForumStatistic {
    private Statistics statistics;
    private int userQty;
    private int postQty;
    private int commentsQty;
    private double postPerUser;
    private double commentPerUser;
    private double commentPerPost;

    public CalculateForumStatistic(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(){
        userQty = statistics.usersNames().size();
        postQty = statistics.postsCount();
        commentsQty = statistics.commentsCount();
        postPerUser = ((double)statistics.postsCount())
                / statistics.usersNames().size();
        if (postQty == 0) {
            commentPerPost = 0;
        } else {
            commentPerPost = ((double)statistics.commentsCount()) / postQty;
        }
        if (userQty == 0) {
            commentPerUser = 0;
        } else {
            commentPerUser = ((double) statistics.commentsCount()) / userQty;
        }
    }

    public int getUserQty() {
        return userQty;
    }

    public int getPostQty() {
        return postQty;
    }

    public int getCommentsQty() {
        return commentsQty;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }
}
