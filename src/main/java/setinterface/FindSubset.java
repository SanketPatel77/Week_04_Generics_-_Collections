package setinterface;

import java.util.Arrays;
import java.util.HashSet;

public class FindSubset {
    public static <T> boolean isSubsetOfAnother(HashSet<T> s1, HashSet<T> s2) {
        boolean flag = true;
        for (T item : s1) {
            if (!s2.contains(item)) {
                flag = false;
                break;
            }
        }
        if (flag) return true;

        flag = true;
        for (T item : s2) {
            if (!s1.contains(item)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        // given two set
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(new Integer[]{2, 3}));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(new Integer[]{1, 2, 3, 4}));

        // finding if either set is a subset of the other
        System.out.println(isSubsetOfAnother(set2, set1));
    }
}