package com.kodilla.kolkoikrzyzyk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlayersMoves {

    Scanner scanner = new Scanner(System.in);

    public int makeMove() throws WrongFieldException{
        String playerMove = scanner.nextLine();

        if (!playerMove.equals("A1") && !playerMove.equals("A2") && !playerMove.equals("A3")
        && !playerMove.equals("B1") && !playerMove.equals("B2") && !playerMove.equals("B3")
        && !playerMove.equals("C1") && !playerMove.equals("C2") && !playerMove.equals("C3"))
        {
            throw new WrongFieldException("Wrong field!");
        }

        Map<String, Integer> fieldsMap = new HashMap<>();
        fieldsMap.put("A1", 0);
        fieldsMap.put("A2", 1);
        fieldsMap.put("A3", 2);
        fieldsMap.put("B1", 3);
        fieldsMap.put("B2", 4);
        fieldsMap.put("B3", 5);
        fieldsMap.put("C1", 6);
        fieldsMap.put("C2", 7);
        fieldsMap.put("C3", 8);

        int field = fieldsMap.get(playerMove);

        return field;
    }
}
