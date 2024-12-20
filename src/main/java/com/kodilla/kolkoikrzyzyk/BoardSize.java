package com.kodilla.kolkoikrzyzyk;

import java.util.Scanner;

public class BoardSize {

    Scanner scanner = new Scanner(System.in);
    EmptyBoard emptyBoard = new EmptyBoard();

    public String[][] choseBoardSize() {

        System.out.println("Choose player board size: \n"
                + "1 - board 3x3\n"
                + "2 - board 10x10\n");

        String boardSize = scanner.nextLine();
        System.out.println();
        if (boardSize.equals("1")) {
            System.out.println("You have chosen board size 3x3");
            System.out.println();
            String[][] emptyBoard1 = emptyBoard.getEmptyBoard3X3();
            return emptyBoard1;
        } else if (boardSize.equals("2")) {
            System.out.println("You have chosen board size 10x10");
            System.out.println();
            String[][] emptyBoard2 = emptyBoard.getEmptyBoard10X10();
            return emptyBoard2;
        }
        return null;
    }
}
