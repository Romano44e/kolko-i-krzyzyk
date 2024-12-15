package com.kodilla.kolkoikrzyzyk;

import java.util.ArrayList;
import java.util.List;

public class Board {

    final String border = "|";

    public Board() {
    }

    public void printBoard(String[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(border);
                System.out.print(board[i][j]);
            }
            System.out.println(border);
        }
        System.out.println();
    }
}
