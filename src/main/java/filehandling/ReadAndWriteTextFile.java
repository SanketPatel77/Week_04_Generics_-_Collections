package filehandling;
import java.io.*;

public class ReadAndWriteTextFile {
    public static void main(String[] args) {
        // Define source and destination file paths
        String sourceFile = "src/main/java/filehandling/source.txt";
        String destinationFile = "src/main/java/filehandling/destination.txt";

        // Try-with-resources to ensure streams are closed automatically
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            // Read from source file and write to destination file byte by byte
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            // Handle case where source file is not found
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle other I/O exceptions
            System.out.println("Error reading or writing file: " + e.getMessage());
        }
    }
}
