package com.kodilla.kolkoikrzyzyk;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    PlayerMode singleOrMultiplayer = new PlayerMode();
    InitialInformation init = new InitialInformation();
    Ranking ranking = new Ranking();

    public void displayMenu() {

        init.getInitialInformation();

        System.out.println("Menu: \n"
                + "1 - Start Game \n"
                + "2 - Ranking results \n"
                + "3 - Exit\n"
                + "\n"
                + "Enter your choice(1, 2 or 3): \n");

        int choice = sc.nextInt();
        System.out.println();
        if (choice == 1) {
            singleOrMultiplayer.startXAndOGame();
        } else if (choice == 2) {
            System.out.println("Here is the ranking results: ");
            ranking.loadMap();
        } else if (choice == 3) {
            System.out.println("Are you sure you want to exit the game?\n"
            + "1 - yes \n"
            + "2 - no");
            int yesOrNo = sc.nextInt();

            if (yesOrNo == 1) {
                System.exit(0);
            } else if (yesOrNo == 2) {
                displayMenu();
            }
        }
    }
}
