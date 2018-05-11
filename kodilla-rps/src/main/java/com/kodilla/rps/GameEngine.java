package com.kodilla.rps;

import java.util.Scanner;
import static com.kodilla.rps.Moves.*;

public class GameEngine {

    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private int playerResult;
    private int computerResult;

    public boolean game(Messages messages, Scanner scanner, String playerName) {
        playerResult = 0;
        computerResult = 0;
        int numberOfRounds;
        messages.numberOfRounds(playerName);
        numberOfRounds = scanner.nextInt();
        if (numberOfRounds == 0) {
            messages.incorrectNumberOfRounds();
        }

        messages.howToPlay();

        int roundCount = 0;
        String playerChoice;
        boolean exit = false;
        Moves playerMove, computerMove;
        Keyboard keyboard = new Keyboard();
        ComputersMove computersMove = new ComputersMove();

        while (roundCount < numberOfRounds) {
            roundCount++;
            playerChoice = keyboard.makeMove(scanner.nextLine(), scanner, messages);

            switch (playerChoice) {
                case EXIT:
                    exit = true;
                    roundCount = numberOfRounds;
                    break;

                case NEW_GAME:
                    roundCount = numberOfRounds;
                    break;

                default:
                    playerMove = valueOf(playerChoice.toUpperCase());
                    computerMove = computersMove.aiMove();
                    messages.showResultOfRound(playerName, playerMove, computerMove);
                    if (!playerMove.equals(computerMove)) {
                        if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS) || playerMove.equals(SCISSORS) && computerMove.equals(PAPER) || playerMove.equals(PAPER) && computerMove.equals(ROCK)) {
                            playerResult++;
                            messages.playerWinsRound();
                        } else {
                            computerResult++;
                            messages.computerWinsRound();
                        }
                    } else {
                        messages.drawRound();
                    }

            }

        }
        messages.finalResultMessage(playerName, playerResult, computerResult);
        playerChoice = keyboard.exitGame(scanner.nextLine(), scanner, messages);
        if (playerChoice.equals("y")) {
            exit = true;
        }
        return exit;
    }
}
