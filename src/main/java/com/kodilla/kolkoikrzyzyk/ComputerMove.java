package com.kodilla.kolkoikrzyzyk;

import java.util.Random;

public class ComputerMove {


    public Integer[] getComputerPlayerMove(String[][] board) {

        EmptyBoard emptyBoard = new EmptyBoard();
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

    public Integer[] getComputerPlayerMoveLevelHard(String[][] board, Integer[] computerPlayerMoveBoard) {

        Random random = new Random();
//        EmptyBoard emptyBoard = new EmptyBoard();
//        String[][] emptyBoard3X3 = emptyBoard.getEmptyBoard3X3();
//        String[][] emptyBoard10X10 = emptyBoard.getEmptyBoard10X10();
//
//        if (board.equals(emptyBoard3X3)) {
//            int column = random.nextInt(3) + 1;
//            int row = random.nextInt(3) + 1;
//
//            Integer[] computerPlayerMoveBoard1 = new Integer[2];
//            computerPlayerMoveBoard1[0] = column;
//            computerPlayerMoveBoard1[1] = row;
//
//            return computerPlayerMoveBoard1;
//        } else if (board.equals(emptyBoard10X10)) {
//            int column = random.nextInt(10) + 1;
//            int row = random.nextInt(10) + 1;
//
//            Integer[] computerPlayerMoveBoard1 = new Integer[2];
//            computerPlayerMoveBoard1[0] = column;
//            computerPlayerMoveBoard1[1] = row;
//
//            return computerPlayerMoveBoard1;
//        }

        int plusOrMinus = random.nextInt(8);

        if (plusOrMinus == 0) {
            int column = computerPlayerMoveBoard[0] - 1;
            int row = computerPlayerMoveBoard[1] - 1;

            if (row > board.length || row <= 0 || column > board.length || column <= 0) {
                System.out.println("Invalid row or column!");
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }

            Integer[] computerPlayerMoveBoard1 = new Integer[2];
            computerPlayerMoveBoard1[0] = column;
            computerPlayerMoveBoard1[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }
            return computerPlayerMoveBoard1;
        } else if (plusOrMinus == 1) {
            int column = computerPlayerMoveBoard[0] + 1;
            int row = computerPlayerMoveBoard[1] + 1;

            if (row > board.length || row <= 0 || column > board.length || column <= 0) {
                System.out.println("Invalid row or column!");
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }

            Integer[] computerPlayerMoveBoard1 = new Integer[2];
            computerPlayerMoveBoard1[0] = column;
            computerPlayerMoveBoard1[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }
            return computerPlayerMoveBoard1;
        } else if (plusOrMinus == 2) {
            int column = computerPlayerMoveBoard[0] - 1;
            int row = computerPlayerMoveBoard[1] + 1;

            if (row > board.length || row <= 0 || column > board.length || column <= 0) {
                System.out.println("Invalid row or column!");
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }

            Integer[] computerPlayerMoveBoard1 = new Integer[2];
            computerPlayerMoveBoard1[0] = column;
            computerPlayerMoveBoard1[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }
            return computerPlayerMoveBoard1;
        } else if (plusOrMinus == 3) {
            int column = computerPlayerMoveBoard[0] + 1;
            int row = computerPlayerMoveBoard[1] - 1;

            if (row > board.length || row <= 0 || column > board.length || column <= 0) {
                System.out.println("Invalid row or column!");
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }

            Integer[] computerPlayerMoveBoard1 = new Integer[2];
            computerPlayerMoveBoard1[0] = column;
            computerPlayerMoveBoard1[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }
            return computerPlayerMoveBoard1;
        } else if (plusOrMinus == 4) {
            int column = computerPlayerMoveBoard[0] + 1;
            int row = computerPlayerMoveBoard[1];

            if (row > board.length || row <= 0 || column > board.length || column <= 0) {
                System.out.println("Invalid row or column!");
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }

            Integer[] computerPlayerMoveBoard1 = new Integer[2];
            computerPlayerMoveBoard1[0] = column;
            computerPlayerMoveBoard1[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }
            return computerPlayerMoveBoard1;
        } else if (plusOrMinus == 5) {
            int column = computerPlayerMoveBoard[0] - 1;
            int row = computerPlayerMoveBoard[1];

            if (row > board.length || row <= 0 || column > board.length || column <= 0) {
                System.out.println("Invalid row or column!");
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }

            Integer[] computerPlayerMoveBoard1 = new Integer[2];
            computerPlayerMoveBoard1[0] = column;
            computerPlayerMoveBoard1[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }
            return computerPlayerMoveBoard1;
        } else if (plusOrMinus == 6) {
            int column = computerPlayerMoveBoard[0];
            int row = computerPlayerMoveBoard[1] + 1;

            if (row > board.length || row <= 0 || column > board.length || column <= 0) {
                System.out.println("Invalid row or column!");
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }

            Integer[] computerPlayerMoveBoard1 = new Integer[2];
            computerPlayerMoveBoard1[0] = column;
            computerPlayerMoveBoard1[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }
            return computerPlayerMoveBoard1;
        } else if (plusOrMinus == 7) {
            int column = computerPlayerMoveBoard[0];
            int row = computerPlayerMoveBoard[1] - 1;

            if (row > board.length || row <= 0 || column > board.length || column <= 0) {
                System.out.println("Invalid row or column!");
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }

            Integer[] computerPlayerMoveBoard1 = new Integer[2];
            computerPlayerMoveBoard1[0] = column;
            computerPlayerMoveBoard1[1] = row;

            if (board[row - 1][column - 1].contains("X")
                    || board[row - 1][column - 1].contains("O")) {
                return getComputerPlayerMoveLevelHard(board, computerPlayerMoveBoard);
            }
            return computerPlayerMoveBoard1;
        }
        return null;
    }
}
