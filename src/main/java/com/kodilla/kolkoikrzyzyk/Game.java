package com.kodilla.kolkoikrzyzyk;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

    public void startGame() {

        InitialInformation initialInformation = new InitialInformation();
        PlayerNames playerNames = new PlayerNames();
        EmptyBoard emptyBoard = new EmptyBoard();
        List<String> emptyFieldsBoard = emptyBoard.getEmptyFieldsBoard();
        Board board = new Board(emptyFieldsBoard);
        PlayersSigns playersSigns = new PlayersSigns();

        initialInformation.getInitialInformation();
        String player1Name = playerNames.getPlayer1Name();
        String player2Name = playerNames.getPlayer2Name();
        System.out.println(player1Name + ", please select your sign (O or X): ");

        List<String> playersSigns1 = playersSigns.playersSigns();
        String player1Sign = playersSigns1.get(0);
        String player2Sign = playersSigns1.get(1);

        Map<String, String> playersSignsMap = new HashMap<>();
        playersSignsMap.put(player1Name, player1Sign);
        playersSignsMap.put(player2Name, player2Sign);

        System.out.println(player1Name + " choose " + player1Sign + "\n"
                + player2Name + " choose " + player2Sign);
        System.out.println();
        System.out.println("Let's play!");

        System.out.println();
        List<String> boardFields = board.printBoard(emptyFieldsBoard);

        boolean endGame = false;
        int player1pointscounter = 0;
        int player2pointscounter = 0;

        while (!endGame) {

            for (Map.Entry<String, String> entry : playersSignsMap.entrySet()) {

                String playerName = entry.getKey();
                System.out.println(playerName + ", select your field: ");

                PlayersMoves playersMoves = new PlayersMoves();

                try {
                    int playerMove = playersMoves.makeMove();
                    String playerSign = entry.getValue();
                    boardFields.set(playerMove, playerSign);

                    board.printBoard(boardFields);
                } catch (WrongFieldException e) {
                    System.out.println(e.getMessage());
                }

//                int playerMove = playersMoves.makeMove();

                System.out.println();

//                String playerSign = entry.getValue();

//                if (!boardFields.get(playerMove).equals(" ")) {
//                    throw new OccupiedFieldException("the field is already occupied! Choose empty one!");
//                }

//                boardFields.set(playerMove, playerSign);
//
//                board.printBoard(boardFields);

                if ((boardFields.get(0).equals(player1Sign) && boardFields.get(1).equals(player1Sign) && boardFields.get(2).equals(player1Sign))
                        || (boardFields.get(3).equals(player1Sign) && boardFields.get(4).equals(player1Sign) && boardFields.get(5).equals(player1Sign))
                        || (boardFields.get(6).equals(player1Sign) && boardFields.get(7).equals(player1Sign) && boardFields.get(8).equals(player1Sign))
                        || (boardFields.get(0).equals(player1Sign) && boardFields.get(3).equals(player1Sign) && boardFields.get(6).equals(player1Sign))
                        || (boardFields.get(1).equals(player1Sign) && boardFields.get(4).equals(player1Sign) && boardFields.get(7).equals(player1Sign))
                        || (boardFields.get(2).equals(player1Sign) && boardFields.get(5).equals(player1Sign) && boardFields.get(8).equals(player1Sign))
                        || (boardFields.get(0).equals(player1Sign) && boardFields.get(4).equals(player1Sign) && boardFields.get(8).equals(player1Sign))
                        || (boardFields.get(2).equals(player1Sign) && boardFields.get(4).equals(player1Sign) && boardFields.get(6).equals(player1Sign))) {

                    player1pointscounter++;
                    System.out.println(player1Name + " wins!");
                    System.out.println("Game result: " + "\n"
                    + player1Name + ": " + player1pointscounter + "\n"
                    + player2Name + ": " + player2pointscounter);

                        endGame = true;
                }

                if ((boardFields.get(0).equals(player2Sign) && boardFields.get(1).equals(player2Sign) && boardFields.get(2).equals(player2Sign))
                        || (boardFields.get(3).equals(player2Sign) && boardFields.get(4).equals(player2Sign) && boardFields.get(5).equals(player2Sign))
                        || (boardFields.get(6).equals(player2Sign) && boardFields.get(7).equals(player2Sign) && boardFields.get(8).equals(player2Sign))
                        || (boardFields.get(0).equals(player2Sign) && boardFields.get(3).equals(player2Sign) && boardFields.get(6).equals(player2Sign))
                        || (boardFields.get(1).equals(player2Sign) && boardFields.get(4).equals(player2Sign) && boardFields.get(7).equals(player2Sign))
                        || (boardFields.get(2).equals(player2Sign) && boardFields.get(5).equals(player2Sign) && boardFields.get(8).equals(player2Sign))
                        || (boardFields.get(0).equals(player2Sign) && boardFields.get(4).equals(player2Sign) && boardFields.get(8).equals(player2Sign))
                        || (boardFields.get(2).equals(player2Sign) && boardFields.get(4).equals(player2Sign) && boardFields.get(6).equals(player2Sign))) {

                    player2pointscounter++;
                    System.out.println(player2Name + " wins!");
                    System.out.println("Game result: " + "\n"
                            + player1Name + ": " + player1pointscounter + "\n"
                            + player2Name + ": " + player2pointscounter);

                        endGame = true;
                }
            }
        }
    }
}
