package readuserinputfromconsole;

import java.io.*;

public class ReadUserData{
    public static void main(String[] args) {
        // BufferedReader class's object
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = "src/main/java/readuserinputfromconsole/destination.txt"; // file path

        try(FileWriter writer = new FileWriter(filePath)) // Try-with-resources
        {   // taking name from user
            System.out.println("Enter your name : ");
            String name = bufferedReader.readLine();

            System.out.println("Enter your age : "); // taking age from user
            int age = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter your favourite programming language : "); // taking favourite language from user
            String language = bufferedReader.readLine();

            // write name, age, favourite language from console to file
            writer.write("Name : "+name+"\n");
            writer.write("Age : "+age+"\n");
            writer.write("Favourite Language : "+language+"\n");
        }catch (IOException e){
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }catch (NumberFormatException e) {
            System.err.println("Invalid age input. Please enter a number.");
        }
    }
}
