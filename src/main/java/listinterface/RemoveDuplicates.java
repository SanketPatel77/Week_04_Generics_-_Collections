package listinterface;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // list of integers
        ArrayList<Integer> list = new ArrayList<>();
        // add elements to list
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        // call method to remove duplicates
        removeDuplicates(list);
        // print final result
        System.out.println(list);
    }

    // method to remove Duplicates from list
    public static void removeDuplicates(List<Integer> list){
        // create list of Integer
        ArrayList<Integer> removed = new ArrayList<>();

        // iterate each item of list
        for(Integer item : list){
            // check for duplicates
            if(!removed.contains(item)){
                removed.add(item);
            }
        }

        list.clear(); // clear list
        list.addAll(removed); // copy new list to original
    }
}
