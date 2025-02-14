package exceptionhandling.banktransactionsystem;

public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {
        // creating a object of bank account
        BankAccount bankAccount = new BankAccount(9352, 10_000);

        // withdrawing amount which is less than the account balance
        bankAccount.withdraw(5_000);

        // trying to withdraw negative amount
        bankAccount.withdraw(-942);

        // trying to withdraw more amount than present in account
        bankAccount.withdraw(20_000);


    }
}
