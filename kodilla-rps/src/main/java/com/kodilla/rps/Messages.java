package com.kodilla.rps;

public class Messages {

    public void welcome() {
        System.out.println("Welcome to Rock-Paper-Scissors Game! Please tell me you name...");
    }

    public void numberOfRounds(String playerName) {
        System.out.println(playerName + ", how many rounds do you want to play?");
    }

    public void incorrectNumberOfRounds() {
        System.out.println("Error! Enter how many rounds do you want to play");
    }

    public void howToPlay() {
        System.out.println("How to play:\n   '1' - play \"rock\"\n   '2' - play \"paper\"\n   '3' - play \"scissors\"\n   'x' - quit game\n   'n' - new game");
    }

    public void incorrectInput() {
        System.out.println("Error! Try one more time:\n   '1' - play \"rock\"\n   '2' - play \"paper\"\n   '3' - play \"scissors\"\n   'x' - quit game\n   'n' - new game");
    }

    public void makeMove() {
        System.out.println("Select your move...");
    }

    public void quitConfirmation() {
        System.out.println("Are you sure you want to quit? Y/N");
    }

    public void newGameConfirmation() {
        System.out.println("Are you sure you want to start a new game? Type 'y' to start new game");
    }

    public void showResultOfRound(String playerName, Moves playerMove, Moves computerMove) {
        System.out.println(playerName + " " + playerMove + " : " + computerMove + " Computer");
    }

    public void playerWinsRound() {
        System.out.println("You won this round!");
    }

    public void computerWinsRound() {
        System.out.println("Bad luck! Computer won this round...");
    }

    public void drawRound() {
        System.out.println("It's a draw!");
    }

    public void finalResultMessage(String playerName, int playerResult, int computerResult) {
        System.out.println("\n\n          GAME OVER! \nFinal result: " + playerName + " " + playerResult + " VS " + computerResult + " " + "Computer" + "\n\n\n" +
                "Press 'x' to exit \n" + "Press 'n' to start a new game");
    }
}