package com.kodilla.rps;

import java.util.Scanner;
import static com.kodilla.rps.Moves.*;

public class Keyboard {

    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private static final String YES = "y";
    private static final String NO = "n";
    private static final String PLAY_ROCK = "1";
    private static final String PLAY_PAPER = "2";
    private static final String PLAY_SCISSORS = "3";

    public String makeMove(Scanner scanner, Messages messages) {
        messages.makeMove();
        String move = scanner.next();
        while (true) {
            switch (move) {
                case PLAY_ROCK:
                    return ROCK.getMove();

                case PLAY_PAPER:
                    return PAPER.getMove();

                case PLAY_SCISSORS:
                    return SCISSORS.getMove();

                case EXIT:
                    messages.quitConfirmation();
                    move = scanner.next();
                    if (move.equals(YES)) {
                        return EXIT;
                    }
                    break;

                case NEW_GAME:
                    messages.newGameConfirmation();
                    move = scanner.next();
                    if (move.equals(YES)) {
                        return NEW_GAME;
                    }
                    else if (move.equals(NO)) {
                        return EXIT;
                    }
            }
        }
    }

    public String exitGame(String playerChoice, Scanner scanner, Messages messages) {
        while (true) {
            switch (playerChoice) {
                case EXIT:
                    messages.quitConfirmation();
                    playerChoice = scanner.next();
                    if (playerChoice.equals("y")) {
                        System.out.println("See you soon!");
                        return EXIT;
                    } else if (playerChoice.equals("n")) {
                        System.out.println("Ok, so let's try one more time!");
                        return NEW_GAME;
                    }
                    break;
                case NEW_GAME:
                    messages.newGameConfirmation();
                    playerChoice = scanner.next();
                    if (playerChoice.equals("y")) {
                        return NEW_GAME;
                    } else if (playerChoice.equals("n")) {
                        System.out.println("See you soon!");
                        return EXIT;
                    }
                    break;
            }
        }
    }
}
