package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result;
        String result2;

        try {
            result = secondChallenge.probablyIWillThrowException(1.0, 2.0);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Wrong numbers! Error: " + e);
        } finally {
            System.out.println("Conversion completed");
        }

        try {
            result2 = secondChallenge.probablyIWillThrowException(3.0, 2.0);
            System.out.println(result2);

        } catch (Exception e) {
            System.out.println("Wrong numbers! Error: " + e);
        } finally {
            System.out.println("Conversion completed");
        }

    }
}

