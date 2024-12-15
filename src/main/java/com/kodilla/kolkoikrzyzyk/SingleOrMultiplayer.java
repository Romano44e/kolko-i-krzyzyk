package com.kodilla.kolkoikrzyzyk;

import java.util.Scanner;

public class SingleOrMultiplayer {

    Scanner scanner  = new Scanner(System.in);
    ComputerVsRealGame computerVsRealGame = new ComputerVsRealGame();
    RealVsRealGame realVsRealGame = new RealVsRealGame();

    public void chooseSingleOrMultiplayer() {
        System.out.println("Choose player mode: \n"
        + "1 - Single player\n"
        + "2 - Multiplayer");
        System.out.println();
        String playerMode = scanner.nextLine();
        if (playerMode.equals("1")) {
            System.out.println("You have chosen player mode: Single player");
            System.out.println();
            computerVsRealGame.startComputerVsRealGame();
        } else if (playerMode.equals("2")) {
            System.out.println("You have chosen player mode: Multiplayer");
            System.out.println();
            realVsRealGame.startRealVsRealGame();
        }
    }
}
