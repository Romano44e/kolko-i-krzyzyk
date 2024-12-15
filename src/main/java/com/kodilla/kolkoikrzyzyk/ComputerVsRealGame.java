package com.kodilla.kolkoikrzyzyk;

import java.util.List;

public class ComputerVsRealGame {

    public void startComputerVsRealGame() {

        InitialInformation initialInformation = new InitialInformation();
        PlayerNames playerName = new PlayerNames();
        EmptyBoard emptyBoard = new EmptyBoard();
        PlayersSigns playersSigns = new PlayersSigns();
        Board boardPrint = new Board();
        Result result = new Result();

        RealPlayerMove realPlayerMove = new RealPlayerMove();
        ComputerMove computerMove = new ComputerMove();
        BoardAfterPlayersMove boardAfterPlayersMove = new BoardAfterPlayersMove();

        initialInformation.getInitialInformation();
        String player1Name = playerName.getPlayer1Name();
        String computerPlayerName = "Computer";
        String[][] board = emptyBoard.getEmptyBoard();

        System.out.println(player1Name + ", please select your sign (O or X): ");
        List<String> playersSigns1 = playersSigns.getPlayersSigns();
        String player1Sign = playersSigns1.get(0);
        String player2Sign = playersSigns1.get(1);

        System.out.println(player1Name + " have chosen " + player1Sign + "\n"
                + computerPlayerName + " have chosen " + player2Sign);
        System.out.println();
        System.out.println("Let's play!");
        System.out.println();
        boardPrint.printBoard(board);
        System.out.println();

        boolean endGame = false;

        while (!endGame) {

            System.out.println(player1Name + ", your turn");

            Integer[] playerMoveBoard1 = realPlayerMove.getRealPlayerMove(board);
            String[][] board1 = boardAfterPlayersMove.getBoardAfterPlayersMove(board, playerMoveBoard1, player1Sign);

            boardPrint.printBoard(board1);
            boolean isWinner1 = result.isWinner(board1);
            boolean draw1 = result.isDraw(board1);

            if (isWinner1) {
                System.out.println(player1Name + " won!");
                System.out.println();
                break;
            }

            if (draw1) {
                System.out.println("It's a draw!");
                break;
            }


            System.out.println(computerPlayerName + "s turn");

            Integer[] playerMoveBoard2 = computerMove.getComputerPlayerMove(board1);
            String[][] board2 = boardAfterPlayersMove.getBoardAfterPlayersMove(board1, playerMoveBoard2, player2Sign);

            boardPrint.printBoard(board2);
            boolean isWinner2 = result.isWinner(board2);
            boolean draw2 = result.isDraw(board2);

            if (isWinner2) {
                System.out.println(computerPlayerName + " won!");
                System.out.println();
            }

            if (draw2) {
                System.out.println("It's a draw!");
                break;
            }
            endGame = isWinner2;
        }
    }
}
