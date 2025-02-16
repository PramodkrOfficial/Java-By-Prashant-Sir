import java.io.FileReader;
import java.io.IOException;

public class FileMyReader { // Renamed class
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (FileReader reader = new FileReader(fileName)) { // Correct usage
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Print instead of println
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
