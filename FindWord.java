import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWord{
    public static void main(String[] args) {
        
        String searchWord = "name";
        boolean found = false;

        try {
            File file = new File("Name.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "");
                if (word.equalsIgnoreCase(searchWord)) {
                    found = true;
                    System.out.println("Word found: " + word);
                    System.out.println("Length of word: " + word.length());
                    break; 
                }
            }

            if (!found) {
                System.out.println("Word not found in the file.");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}