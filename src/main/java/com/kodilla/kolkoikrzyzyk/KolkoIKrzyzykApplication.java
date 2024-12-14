package com.kodilla.kolkoikrzyzyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class KolkoIKrzyzykApplication {

    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();

    }
}

