package listinterface;
import java.util.*;


public class RotateElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k = 2; // rotation point

        // call rotateElement method
        rotateElement(list,k);

        System.out.println(list); // print rotated list
    }

    public static <T> void rotateElement(List<T> list, int k){
        // create new Arraylist of generic type
        ArrayList<T> rotated = new ArrayList<>(list.subList(k,list.size())); // adding element from k position to size of list
        k = k % list.size(); // find the rotation point

        rotated.addAll(list.subList(0,k)); // add element from 0 to k position at last of the list

        list.clear(); // clear list
        list.addAll(rotated); // copy rotated list to original
    }
}
