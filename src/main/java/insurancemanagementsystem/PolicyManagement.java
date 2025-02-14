package insurancemanagementsystem;

import java.util.*;

// Policy management class definition
public class PolicyManagement {
    public static HashSet<Policy> checker;
    public static LinkedHashSet<Policy> orders;
    public static NavigableSet<Policy> sortedByExpiry;

    // Static method for initializing the sets object
    static  {
        checker = new HashSet<>();
        orders = new LinkedHashSet<>();
        sortedByExpiry = new TreeSet<>();
    }

    // Storing the unique policies in all sets
    public static void storeUniquePolicies(Policy policy) {
        checker.add(policy);
        orders.add(policy);
        sortedByExpiry.add(policy);
    }

    // Getting all unique policies
    public static void getAllUniquePolicies() {
        Iterator<Policy> itr = checker.iterator();

        while(itr.hasNext()) {
            Policy policy = itr.next();
            System.out.println(policy);
            System.out.println("\n------------------------------------");
        }
    }

    // Get policy which is expiring soon
    public static void getPolicyExpiringSoon() {
        Policy policy = sortedByExpiry.pollFirst();
        System.out.println(policy);
        System.out.println("\n------------------------------------");
    }

    // Displaying the duplicate policy by policy number
    public static void displayDuplicatePolicyByPolicyNumber() {
        HashSet<Integer> policyNumbers = new HashSet<>();
        Iterator<Policy> itr = orders.iterator();

        while(itr.hasNext()) {
            Policy policy = itr.next();

            if(policyNumbers.contains(policy.getPolicyNumber())) {
                System.out.println(policy);
                System.out.println("-----------------------------------");
            }

            policyNumbers.add(policy.getPolicyNumber());
        }
    }

    // Get performance comparison on different type of set by adding
    public static void getPerformanceComparisonOnAdding(Policy policy) {
        System.out.println("---------------------\nPerformance on adding is: ");

        long start = System.nanoTime();
        checker.add(policy);
        long end = System.nanoTime();

        System.out.println("Performance on the Hashset is: " + (end - start));

        start = System.nanoTime();
        orders.add(policy);
        end = System.nanoTime();

        System.out.println("Performance on the Hashset is: " + (end - start));

        start = System.nanoTime();
        sortedByExpiry.add(policy);
        end = System.nanoTime();

        System.out.println("Performance on the Hashset is: " + (end - start) + "\n");
    }

    // Get performance comparison on different type of set by removing
    public static void getPerformanceComparisonOnRemoving(Policy policy) {
        System.out.println("---------------------\nPerformance on removing is: ");

        long start = System.nanoTime();
        checker.remove(policy);
        long end = System.nanoTime();

        System.out.println("Performance on the Hashset is: " + (end - start));

        start = System.nanoTime();
        orders.remove(policy);
        end = System.nanoTime();

        System.out.println("Performance on the Hashset is: " + (end - start));

        start = System.nanoTime();
        sortedByExpiry.remove(policy);
        end = System.nanoTime();

        System.out.println("Performance on the Hashset is: " + (end - start) + "\n");
    }

    // Get performance comparison on different type of set by searching
    public static void getPerformanceComparisonOnSearching(Policy policy) {
        System.out.println("---------------------\nPerformance on searching is: ");

        long start = System.nanoTime();
        checker.contains(policy);
        long end = System.nanoTime();

        System.out.println("Performance on the Hashset is: " + (end - start));

        start = System.nanoTime();
        orders.contains(policy);
        end = System.nanoTime();

        System.out.println("Performance on the Hashset is: " + (end - start));

        start = System.nanoTime();
        sortedByExpiry.contains(policy);
        end = System.nanoTime();

        System.out.println("Performance on the Hashset is: " + (end - start) + "\n");
    }

    // Getting policy of specific coverage
    public static void getPolicyOfSpecificCoverageType(String coverageType) {
        Iterator<Policy> itr = orders.iterator();
        System.out.println("All policies of coverage type " + coverageType + " are: ");

        while(itr.hasNext()) {
            Policy policy = itr.next();
            if(policy.getCoverageType().equals(coverageType)) {
                System.out.println(policy);
                System.out.println(" ------------------------------------");
            }
        }
    }
}