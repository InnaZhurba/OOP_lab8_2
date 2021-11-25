import lombok.SneakyThrows;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public enum MailCode {
    HAPPY_BIRTHDAY("src/main/happy_birthday.txt"), GREETINGS("src/main/greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText() {
        // Read file
        // Inject client data
        // Return text
        return Read2();
    }
     private String Read2(){
         File file = new File(filename);
         StringBuilder fileContents = new StringBuilder((int)file.length());

         try (Scanner scanner = new Scanner(file)) {
             while(scanner.hasNextLine()) {
                 fileContents.append(scanner.nextLine() + System.lineSeparator());
             }
             return fileContents.toString();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         return fileContents.toString();
     }
    private String Read(){
        File file = new File(filename);
        StringBuilder str = new StringBuilder();
        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                int i = sc.nextInt();
                str.append(i);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return str.toString();
    }
}
