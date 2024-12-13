package com.kodilla.kolkoikrzyzyk;

import java.util.*;

public class PlayersSigns {

    Scanner scanner = new Scanner(System.in);
    PossibleSigns signs = new PossibleSigns();

    public List<String> playersSigns() throws WrongSignException{
//        PlayerNames playerNames = new PlayerNames();
//        String player1Name = playerNames.getPlayer1Name();
//        String player2Name = playerNames.getPlayer2Name();
        List<String> possibleMoves = signs.getPossibleSigns();
//        System.out.println(player1Name + ", please select your sign (O or X): ");
        String player1Sign = scanner.nextLine();
        String player2Sign = "";

        if (!player1Sign.equals("O") && !player1Sign.equals("X")
        & !player1Sign.equals("o") && !player1Sign.equals("x")) {
            throw new WrongSignException("Wrong sign! Choose 'O' or 'X'.");
        }

        if (player1Sign.equals("O") || player1Sign.equals("o")) {
            player1Sign = possibleMoves.get(0);
            player2Sign = possibleMoves.get(1);
        } else {
            player1Sign = possibleMoves.get(1);
            player2Sign = possibleMoves.get(0);
        }

//        Map<String, String> playersSigns = new HashMap<>();
//        playersSigns.put(player1Name, player1Sign);
//        playersSigns.put(player2Name, player2Sign);
//
//        System.out.println(player1Name + " choose " + player1Sign + "\n"
//        + player2Name + " choose " + player2Sign);
//        System.out.println();
//        System.out.println("Let's play!");

        List<String> signs1 = new ArrayList<>();
        signs1.add(player1Sign);
        signs1.add(player2Sign);

        return signs1;
    }
}
