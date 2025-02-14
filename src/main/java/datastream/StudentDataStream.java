package datastream;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String filePath = "src/main/java/datastream/studentData.bin"; // Binary file to store student data

        // Create student data and write to file
        writeStudentData(filePath, 101, "Rahul", 8.5);
        writeStudentData(filePath, 102, "Ananya", 9.2);
        writeStudentData(filePath, 103, "Vikram", 7.8);

        // Read and display student data
        readStudentData(filePath);
    }

    private static void writeStudentData(String filePath, int rollNumber, String name, double gpa) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath, true); // Append mode
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream) // Write primitive data
        ) {
            dataOutputStream.writeInt(rollNumber); // Write roll number
            dataOutputStream.writeUTF(name); // Write name
            dataOutputStream.writeDouble(gpa); // Write GPA
        } catch (IOException e) {
            System.err.println("Error writing student data: " + e.getMessage());
        }
    }

    private static void readStudentData(String filePath) {
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream)
        ) {
            System.out.println("Reading student data from file:");
            while (dataInputStream.available() > 0) { // Check if data is available
                int rollNumber = dataInputStream.readInt(); // Read roll number
                String name = dataInputStream.readUTF(); // Read name
                double gpa = dataInputStream.readDouble(); // Read GPA
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading student data: " + e.getMessage());
        }
    }
}
