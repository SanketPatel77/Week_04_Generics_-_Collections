package insurancemanagementsystem;

// policy class
public class Policy implements Comparable<Policy> {
    //attributes
    private int policyNumber;
    private String policyholderName;
    private int expiryDate;
    private String coverageType;
    private int premiumAmount;

    // Parameterized constructor
    public Policy(int policyNumber, String policyholderName, int expiryDate, String coverageType, int premiumAmount) {
        this.coverageType = coverageType;
        this.expiryDate = expiryDate;
        this.policyholderName = policyholderName;
        this.policyNumber = policyNumber;
        this.premiumAmount = premiumAmount;
    }

    // Getters and Setters
    public int getExpiryDate() {
        return expiryDate;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "Policy number is: " + policyNumber +
                " \nPolicy holder name is: " + policyholderName +
                " \nThis policy's expiry date is " + expiryDate;
    }

    // Overriding the compareTo method on the basis of expiry date
    @Override
    public int compareTo(Policy policy) {
        return this.expiryDate - policy.expiryDate;
    }
}