package com.kodilla.kolkoikrzyzyk;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Ranking implements Serializable {
    File savedHashMaps = new File("ranking.txt");
    Map<String, Integer> map = new HashMap<>();

    public void saveMap(Map<String, Integer> map) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(savedHashMaps));
            oos.writeObject(map);
            oos.close();
        } catch (Exception e) {
            // obsługa błędów
        }
    }

    public void loadMap() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(savedHashMaps));
            Object readMap = ois.readObject();
            if (readMap instanceof HashMap) {
                map.putAll((HashMap) readMap);
            }
            System.out.println(readMap);
            ois.close();
        } catch (Exception e) {
            // obsługa błędów
        }
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "savedHashMaps=" + savedHashMaps +
                ", map=" + map +
                '}';
    }
}
