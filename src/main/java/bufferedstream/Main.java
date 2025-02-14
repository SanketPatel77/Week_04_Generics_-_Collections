package bufferedstream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceFilePath = "src/main/java/bufferedstream/test.txt"; // Replace with your large file path
        String destinationBufferedPath = "src/main/java/bufferedstream/buffered.txt";
        String destinationUnbufferedPath = "src/main/java/bufferedstream/unbuffered.txt";

        // Create a dummy large file if it doesn't exist (for testing)
        if (!Files.exists(Paths.get(sourceFilePath))) {
            CopyFile.createLargeFile(sourceFilePath, 50 * 1024 * 1024); // 50MB
        }

        System.out.println("Starting copy with Buffered Streams...");
        long bufferedTime = CopyFile.copyFileBuffered(sourceFilePath, destinationBufferedPath);
        System.out.println("Buffered copy time: " + bufferedTime + " ns");

        System.out.println("\nStarting copy with Unbuffered Streams...");
        long unbufferedTime = CopyFile.copyFileUnbuffered(sourceFilePath, destinationUnbufferedPath);
        System.out.println("Unbuffered copy time: " + unbufferedTime + " ns");

        System.out.println("\nPerformance Comparison:");
        System.out.println("Buffered is " + (double) unbufferedTime / bufferedTime + "x faster.");

    }
}