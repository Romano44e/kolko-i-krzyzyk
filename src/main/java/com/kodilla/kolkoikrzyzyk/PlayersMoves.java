package com.kodilla.kolkoikrzyzyk;

import java.util.Scanner;

public class PlayersMoves {

    public String[][] getPlayerMove(String[][] board, String playerSign) throws NoSuchFieldException, OccupiedFieldException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose column: ");
        int column = scanner.nextInt();
        System.out.println("Choose row: ");
        int row = scanner.nextInt();
        System.out.println();

//        if (row > board.length || row < 0 || column > board.length || column < 0) {
//            throw new NoSuchFieldException("Invalid row or column!");
//        }
//
//        if (board[row][column].equals(playerSign)) {
//            throw new OccupiedFieldException("This field is not empty!. Choose another one!");
//        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[row - 1][column - 1] = playerSign;
            }
        }
        return board;
    }
}
