package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputersMove {

    public Moves aiMove() {
        List<Moves> availableMoves = Arrays.asList(Moves.PAPER, Moves.ROCK, Moves.SCISSORS);
        Moves computerMove = availableMoves.get(new Random().nextInt(availableMoves.size()));
        return computerMove;
    }
}
