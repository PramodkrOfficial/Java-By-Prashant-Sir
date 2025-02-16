package in.kgcoding.file;

import java.io.FileReader;
import java.io.IOException;

public class KgFileReader {
    public static void main(String[] args) {
        String fileName = "Java-Course.txt";

        try (FileReader reader = new FileReader(fileName)){
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            } while (read != -1);

        } catch (IOException e) {
            System.out.printf("Exception occurred: %s", e.getMessage());
        }
    }
}
