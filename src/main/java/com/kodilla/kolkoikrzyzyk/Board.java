package com.kodilla.kolkoikrzyzyk;

import java.util.ArrayList;
import java.util.List;

public class Board {

    final String border = "|";

    List<String> fieldsList = new ArrayList<>();

    public Board(List<String> fieldsList) {
        this.fieldsList = fieldsList;
    }

    public List<String> printBoard(List<String> fieldsList) {



//        List<String> fieldsList = new ArrayList<>();
//        fieldsList.add(" ");
//        fieldsList.add(" ");
//        fieldsList.add(" ");
//        fieldsList.add(" ");
//        fieldsList.add(" ");
//        fieldsList.add(" ");
//        fieldsList.add(" ");
//        fieldsList.add(" ");
//        fieldsList.add(" ");

        System.out.print(border);
        System.out.print(fieldsList.get(0));
        System.out.print(border);
        System.out.print(fieldsList.get(1));
        System.out.print(border);
        System.out.print(fieldsList.get(2));
        System.out.println(border);
        System.out.print(border);
        System.out.print(fieldsList.get(3));
        System.out.print(border);
        System.out.print(fieldsList.get(4));
        System.out.print(border);
        System.out.print(fieldsList.get(5));
        System.out.println(border);
        System.out.print(border);
        System.out.print(fieldsList.get(6));
        System.out.print(border);
        System.out.print(fieldsList.get(7));
        System.out.print(border);
        System.out.print(fieldsList.get(8));
        System.out.println(border);

        return fieldsList;
    }
}
