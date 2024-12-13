package com.kodilla.kolkoikrzyzyk;

import java.util.Scanner;

public class PlayerNames {
    Scanner scanner = new Scanner(System.in);

    String player1Name;
    String player2Name;

    public String getPlayer1Name() {
        System.out.println("Player 1, please enter your name: ");
        player1Name = scanner.nextLine();
        System.out.println("Hello " + player1Name + "!");
        System.out.println();
        return player1Name;
    }

    public String getPlayer2Name() {
        System.out.println("Player 2, please enter your name: ");
        player2Name = scanner.nextLine();
        System.out.println("Hello " + player2Name + "!");
        System.out.println();
        return player2Name;
    }
}
