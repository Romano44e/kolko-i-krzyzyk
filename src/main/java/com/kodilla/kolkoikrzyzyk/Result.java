package com.kodilla.kolkoikrzyzyk;

public class Result {

    boolean isWinner(String board[][]) {

        boolean isWinner = false;

        if ((board[0][0] + board[0][1] + board[0][2]).contains("XXX")
                || (board[1][0] + board[1][1] + board[1][2]).contains("XXX")
                || (board[2][0] + board[2][1] + board[2][2]).equals("XXX")
                || (board[0][0] + board[1][0] + board[2][0]).equals("XXX")
                || (board[0][1] + board[1][1] + board[2][1]).equals("XXX")
                || (board[0][2] + board[1][2] + board[2][2]).equals("XXX")
                || (board[0][0] + board[1][1] + board[2][2]).equals("XXX")
                || (board[0][2] + board[1][1] + board[2][0]).equals("XXX")
                || (board[0][0] + board[0][1] + board[0][2]).equals("OOO")
                || (board[1][0] + board[1][1] + board[1][2]).equals("OOO")
                || (board[2][0] + board[2][1] + board[2][2]).equals("OOO")
                || (board[0][0] + board[1][0] + board[2][0]).equals("OOO")
                || (board[0][1] + board[1][1] + board[2][1]).equals("OOO")
                || (board[0][2] + board[1][2] + board[2][2]).equals("OOO")
                || (board[0][0] + board[1][1] + board[2][2]).equals("OOO")
                || (board[0][2] + board[1][1] + board[2][0]).equals("OOO")) {
            isWinner = true;
        }
        return isWinner;
    }

    boolean isDraw (String board[][]) {

        boolean isDraw = false;

        if (!board[0][0].equals(" ") && !board[0][1].equals(" ") && !board[0][2].equals(" ")
        && !board[1][0].equals(" ") && !board[1][1].equals(" ") && !board[1][2].equals(" ")
        && !board[2][0].equals(" ") && !board[2][1].equals(" ") && !board[2][2].equals(" ")) {
            isDraw = true;
        }
        return isDraw;
    }
}
