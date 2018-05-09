package com.kodilla.rps;

public class Messages {

    public void welcome() {
        System.out.println("Welcome to Rock-Paper-Scissors Game! Please tell me you name...");
    }

    public void numberOfRounds() {
        System.out.println("How many rounds do you want to play? Enter a number between 1 and 5.");
    }

    public void incorrectNumberOfRounds() {
        System.out.println("Error! Enter a number between 1 and 5.");
    }

    public void howToPlay() {
        System.out.println("How to play:\n   '1' - play \"rock\"\n   '2' - play \"paper\"\n   '3' - play \"scissors\"\n   'x' - quit game\n   'n' - new game");
    }

    public void incorrectInput() {
        System.out.println("Error!\n   '1' - play \"rock\"\n   '2' - play \"paper\"\n   '3' - play \"scissors\"\n   'x' - quit game\n   'n' - new game");
    }

    public void quitConfirmation() {
        System.out.println("Are you sure you want to quit? Y/N");
    }

    public void newGameConfirmation() {
        System.out.println("Are you sure you want to start a new game? Y/N");
    }


}