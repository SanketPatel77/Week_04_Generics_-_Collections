package listinterface;

import java.util.Iterator;
import java.util.LinkedList;

public class FindNthElement {
    public static void main(String[] args) {
        // create a LinkedList
        LinkedList<Character> list = new LinkedList<>();
        // add elements to list
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        int n = 2; // nth value

        // call findNthElement method
        Character result = findNthElement(list, n);
        // print result
        System.out.println(result);
    }

    // method to find nth element
    public static <T> T findNthElement(LinkedList<T> list, int n){
        // two pointers first and second to iterate list
        Iterator<T> first = list.listIterator();
        Iterator<T> second = list.listIterator();

        // move second pointer n time
        while(n>0){
            second.next();
            n--;
        }

        // move both pointer until second is not null
        while(second.hasNext()){
            first.next();
            second.next();
        }

        // return value
        return first.next();
    }
}
