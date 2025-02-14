package insurancemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Policy object creation
        Policy policy1 = new Policy(506, "Raj", 7, "Life insurance", 6700);
        Policy policy2 = new Policy(886, "Rajesh", 29, "Health Insurance", 7890);
        Policy policy3 = new Policy(966, "Sam", 1, "Auto Insurance", 5674);
        Policy policy4 = new Policy(488, "Raju", 12, "Home insurance", 9800);
        Policy policy5 = new Policy(785, "Pankaj", 12, "Home insurance", 2399);

        // Adding the policy to the sets
        PolicyManagement.storeUniquePolicies(policy1);
        PolicyManagement.storeUniquePolicies(policy2);
        PolicyManagement.storeUniquePolicies(policy3);
        PolicyManagement.storeUniquePolicies(policy4);
        PolicyManagement.storeUniquePolicies(policy5);

        // Different types of the method invocation
        PolicyManagement.getAllUniquePolicies();
        PolicyManagement.getPolicyExpiringSoon();
        PolicyManagement.displayDuplicatePolicyByPolicyNumber();

        // Performance comparison on different operations
        Policy policy6 = new Policy(708, "Kamal", 19, "Life insurance", 8700);
        PolicyManagement.getPerformanceComparisonOnAdding(policy6);
        PolicyManagement.getPerformanceComparisonOnRemoving(policy6);
        PolicyManagement.getPerformanceComparisonOnSearching(policy4);

        // Getting policy of specific coverage type
        PolicyManagement.getPolicyOfSpecificCoverageType("Life insurance");
    }
}