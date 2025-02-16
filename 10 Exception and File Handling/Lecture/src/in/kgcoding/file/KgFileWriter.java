package in.kgcoding.file;

import java.io.FileWriter;
import java.io.IOException;

public class KgFileWriter {
    public static void main(String[] args) {
        String fileName = "Java-Course.txt";
        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write("This is the best Java Course.\n");
            for (int i = 0; i < 1000; i++) {
                writer.write("*, 123");
            }
            writer.flush();
            System.out.println("File Written Successfully");
        } catch (IOException exception) {
            System.out.printf("Exception occurred %s\n", exception.getMessage());
        }

    }
}
