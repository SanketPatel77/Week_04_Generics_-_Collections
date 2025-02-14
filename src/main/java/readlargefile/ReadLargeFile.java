package readlargefile;

import java.io.*;

public class ReadLargeFile {
    public static void main(String[] args) {
        String filePath = "src/main/java/readlargefile/largefile.txt"; // Path to the large file

        readLargeFile(filePath);
    }

    private static void readLargeFile(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) { // Case-insensitive check
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
