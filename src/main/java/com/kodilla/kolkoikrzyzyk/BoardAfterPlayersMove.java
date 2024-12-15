package com.kodilla.kolkoikrzyzyk;

public class BoardAfterPlayersMove {

    public String[][] getBoardAfterPlayersMove(String[][] board, Integer[] playerMoveBoard, String playerSign) {

        int column = playerMoveBoard[0];
        int row = playerMoveBoard[1];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[row - 1][column - 1] = playerSign;
            }
        }
        return board;
    }
}
