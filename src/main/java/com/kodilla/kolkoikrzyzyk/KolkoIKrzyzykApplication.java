package com.kodilla.kolkoikrzyzyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class KolkoIKrzyzykApplication {

    public static void main(String[] args) {

//        ComputerVsRealGame computerVsRealGame = new ComputerVsRealGame();
//        computerVsRealGame.startComputerVsRealGame();

//        ComputerVsRealGameLevelHard computerVsRealGameLevelHard = new ComputerVsRealGameLevelHard();
//        computerVsRealGameLevelHard.startComputerVsRealGame();

//        RealVsRealGame realVsRealGame = new RealVsRealGame();
//        realVsRealGame.startRealVsRealGame();

//        PlayerMode playerMode = new PlayerMode();
//        playerMode.startXAndOGame();

//        Menu menu = new Menu();
//        menu.displayMenu();

        Ranking ranking = new Ranking();
        ranking.loadMap();

    }
}

