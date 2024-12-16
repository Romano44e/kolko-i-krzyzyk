package com.kodilla.kolkoikrzyzyk;

import java.util.Random;

public class ComputerMove {


    public Integer[] getComputerPlayerMove(String[][] board) {

        Random random = new Random();

        if (board.length == 3) {
            int column = random.nextInt(3) + 1;
            int row = random.nextInt(3) + 1;

            Integer[] computerPlayerMoveBoard = new Integer[2];
            computerPlayerMoveBoard[0] = column;
            computerPlayerMoveBoard[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMove(board);
            }
            return computerPlayerMoveBoard;
        }

        if (board.length == 10) {
            int column = random.nextInt(10) + 1;
            int row = random.nextInt(10) + 1;

            Integer[] computerPlayerMoveBoard = new Integer[2];
            computerPlayerMoveBoard[0] = column;
            computerPlayerMoveBoard[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMove(board);
            }
            return computerPlayerMoveBoard;
        }
        return null;
    }
}
