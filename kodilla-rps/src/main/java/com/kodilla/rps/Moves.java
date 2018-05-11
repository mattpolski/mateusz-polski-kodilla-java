package com.kodilla.rps;

public enum Moves {
    PAPER("paper"), ROCK("rock"), SCISSORS("scissors");

    private final String move;

    Moves(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }
}
