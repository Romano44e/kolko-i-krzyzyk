package com.kodilla.kolkoikrzyzyk;

import java.util.Scanner;

public class RealPlayerMove {

    public Integer[] getRealPlayerMove(String[][] board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose column: ");
        int column = scanner.nextInt();
        System.out.println("Choose row: ");
        int row = scanner.nextInt();
        Integer[] playerMoveBoard = new Integer[2];
        playerMoveBoard[0] = column;
        playerMoveBoard[1] = row;

        if (board[row - 1][column - 1].contains("X")
        || board[row - 1][column - 1].contains("O")) {
            System.out.println("Field is not empty. Choose another one!");
            return getRealPlayerMove(board);
        }
        System.out.println();
        return playerMoveBoard;
    }

//        if (row > board.length || row <= 0 || column > board.length || column <= 0) {
//            System.out.println("Invalid row or column!");
//            getPlayerMove(board, playerSign);
//        }
}
