package dmitrii_tofan;

import java.util.HashMap;
import java.util.Map;

public class MapStud {
//    Given two Maps that contain student names as keys and their corresponding scores as values, write a program to find the
//    students who scored higher than  90  and store their names and scores in a new Map. Bellow you can find programm data.
//    Create two Maps of student names and their scores

            public static void main(String[] args) {

            Map<String, Integer> studentScores1 = new HashMap<>();
            studentScores1.put("Elena", 85);
            studentScores1.put("Oleg", 92);
            studentScores1.put("Alina", 78);
            studentScores1.put("Max", 95);

            Map<String, Integer> studentScores2 = new HashMap<>();
            studentScores2.put("Dima", 89);
            studentScores2.put("Olga", 81);
            studentScores2.put("Alice", 91);
            studentScores2.put("Sasha", 87);

            Map<String, Integer> highScorers = new HashMap<>();

            for (Map.Entry<String, Integer> entry : studentScores1.entrySet()) {
                if (entry.getValue() > 90) {
                    highScorers.put(entry.getKey(), entry.getValue());
                }
            }

            for (Map.Entry<String, Integer> entry : studentScores2.entrySet()) {
                if (entry.getValue() > 90) {
                    highScorers.put(entry.getKey(), entry.getValue());
                }
            }

            for (Map.Entry<String, Integer> entry : highScorers.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


