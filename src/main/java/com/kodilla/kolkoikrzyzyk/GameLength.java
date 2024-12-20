package com.kodilla.kolkoikrzyzyk;

import java.util.Scanner;

public class GameLength {

    Scanner scanner = new Scanner(System.in);

    public int getGameLength() {

        System.out.println("Enter the number of rounds won after which the game will end: ");
        int WinGameNumber = scanner.nextInt();

        return WinGameNumber;
    }
}
