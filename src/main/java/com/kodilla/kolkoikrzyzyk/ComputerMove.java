package com.kodilla.kolkoikrzyzyk;

import java.util.Random;

public class ComputerMove {


    public Integer[] getComputerPlayerMove(String[][] board) {

        Random random = new Random();
        int column = random.nextInt(3) + 1;
        int row = random.nextInt(3) + 1;

        Integer[] ComputerPlayerMoveBoard = new Integer[2];
        ComputerPlayerMoveBoard[0] = column;
        ComputerPlayerMoveBoard[1] = row;

        if (board[row - 1][column - 1].contains("X")
         || board[row - 1][column - 1].contains("O")) {
            return getComputerPlayerMove(board);
        }
        return ComputerPlayerMoveBoard;
    }
}
