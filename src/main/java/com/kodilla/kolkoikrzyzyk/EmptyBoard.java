package com.kodilla.kolkoikrzyzyk;

public class EmptyBoard {

    public String[][] getEmptyBoard() {

        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][0] = " ";
                board[i][1] = " ";
                board[i][2] = " ";
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        return board;
    }
}
