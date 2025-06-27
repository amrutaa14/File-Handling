import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {  
  public static void main(String[] args) {  
    try {
      File myObj = new File("Name.txt");
      Scanner myReader = new Scanner(myObj);  

      String keyword = "prathmesh"; 
      boolean found = false;
      
    
      while (myReader.hasNextLine()) {
        String line = myReader.nextLine();

        
        String[] words = line.split(" ");

        
        for (int i = 0; i < words.length; i++) {
          if (words[i].equalsIgnoreCase(keyword)) {
            System.out.println("Found '" + keyword + "' in line: " + line);
            found = true;
            break; 
          }
        }

        if (found) {
          break; 
        }
      }


      if (!found) {
        
      }

      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
}
