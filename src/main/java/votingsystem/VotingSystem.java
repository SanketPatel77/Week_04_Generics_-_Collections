package votingsystem;

import java.util.*;

public class VotingSystem {
    public static Map<String, Integer> hashMap;
    public static Map<String, Integer> treeMap;
    public static Map<String, Integer> linkedHashMap;

    static {
        hashMap = new HashMap<>();
        treeMap = new TreeMap<>();
        linkedHashMap = new LinkedHashMap<>();
    }

    public static void addCandidates(String name, int votes) {
        hashMap.put(name, votes);
        treeMap.put(name, votes);
        linkedHashMap.put(name, votes);
    }

    public static void showSortedVotes() {
        if(treeMap.isEmpty()) {
            System.out.println("No candidate record found!");
            return;
        }

        // Convert the entry set to a list
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(treeMap.entrySet());

        // Sort the list based on values
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println("{" + entry.getKey() + " -> " + entry.getValue() + "}");
        }

        System.out.println();
    }

    public static void showOrderOfVotes() {
        if(linkedHashMap.isEmpty()) {
            System.out.println("No candidate record found!");
            return;
        }

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.print("{" + entry.getKey() + " , votes: " + entry.getValue() + "} -> ");
        }

        System.out.println();
    }
}