package com.kodilla.kolkoikrzyzyk;

import java.util.List;

public class RealVsRealGame {

    PlayerNames playerNames = new PlayerNames();
    EmptyBoard emptyBoard = new EmptyBoard();
    PlayersSigns playersSigns = new PlayersSigns();
    Board boardPrint = new Board();
    Result result = new Result();

    RealPlayerMove playersMovesBoard = new RealPlayerMove();
    BoardAfterPlayersMove boardAfterPlayersMove = new BoardAfterPlayersMove();

    BoardSize boardSize = new BoardSize();
    GameLength gameLength = new GameLength();


    public void startRealVsRealGame() {

        int gameLength1 = gameLength.getGameLength();

        String[][] board = boardSize.choseBoardSize();

        String player1Name = playerNames.getPlayer1Name();
        String player2Name = playerNames.getPlayer2Name();

        System.out.println(player1Name + ", please select your sign (O or X): ");
        List<String> playersSigns1 = playersSigns.getPlayersSigns();
        String player1Sign = playersSigns1.get(0);
        String player2Sign = playersSigns1.get(1);

        System.out.println(player1Name + " have chosen " + player1Sign + "\n"
                + player2Name + " have chosen " + player2Sign);
        System.out.println();
        System.out.println("Let's play!");
        System.out.println();
        boardPrint.printBoard(board);
        System.out.println();

        boolean endGame = false;
        int player1WinsCounter = 0;
        int player2WinsCounter = 0;

        while (!endGame) {

            System.out.println(player1Name + ", your turn");

            Integer[] playerMoveBoard1 = playersMovesBoard.getRealPlayerMove(board);
            String[][] board1 = boardAfterPlayersMove.getBoardAfterPlayersMove(board, playerMoveBoard1, player1Sign);

            boardPrint.printBoard(board1);

            if (board.length == 3) {
                boolean isWinner1 = result.isWinner3x3(board1);
                boolean draw1 = result.isDraw3x3(board1);
                if (isWinner1) {
                    for (int i = 0; i < board1.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            board1[i][j] = " ";
                        }
                    }
                    player1WinsCounter++;
                    System.out.println(player1Name + " won!" + "\n"
                            + "current result is: " + "\n"
                            + player1Name + ": " + player1WinsCounter + "\n"
                            + player2Name + ": " + player2WinsCounter);
                    System.out.println();
                    if (player1WinsCounter == gameLength1) {
                        System.out.println(player1Name + " wins!");
                        break;
                    }
                } else if (draw1) {
                    for (int i = 0; i < board1.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            board1[i][j] = " ";
                        }
                    }
                    System.out.println("It's a draw!" + "\n"
                            + "current result is: " + "\n"
                            + player1Name + ": " + player1WinsCounter + "\n"
                            + player2Name + ": " + player2WinsCounter + "\n"
                            + "play again!");
                }
            }

            boardPrint.printBoard(board1);
            if (board.length == 10) {
                boolean isWinner1 = result.isWinner10x10(board1);
                boolean draw1 = result.isDraw10x10(board1);
                if (isWinner1) {
                    for (int i = 0; i < board1.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            board1[i][j] = " ";
                        }
                    }
                    player1WinsCounter++;
                    System.out.println(player1Name + " won!" + "\n"
                            + "current result is: " + "\n"
                            + player1Name + ": " + player1WinsCounter + "\n"
                            + player2Name + ": " + player2WinsCounter);
                    System.out.println();
                    if (player1WinsCounter == gameLength1) {
                        System.out.println(player1Name + " wins!");
                        break;
                    }
                } else if (draw1) {
                    for (int i = 0; i < board1.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            board1[i][j] = " ";
                        }
                    }
                    System.out.println("It's a draw!" + "\n"
                            + "current result is: " + "\n"
                            + player1Name + ": " + player1WinsCounter + "\n"
                            + player2Name + ": " + player2WinsCounter + "\n"
                            + "play again!");
                }
            }

            System.out.println(player2Name + ", your turn");

            Integer[] playerMoveBoard2 = playersMovesBoard.getRealPlayerMove(board1);
            String[][] board2 = boardAfterPlayersMove.getBoardAfterPlayersMove(board1, playerMoveBoard2, player2Sign);

            boardPrint.printBoard(board2);

            if (board.length == 3) {
                boolean isWinner2 = result.isWinner3x3(board2);
                boolean draw2 = result.isDraw3x3(board2);
                if (isWinner2) {
                    for (int i = 0; i < board2.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            board2[i][j] = " ";
                        }
                    }
                    player2WinsCounter++;
                    System.out.println(player2Name + " won!" + "\n"
                            + "current result is: " + "\n"
                            + player1Name + ": " + player1WinsCounter + "\n"
                            + player2Name + ": " + player2WinsCounter);
                    System.out.println();
                    if (player2WinsCounter == gameLength1) {
                        System.out.println(player2Name + " wins!");
                        break;
                    }
                } else if (draw2) {
                    for (int i = 0; i < board1.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            board1[i][j] = " ";
                        }
                    }
                    System.out.println("It's a draw!" + "\n"
                            + "current result is: " + "\n"
                            + player1Name + ": " + player1WinsCounter + "\n"
                            + player2Name + ": " + player2WinsCounter + "\n"
                            + "play again!");
                }
            }

            if (board.length == 10) {
                boolean isWinner2 = result.isWinner10x10(board2);
                boolean draw2 = result.isDraw10x10(board2);
                if (isWinner2) {
                    for (int i = 0; i < board2.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            board2[i][j] = " ";
                        }
                    }
                    player2WinsCounter++;
                    System.out.println(player2Name + " won!" + "\n"
                            + "current result is: " + "\n"
                            + player1Name + ": " + player1WinsCounter + "\n"
                            + player2Name + ": " + player2WinsCounter);
                    System.out.println();
                    if (player2WinsCounter == gameLength1) {
                        System.out.println(player2Name + " wins!");
                        break;
                    } else if (draw2) {
                        for (int i = 0; i < board1.length; i++) {
                            for (int j = 0; j < board[i].length; j++) {
                                board1[i][j] = " ";
                            }
                        }
                        System.out.println("It's a draw!" + "\n"
                                + "current result is: " + "\n"
                                + player1Name + ": " + player1WinsCounter + "\n"
                                + player2Name + ": " + player2WinsCounter + "\n"
                                + "play again!");
                    }
                }
            }
        }
    }
}
