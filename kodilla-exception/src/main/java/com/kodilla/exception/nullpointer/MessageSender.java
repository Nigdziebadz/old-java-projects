package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void messageSendTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message : " + message + "to " + user.getName());
        }
        throw new MessageNotSentException("User was null!");
    }
}