package convertimagetobytearray;

import java.io.*;

public class ConvertImageToByteArray {
    public static void main(String[] args) {
        String filePath = "src/main/java/convertimagetobytearray/input.webp"; // Path of the input image
        String outputPath = "src/main/java/convertimagetobytearray/output.webp"; // Path for the output image

        // Convert image to byte array
        byte[] imageBytes = convertImageToByteArray(filePath);

        if (imageBytes != null) {
            System.out.println("Image successfully converted to byte array. Size: " + imageBytes.length + " bytes.");
        } else {
            System.out.println("Failed to convert image.");
        }

        // Convert byte array back to image
        convertByteArrayToImage(imageBytes, outputPath);
    }

    private static byte[] convertImageToByteArray(String filePath) {
        byte[] imageBytes = null; // Initialize byte array

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath); // Read file input
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // Store bytes in memory
        ) {
            byte[] buffer = new byte[1024]; // Buffer for reading file
            int byteData;
            while ((byteData = fileInputStream.read(buffer)) != -1) { // Read file in chunks
                byteArrayOutputStream.write(buffer, 0, byteData); // Write to byte array output stream
            }

            imageBytes = byteArrayOutputStream.toByteArray(); // Convert to byte array

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + e.getMessage());
        }

        return imageBytes; // Return the byte array
    }

    private static void convertByteArrayToImage(byte[] imageBytes, String outputPath) {
        try (
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes); // Read byte array
                FileOutputStream fileOutputStream = new FileOutputStream(outputPath); // Write to new file
        ) {
            byte[] buffer = new byte[1024]; // Buffer for writing file
            int byteData;
            while ((byteData = byteArrayInputStream.read(buffer)) != -1) { // Read bytes in chunks
                fileOutputStream.write(buffer, 0, byteData); // Write to output file
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Error writing file: " + e.getMessage());
        }

        System.out.println("Successfully convert byte array to image.");
    }
}
