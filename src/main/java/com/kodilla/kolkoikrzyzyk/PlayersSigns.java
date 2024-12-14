package com.kodilla.kolkoikrzyzyk;

import java.util.*;

public class PlayersSigns {

    Scanner scanner = new Scanner(System.in);
    PossibleSigns signs = new PossibleSigns();

    public List<String> getPlayersSigns() {

        List<String> possibleMoves = signs.getPossibleSigns();

        String player1Sign = scanner.nextLine();
        String player2Sign = "";

        if (!player1Sign.equals("O") && !player1Sign.equals("X")
        & !player1Sign.equals("o") && !player1Sign.equals("x")) {
            System.out.println("Wrong sign! Choose 'O' or 'X'.");
            getPlayersSigns();
        }

        if (player1Sign.equals("O") || player1Sign.equals("o")) {
            player1Sign = possibleMoves.get(0);
            player2Sign = possibleMoves.get(1);
        } else {
            player1Sign = possibleMoves.get(1);
            player2Sign = possibleMoves.get(0);
        }

        List<String> signs1 = new ArrayList<>();
        signs1.add(player1Sign);
        signs1.add(player2Sign);

        return signs1;
    }
}
