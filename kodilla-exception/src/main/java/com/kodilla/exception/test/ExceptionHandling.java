package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(3, 1.7);
        } catch (Exception e) {
            System.out.println("Oops, try one more time");
        } finally {
            System.out.println("That's it!");
        }
    }
}
