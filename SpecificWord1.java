import java.io.FileReader;
import java.io.IOException;

public class SpecificWord1 {
    public static void main(String[] args) {
        String filePath = "name.txt"; 
        String targetWord = "amruta";      

        StringBuilder fileContent = new StringBuilder();

        try (FileReader reader = new FileReader(filePath)) {
            int character;

            while ((character = reader.read()) != -1) {
                fileContent.append((char) character);
            }

            String content = fileContent.toString();
            String[] words = content.split("\\s+"); 

            boolean found = false;

            for (String word : words) {
                if (word.equals(targetWord)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("The word '" + targetWord + "' was found in the file.");
            } else {
                System.out.println("The word '" + targetWord + "' was NOT found in the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }
}
