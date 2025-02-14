package queueinterface;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    // attributes name and severity
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Define natural ordering (Higher severity = Higher priority)
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity); // Descending order
    }

    @Override
    public String toString() {
        return name ;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        // PriorityQueue with natural ordering based on Comparable
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        // Add patients
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Process patients
        System.out.println("Treatment Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
