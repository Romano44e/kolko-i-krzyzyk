package com.kodilla.kolkoikrzyzyk;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

    public void startGame() {

        InitialInformation initialInformation = new InitialInformation();
        PlayerNames playerNames = new PlayerNames();
        EmptyBoard emptyBoard = new EmptyBoard();
        PlayersSigns playersSigns = new PlayersSigns();
        PlayersMoves playersMoves = new PlayersMoves();
        Board boardPrint = new Board();
        Result result = new Result();

        initialInformation.getInitialInformation();
        String player1Name = playerNames.getPlayer1Name();
        String player2Name = playerNames.getPlayer2Name();
        String[][] board = emptyBoard.getEmptyBoard();

        System.out.println(player1Name + ", please select your sign (O or X): ");
        List<String> playersSigns1 = playersSigns.getPlayersSigns();
        String player1Sign = playersSigns1.get(0);
        String player2Sign = playersSigns1.get(1);

        System.out.println(player1Name + " have chose " + player1Sign + "\n"
                + player2Name + " have chose " + player2Sign);
        System.out.println();
        System.out.println("Let's play!");
        System.out.println();
        boardPrint.printBoard(board);
        System.out.println();

        boolean endGame = false;

        while (!endGame) {

            System.out.println(player1Name + ", your turn");

            String[][] board1 = playersMoves.getPlayerMove(board, player1Sign);
            boardPrint.printBoard(board1);
            boolean isWinner1 = result.isWinner(board1);
            boolean draw1 = result.isDraw(board1);
            if (isWinner1) {
                System.out.println(player1Name + " won!");
                System.out.println();
                break;
            }

            System.out.println(player2Name + ", your turn");
            String[][] board2 = playersMoves.getPlayerMove(board1, player2Sign);
            boardPrint.printBoard(board2);
            boolean isWinner2 = result.isWinner(board2);
            boolean draw2 = result.isDraw(board2);
            if (isWinner2) {
                System.out.println(player2Name + " won!");
                System.out.println();
            }

            if (draw1 || draw2) {
                System.out.println("It's a draw!");
                break;
            }
            endGame = isWinner2;
        }
    }
}
