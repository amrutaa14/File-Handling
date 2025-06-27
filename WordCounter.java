import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        
        File file = new File("Name.txt");
        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase().replaceAll("[^a-z]", ""); 
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
            scanner.close();

            System.out.println("Repeated words in the file:");
            for (String word : wordCount.keySet()) {
                int count = wordCount.get(word);
                if (count > 1) {
                    System.out.println(word + " -> " + count + " times");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}