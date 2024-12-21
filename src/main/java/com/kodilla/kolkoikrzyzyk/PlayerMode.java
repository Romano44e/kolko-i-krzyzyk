package com.kodilla.kolkoikrzyzyk;

import java.util.Scanner;

public class PlayerMode {

    Scanner scanner  = new Scanner(System.in);
    ComputerVsRealGame computerVsRealGame = new ComputerVsRealGame();
    ComputerVsRealGameLevelHard computerVsRealGameLevelHard = new ComputerVsRealGameLevelHard();
    RealVsRealGame realVsRealGame = new RealVsRealGame();
    DifficultyLevel difficultyLevel = new DifficultyLevel();

    public void startXAndOGame() {
        System.out.println("Choose player mode: \n"
        + "1 - Single player\n"
        + "2 - Multiplayer\n");

        String playerMode = scanner.nextLine();
        System.out.println();
        if (playerMode.equals("1")) {
            System.out.println("You have chosen player mode: Single player");
            System.out.println();
            String difficultyLevel1 = difficultyLevel.getDifficultyLevel();
            if (difficultyLevel1.equals("1") || difficultyLevel1.equals("2")) {
                computerVsRealGame.startComputerVsRealGame();
            } else if (difficultyLevel1.equals("3")) {
                computerVsRealGameLevelHard.startComputerVsRealGame();
            }
        } else if (playerMode.equals("2")) {
            System.out.println("You have chosen player mode: Multiplayer");
            System.out.println();
            realVsRealGame.startRealVsRealGame();
        }
    }
}
