package com.kodilla.kolkoikrzyzyk;

import java.util.ArrayList;
import java.util.List;

public class Board {

    final String border = "|";

    public Board() {
    }

    public void printBoard(String[][] board) {

        System.out.print(border);
        System.out.print(board[0][0]);
        System.out.print(border);
        System.out.print(board[0][1]);
        System.out.print(border);
        System.out.print(board[0][2]);
        System.out.println(border);
        System.out.print(border);
        System.out.print(board[1][0]);
        System.out.print(border);
        System.out.print(board[1][1]);
        System.out.print(border);
        System.out.print(board[1][2]);
        System.out.println(border);
        System.out.print(border);
        System.out.print(board[2][0]);
        System.out.print(border);
        System.out.print(board[2][1]);
        System.out.print(border);
        System.out.print(board[2][2]);
        System.out.println(border);
        System.out.println();

    }
}
