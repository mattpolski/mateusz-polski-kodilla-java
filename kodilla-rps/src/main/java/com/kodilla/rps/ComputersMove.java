package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputersMove {

    public Moves aiMove() {
        List<Moves> availableMoves = Arrays.asList(Moves.PAPER, Moves.ROCK, Moves.SCISSORS);
        Random random = new Random();
        for (int i = 0; i < availableMoves.size(); i++) {
            int randomIndex = random.nextInt(availableMoves.size());
            Moves computerMove = availableMoves.get(randomIndex);
        }
        return availableMoves.get(availableMoves.size());
    }
}
