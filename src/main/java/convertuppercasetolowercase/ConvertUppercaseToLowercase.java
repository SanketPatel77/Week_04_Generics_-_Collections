package convertuppercasetolowercase;

import java.io.*;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        // Define the source and destination file paths
        String sourceFile = "src/main/java/convertuppercasetolowercase/source.txt";
        String destinationFile = "src/main/java/convertuppercasetolowercase/destination.txt";

        // Call the method to convert uppercase to lowercase
        convertUppercaseToLowercase(sourceFile, destinationFile);
    }

    private static void convertUppercaseToLowercase(String sourceFilePath, String destinationFilePath) {
        try (
                FileReader fileReader = new FileReader(sourceFilePath); // Read file character by character
                BufferedReader bufferedReader = new BufferedReader(fileReader); // Buffer for efficient reading
                FileWriter fileWriter = new FileWriter(destinationFilePath); // Write data to output file
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) // Buffer for efficient writing
        ) {
            String readData;
            while ((readData = bufferedReader.readLine()) != null) { // Read each line from the file
                bufferedWriter.write(readData.toLowerCase()); // Convert line to lowercase and write
                bufferedWriter.newLine(); // Write a new line
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage()); // Handle file not found exception
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage()); // Handle IO exception
        }
    }
}
