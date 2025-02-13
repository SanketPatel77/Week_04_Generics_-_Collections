package listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindFrequency {
    public static void main(String[] args) {
        // list of string
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange","orange"));
        HashMap<String, Integer> map = new HashMap<>(); // map holds frequency of each string

        // iterate every string in the given string
        for(String item : list){
            map.put(item, map.getOrDefault(item,0)+1); // count frequency of string
        }

        System.out.println(map); // print the frequency of string
    }
}
