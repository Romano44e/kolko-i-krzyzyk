package com.kodilla.kolkoikrzyzyk;

public class Result {

    boolean isWinner3x3(String board[][]) {

        boolean isWinner = false;

        if ((board[0][0] + board[0][1] + board[0][2]).contains("XXX")
                || (board[1][0] + board[1][1] + board[1][2]).contains("XXX")
                || (board[2][0] + board[2][1] + board[2][2]).contains("XXX")
                || (board[0][0] + board[1][0] + board[2][0]).contains("XXX")
                || (board[0][1] + board[1][1] + board[2][1]).contains("XXX")
                || (board[0][2] + board[1][2] + board[2][2]).contains("XXX")
                || (board[0][0] + board[1][1] + board[2][2]).contains("XXX")
                || (board[0][2] + board[1][1] + board[2][0]).contains("XXX")
                || (board[0][0] + board[0][1] + board[0][2]).contains("OOO")
                || (board[1][0] + board[1][1] + board[1][2]).contains("OOO")
                || (board[2][0] + board[2][1] + board[2][2]).contains("OOO")
                || (board[0][0] + board[1][0] + board[2][0]).contains("OOO")
                || (board[0][1] + board[1][1] + board[2][1]).contains("OOO")
                || (board[0][2] + board[1][2] + board[2][2]).contains("OOO")
                || (board[0][0] + board[1][1] + board[2][2]).contains("OOO")
                || (board[0][2] + board[1][1] + board[2][0]).contains("OOO")) {
            isWinner = true;
        }
        return isWinner;
    }

    boolean isWinner10x10(String board[][]) {

        boolean isWinner = false;

        if ((board[0][0] + board[0][1] + board[0][2] + board[0][3]+ board[0][4] + board[0][5] + board[0][6] + board[0][7] + board[0][8]+ board[0][9]).contains("XXXXX")
                || (board[1][0] + board[1][1] + board[1][2] + board[1][3]+ board[1][4] + board[1][5] + board[1][6] + board[1][7] + board[1][8]+ board[1][9]).contains("XXXXX")
                || (board[2][0] + board[2][1] + board[2][2] + board[2][3]+ board[2][4] + board[2][5] + board[2][6] + board[2][7] + board[2][8]+ board[2][9]).contains("XXXXX")
                || (board[3][0] + board[3][1] + board[3][2] + board[3][3]+ board[3][4] + board[3][5] + board[3][6] + board[3][7] + board[3][8]+ board[3][9]).contains("XXXXX")
                || (board[4][0] + board[4][1] + board[4][2] + board[4][3]+ board[4][4] + board[4][5] + board[4][6] + board[4][7] + board[4][8]+ board[4][9]).contains("XXXXX")
                || (board[5][0] + board[5][1] + board[5][2] + board[5][3]+ board[5][4] + board[5][5] + board[5][6] + board[5][7] + board[5][8]+ board[5][9]).contains("XXXXX")
                || (board[6][0] + board[6][1] + board[6][2] + board[6][3]+ board[6][4] + board[6][5] + board[6][6] + board[6][7] + board[6][8]+ board[6][9]).contains("XXXXX")
                || (board[7][0] + board[7][1] + board[7][2] + board[7][3]+ board[7][4] + board[7][5] + board[7][6] + board[7][7] + board[7][8]+ board[7][9]).contains("XXXXX")
                || (board[8][0] + board[8][1] + board[8][2] + board[8][3]+ board[8][4] + board[8][5] + board[8][6] + board[8][7] + board[8][8]+ board[8][9]).contains("XXXXX")
                || (board[9][0] + board[9][1] + board[9][2] + board[9][3]+ board[9][4] + board[9][5] + board[9][6] + board[9][7] + board[9][8]+ board[9][9]).contains("XXXXX")
                || (board[0][0] + board[0][1] + board[0][2] + board[0][3]+ board[0][4] + board[0][5] + board[0][6] + board[0][7] + board[0][8]+ board[0][9]).contains("OOOOO")
                || (board[1][0] + board[1][1] + board[1][2] + board[1][3]+ board[1][4] + board[1][5] + board[1][6] + board[1][7] + board[1][8]+ board[1][9]).contains("OOOOO")
                || (board[2][0] + board[2][1] + board[2][2] + board[2][3]+ board[2][4] + board[2][5] + board[2][6] + board[2][7] + board[2][8]+ board[2][9]).contains("OOOOO")
                || (board[3][0] + board[3][1] + board[3][2] + board[3][3]+ board[3][4] + board[3][5] + board[3][6] + board[3][7] + board[3][8]+ board[3][9]).contains("OOOOO")
                || (board[4][0] + board[4][1] + board[4][2] + board[4][3]+ board[4][4] + board[4][5] + board[4][6] + board[4][7] + board[4][8]+ board[4][9]).contains("OOOOO")
                || (board[5][0] + board[5][1] + board[5][2] + board[5][3]+ board[5][4] + board[5][5] + board[5][6] + board[5][7] + board[5][8]+ board[5][9]).contains("OOOOO")
                || (board[6][0] + board[6][1] + board[6][2] + board[6][3]+ board[6][4] + board[6][5] + board[6][6] + board[6][7] + board[6][8]+ board[6][9]).contains("OOOOO")
                || (board[7][0] + board[7][1] + board[7][2] + board[7][3]+ board[7][4] + board[7][5] + board[7][6] + board[7][7] + board[7][8]+ board[7][9]).contains("OOOOO")
                || (board[8][0] + board[8][1] + board[8][2] + board[8][3]+ board[8][4] + board[8][5] + board[8][6] + board[8][7] + board[8][8]+ board[8][9]).contains("OOOOO")
                || (board[9][0] + board[9][1] + board[9][2] + board[9][3]+ board[9][4] + board[9][5] + board[9][6] + board[9][7] + board[9][8]+ board[9][9]).contains("OOOOO")
                || (board[0][0] + board[1][0] + board[2][0] + board[3][0]+ board[4][0] + board[5][0] + board[6][0] + board[7][0] + board[8][0]+ board[9][0]).contains("XXXXX")
                || (board[0][1] + board[1][1] + board[2][1] + board[3][1]+ board[4][1] + board[5][1] + board[6][1] + board[7][1] + board[8][1]+ board[9][1]).contains("XXXXX")
                || (board[0][2] + board[1][2] + board[2][2] + board[3][2]+ board[4][2] + board[5][2] + board[6][2] + board[7][2] + board[8][2]+ board[9][2]).contains("XXXXX")
                || (board[0][3] + board[1][3] + board[2][3] + board[3][3]+ board[4][3] + board[5][3] + board[6][3] + board[7][3] + board[8][3]+ board[9][3]).contains("XXXXX")
                || (board[0][4] + board[1][4] + board[2][4] + board[3][4]+ board[4][4] + board[5][4] + board[6][4] + board[7][4] + board[8][4]+ board[9][4]).contains("XXXXX")
                || (board[0][5] + board[1][5] + board[2][5] + board[3][5]+ board[4][5] + board[5][5] + board[6][5] + board[7][5] + board[8][5]+ board[9][5]).contains("XXXXX")
                || (board[0][6] + board[1][6] + board[2][6] + board[3][6]+ board[4][6] + board[5][6] + board[6][6] + board[7][6] + board[8][6]+ board[9][6]).contains("XXXXX")
                || (board[0][7] + board[1][7] + board[2][7] + board[3][7]+ board[4][7] + board[5][7] + board[6][7] + board[7][7] + board[8][7]+ board[9][7]).contains("XXXXX")
                || (board[0][8] + board[1][8] + board[2][8] + board[3][8]+ board[4][8] + board[5][8] + board[6][8] + board[7][8] + board[8][8]+ board[9][8]).contains("XXXXX")
                || (board[0][9] + board[1][9] + board[2][9] + board[3][9]+ board[4][9] + board[5][9] + board[6][9] + board[7][9] + board[8][9]+ board[9][9]).contains("XXXXX")
                || (board[0][0] + board[1][0] + board[2][0] + board[3][0]+ board[4][0] + board[5][0] + board[6][0] + board[7][0] + board[8][0]+ board[9][0]).contains("OOOOO")
                || (board[0][1] + board[1][1] + board[2][1] + board[3][1]+ board[4][1] + board[5][1] + board[6][1] + board[7][1] + board[8][1]+ board[9][1]).contains("OOOOO")
                || (board[0][2] + board[1][2] + board[2][2] + board[3][2]+ board[4][2] + board[5][2] + board[6][2] + board[7][2] + board[8][2]+ board[9][2]).contains("OOOOO")
                || (board[0][3] + board[1][3] + board[2][3] + board[3][3]+ board[4][3] + board[5][3] + board[6][3] + board[7][3] + board[8][3]+ board[9][3]).contains("OOOOO")
                || (board[0][4] + board[1][4] + board[2][4] + board[3][4]+ board[4][4] + board[5][4] + board[6][4] + board[7][4] + board[8][4]+ board[9][4]).contains("OOOOO")
                || (board[0][5] + board[1][5] + board[2][5] + board[3][5]+ board[4][5] + board[5][5] + board[6][5] + board[7][5] + board[8][5]+ board[9][5]).contains("OOOOO")
                || (board[0][6] + board[1][6] + board[2][6] + board[3][6]+ board[4][6] + board[5][6] + board[6][6] + board[7][6] + board[8][6]+ board[9][6]).contains("OOOOO")
                || (board[0][7] + board[1][7] + board[2][7] + board[3][7]+ board[4][7] + board[5][7] + board[6][7] + board[7][7] + board[8][7]+ board[9][7]).contains("OOOOO")
                || (board[0][8] + board[1][8] + board[2][8] + board[3][8]+ board[4][8] + board[5][8] + board[6][8] + board[7][8] + board[8][8]+ board[9][8]).contains("OOOOO")
                || (board[0][9] + board[1][9] + board[2][9] + board[3][9]+ board[4][9] + board[5][9] + board[6][9] + board[7][9] + board[8][9]+ board[9][9]).contains("OOOOO")
                || (board[5][0] + board[6][1] + board[7][2] + board[8][3]+ board[9][4]).contains("XXXXX")
                || (board[4][0] + board[5][1] + board[6][2] + board[7][3]+ board[8][4] + board[9][5]).contains("XXXXX")
                || (board[3][0] + board[4][1] + board[5][2] + board[6][3]+ board[7][4] + board[8][5] + board[9][6]).contains("XXXXX")
                || (board[2][0] + board[3][1] + board[4][2] + board[5][3]+ board[6][4] + board[7][5] + board[8][6] + board[9][7]).contains("XXXXX")
                || (board[1][0] + board[2][1] + board[3][2] + board[4][3]+ board[5][4] + board[6][5] + board[7][6] + board[8][7] + board[9][8]).contains("XXXXX")
                || (board[0][0] + board[1][1] + board[2][2] + board[3][3]+ board[4][4] + board[5][5] + board[6][6] + board[7][7] + board[8][8] + board[9][9]).contains("XXXXX")
                || (board[0][1] + board[1][2] + board[2][3] + board[3][4]+ board[4][5] + board[5][6] + board[6][7] + board[7][8] + board[8][9]).contains("XXXXX")
                || (board[0][2] + board[1][3] + board[2][4] + board[3][5]+ board[4][6] + board[5][7] + board[6][8] + board[7][9]).contains("XXXXX")
                || (board[0][3] + board[1][4] + board[2][5] + board[3][6]+ board[4][7] + board[5][8] + board[6][9]).contains("XXXXX")
                || (board[0][4] + board[1][5] + board[2][6] + board[3][7]+ board[4][8] + board[5][9]).contains("XXXXX")
                || (board[0][5] + board[1][6] + board[2][7] + board[3][8]+ board[4][9]).contains("XXXXX")
                || (board[5][0] + board[6][1] + board[7][2] + board[8][3]+ board[9][4]).contains("OOOOO")
                || (board[4][0] + board[5][1] + board[6][2] + board[7][3]+ board[8][4] + board[9][5]).contains("OOOOO")
                || (board[3][0] + board[4][1] + board[5][2] + board[6][3]+ board[7][4] + board[8][5] + board[9][6]).contains("OOOOO")
                || (board[2][0] + board[3][1] + board[4][2] + board[5][3]+ board[6][4] + board[7][5] + board[8][6] + board[9][7]).contains("OOOOO")
                || (board[1][0] + board[2][1] + board[3][2] + board[4][3]+ board[5][4] + board[6][5] + board[7][6] + board[8][7] + board[9][8]).contains("OOOOO")
                || (board[0][0] + board[1][1] + board[2][2] + board[3][3]+ board[4][4] + board[5][5] + board[6][6] + board[7][7] + board[8][8] + board[9][9]).contains("OOOOO")
                || (board[0][1] + board[1][2] + board[2][3] + board[3][4]+ board[4][5] + board[5][6] + board[6][7] + board[7][8] + board[8][9]).contains("OOOOO")
                || (board[0][2] + board[1][3] + board[2][4] + board[3][5]+ board[4][6] + board[5][7] + board[6][8] + board[7][9]).contains("OOOOO")
                || (board[0][3] + board[1][4] + board[2][5] + board[3][6]+ board[4][7] + board[5][8] + board[6][9]).contains("OOOOO")
                || (board[0][4] + board[1][5] + board[2][6] + board[3][7]+ board[4][8] + board[5][9]).contains("OOOOO")
                || (board[0][5] + board[1][6] + board[2][7] + board[3][8]+ board[4][9]).contains("OOOOO")
                || (board[4][0] + board[3][1] + board[2][2] + board[1][3]+ board[0][4]).contains("XXXXX")
                || (board[5][0] + board[4][1] + board[3][2] + board[2][3]+ board[1][4] + board[0][5]).contains("XXXXX")
                || (board[6][0] + board[5][1] + board[4][2] + board[3][3]+ board[2][4] + board[1][5] + board[0][6]).contains("XXXXX")
                || (board[7][0] + board[6][1] + board[5][2] + board[4][3]+ board[3][4] + board[2][5] + board[1][6] + board[0][7]).contains("XXXXX")
                || (board[8][0] + board[7][1] + board[6][2] + board[5][3]+ board[4][4] + board[3][5] + board[2][6] + board[1][7] + board[0][8]).contains("XXXXX")
                || (board[9][0] + board[8][1] + board[7][2] + board[6][3]+ board[5][4] + board[4][5] + board[3][6] + board[2][7] + board[1][8] + board[0][9]).contains("XXXXX")
                || (board[9][1] + board[8][2] + board[7][3] + board[6][4]+ board[5][5] + board[4][6] + board[3][7] + board[2][8] + board[1][9]).contains("XXXXX")
                || (board[9][2] + board[8][3] + board[7][4] + board[6][5]+ board[5][6] + board[4][7] + board[3][8] + board[2][9]).contains("XXXXX")
                || (board[9][3] + board[8][4] + board[7][5] + board[6][6]+ board[5][7] + board[4][8] + board[3][9]).contains("XXXXX")
                || (board[9][4] + board[8][5] + board[7][6] + board[6][7]+ board[5][8] + board[4][9]).contains("XXXXX")
                || (board[9][5] + board[8][6] + board[7][7] + board[6][8]+ board[5][9]).contains("XXXXX")
                || (board[4][0] + board[3][1] + board[2][2] + board[1][3]+ board[0][4]).contains("OOOOO")
                || (board[5][0] + board[4][1] + board[3][2] + board[2][3]+ board[1][4] + board[0][5]).contains("OOOOO")
                || (board[6][0] + board[5][1] + board[4][2] + board[3][3]+ board[2][4] + board[1][5] + board[0][6]).contains("OOOOO")
                || (board[7][0] + board[6][1] + board[5][2] + board[4][3]+ board[3][4] + board[2][5] + board[1][6] + board[0][7]).contains("OOOOO")
                || (board[8][0] + board[7][1] + board[6][2] + board[5][3]+ board[4][4] + board[3][5] + board[2][6] + board[1][7] + board[0][8]).contains("OOOOO")
                || (board[9][0] + board[8][1] + board[7][2] + board[6][3]+ board[5][4] + board[4][5] + board[3][6] + board[2][7] + board[1][8] + board[0][9]).contains("OOOOO")
                || (board[9][1] + board[8][2] + board[7][3] + board[6][4]+ board[5][5] + board[4][6] + board[3][7] + board[2][8] + board[1][9]).contains("OOOOO")
                || (board[9][2] + board[8][3] + board[7][4] + board[6][5]+ board[5][6] + board[4][7] + board[3][8] + board[2][9]).contains("OOOOO")
                || (board[9][3] + board[8][4] + board[7][5] + board[6][6]+ board[5][7] + board[4][8] + board[3][9]).contains("OOOOO")
                || (board[9][4] + board[8][5] + board[7][6] + board[6][7]+ board[5][8] + board[4][9]).contains("OOOOO")
                || (board[9][5] + board[8][6] + board[7][7] + board[6][8]+ board[5][9]).contains("OOOOO"))
        {
            isWinner = true;
        }
        return isWinner;
    }

    boolean isDraw3x3 (String board[][]) {

        boolean isDraw = false;

        if (!board[0][0].equals(" ") && !board[0][1].equals(" ") && !board[0][2].equals(" ")
        && !board[1][0].equals(" ") && !board[1][1].equals(" ") && !board[1][2].equals(" ")
        && !board[2][0].equals(" ") && !board[2][1].equals(" ") && !board[2][2].equals(" ")) {
            isDraw = true;
        }
        return isDraw;
    }

    boolean isDraw10x10 (String board[][]) {

        boolean isDraw = false;

        if (!board[0][0].equals(" ") && !board[0][1].equals(" ") && !board[0][2].equals(" ") && !board[0][3].equals(" ") && !board[0][4].equals(" ") && !board[0][5].equals(" ") && !board[0][6].equals(" ") && !board[0][7].equals(" ") && !board[0][8].equals(" ") && !board[0][9].equals(" ")
         && !board[1][0].equals(" ") && !board[1][1].equals(" ") && !board[1][2].equals(" ") && !board[1][3].equals(" ") && !board[1][4].equals(" ") && !board[1][5].equals(" ") && !board[1][6].equals(" ") && !board[1][7].equals(" ") && !board[1][8].equals(" ") && !board[1][9].equals(" ")
         && !board[2][0].equals(" ") && !board[2][1].equals(" ") && !board[2][2].equals(" ") && !board[2][3].equals(" ") && !board[2][4].equals(" ") && !board[2][5].equals(" ") && !board[2][6].equals(" ") && !board[2][7].equals(" ") && !board[2][8].equals(" ") && !board[2][9].equals(" ")
         && !board[3][0].equals(" ") && !board[3][1].equals(" ") && !board[3][2].equals(" ") && !board[3][3].equals(" ") && !board[3][4].equals(" ") && !board[3][5].equals(" ") && !board[3][6].equals(" ") && !board[3][7].equals(" ") && !board[3][8].equals(" ") && !board[3][9].equals(" ")
         && !board[4][0].equals(" ") && !board[4][1].equals(" ") && !board[4][2].equals(" ") && !board[4][3].equals(" ") && !board[4][4].equals(" ") && !board[4][5].equals(" ") && !board[4][6].equals(" ") && !board[4][7].equals(" ") && !board[4][8].equals(" ") && !board[4][9].equals(" ")
         && !board[5][0].equals(" ") && !board[5][1].equals(" ") && !board[5][2].equals(" ") && !board[5][3].equals(" ") && !board[5][4].equals(" ") && !board[5][5].equals(" ") && !board[5][6].equals(" ") && !board[5][7].equals(" ") && !board[5][8].equals(" ") && !board[5][9].equals(" ")
         && !board[6][0].equals(" ") && !board[6][1].equals(" ") && !board[6][2].equals(" ") && !board[6][3].equals(" ") && !board[6][4].equals(" ") && !board[6][5].equals(" ") && !board[6][6].equals(" ") && !board[6][7].equals(" ") && !board[6][8].equals(" ") && !board[6][9].equals(" ")
         && !board[7][0].equals(" ") && !board[7][1].equals(" ") && !board[7][2].equals(" ") && !board[7][3].equals(" ") && !board[7][4].equals(" ") && !board[7][5].equals(" ") && !board[7][6].equals(" ") && !board[7][7].equals(" ") && !board[7][8].equals(" ") && !board[7][9].equals(" ")
         && !board[8][0].equals(" ") && !board[8][1].equals(" ") && !board[8][2].equals(" ") && !board[8][3].equals(" ") && !board[8][4].equals(" ") && !board[8][5].equals(" ") && !board[8][6].equals(" ") && !board[8][7].equals(" ") && !board[8][8].equals(" ") && !board[8][9].equals(" ")
         && !board[9][0].equals(" ") && !board[9][1].equals(" ") && !board[9][2].equals(" ") && !board[9][3].equals(" ") && !board[9][4].equals(" ") && !board[9][5].equals(" ") && !board[9][6].equals(" ") && !board[9][7].equals(" ") && !board[9][8].equals(" ") && !board[9][9].equals(" ")) {
            isDraw = true;
        }
        return isDraw;
    }
}
