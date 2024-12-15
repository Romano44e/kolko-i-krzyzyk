package com.kodilla.kolkoikrzyzyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class KolkoIKrzyzykApplication {

    public static void main(String[] args) {

//        SingleOrMultiplayer singleOrMultiplayer = new SingleOrMultiplayer();
//        singleOrMultiplayer.chooseSingleOrMultiplayer();

//        RealVsRealGame game = new RealVsRealGame();
//        game.startRealVsRealGame();

        ComputerVsRealGame game = new ComputerVsRealGame();
        game.startComputerVsRealGame();

    }
}

