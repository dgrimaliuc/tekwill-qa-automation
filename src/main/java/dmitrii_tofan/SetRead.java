package dmitrii_tofan;

import java.util.*;

public class SetRead {
//    2.	Write a program that reads a sentence from the user and stores each unique word in a Set.
//    Print the total number of unique words and display them in alphabetical order.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String sentence = scanner.nextLine();

        Set<String> uniqueWords = new HashSet<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println("Total number of unique words: " + uniqueWords.size());

        List<String> sortedWords = new ArrayList<>(uniqueWords);
        Collections.sort(sortedWords);

        System.out.println("Unique words in alphabetic order:");
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}
