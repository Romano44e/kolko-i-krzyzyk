package com.kodilla.kolkoikrzyzyk;

import java.util.Scanner;

public class DifficultyLevel {

    Scanner scanner = new Scanner(System.in);

    public String getDifficultyLevel() {

        System.out.println("Choose difficulty level: \n"
        + "1 - Easy\n"
        + "2 - Medium\n"
        + "3 - Hard\n");

        String difficultyLevel = scanner.nextLine();

        return difficultyLevel;
    }
}
