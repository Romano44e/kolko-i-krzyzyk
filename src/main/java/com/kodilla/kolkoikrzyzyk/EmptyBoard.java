package com.kodilla.kolkoikrzyzyk;

public class EmptyBoard {

    public String[][] getEmptyBoard3X3() {

        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";
            }
        }
        return board;
    }

    public String[][] getEmptyBoard10X10() {
        String[][] board = new String[10][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";
            }
        }
        return board;
    }
}
