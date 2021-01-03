package Week8.Experiment6;

import java.io.IOException;
import java.nio.file.*;

public class CopyFile {
    public static void main(String[] args) {

        Path sourceFilePath = Paths.get("./bar.txt");
        Path targetFilePath = Paths.get(System.getProperty("user.home") + "/Desktop/bar-copy.txt");

        try {
            Files.copy(sourceFilePath, targetFilePath);
        } catch (FileAlreadyExistsException ex) {
            System.out.println("File already exists");
        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }
    }
}
