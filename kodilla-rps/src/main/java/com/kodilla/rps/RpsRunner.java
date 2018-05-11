package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Messages messages = new Messages();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        messages.welcome();
        String playerName = scanner.nextLine();
        while (!exit) {
            GameEngine gameEngine = new GameEngine();
            exit = gameEngine.game(messages, scanner, playerName);
        }
    }
}
