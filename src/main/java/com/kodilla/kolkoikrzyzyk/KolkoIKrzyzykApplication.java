package com.kodilla.kolkoikrzyzyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class KolkoIKrzyzykApplication {

    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();


    }
}
