import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        StringBuilder content = new StringBuilder();
        try(FileReader reader = new FileReader(fileName)) {
            int character;
            while((character = reader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println("Content of " + fileName + " : ");
            System.out.println(content.toString());
        } catch(IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
