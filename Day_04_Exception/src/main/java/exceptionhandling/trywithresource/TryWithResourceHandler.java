package exceptionhandling.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceHandler {
    public static void main(String[] args) {
        // example file
        String filePath = "temp.txt";

        //Use try-with-resources to ensure the file is automatically closed after reading.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            //If the file exists, print its first line.
            String firstLine = bufferedReader.readLine();
            System.out.println(firstLine);

        }
        //Handle any IOException that may occur.
        catch (IOException e) {
            //If the file does not exist, catch IOException and print "Error reading file".
            System.out.println("Error reading file :" + e.getMessage());
        }
    }
}
