import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0.0;
    private double savingBalance = 0.0;
    private List<String> transactionHistory = new ArrayList<>();

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    // Set and Get methods for Customer Number
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    // Set and Get methods for PIN Number
    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    // Get Checking Account Balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // Get Savings Account Balance
    public double getSavingBalance() {
        return savingBalance;
    }

    // Perform Withdrawal from Checking Account
    public void withdrawFromChecking(double amount) {
        if (amount > 0 && amount <= checkingBalance) {
            checkingBalance -= amount;
            transactionHistory.add("Withdrew " + moneyFormat.format(amount) + " from Checking Account.");
            System.out.println("Transaction Successful! New Balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    // Perform Withdrawal from Savings Account
    public void withdrawFromSaving(double amount) {
        if (amount > 0 && amount <= savingBalance) {
            savingBalance -= amount;
            transactionHistory.add("Withdrew " + moneyFormat.format(amount) + " from Savings Account.");
            System.out.println("Transaction Successful! New Balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    // Perform Deposit to Checking Account
    public void depositToChecking(double amount) {
        if (amount > 0) {
            checkingBalance += amount;
            transactionHistory.add("Deposited " + moneyFormat.format(amount) + " to Checking Account.");
            System.out.println("Transaction Successful! New Balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    // Perform Deposit to Savings Account
    public void depositToSaving(double amount) {
        if (amount > 0) {
            savingBalance += amount;
            transactionHistory.add("Deposited " + moneyFormat.format(amount) + " to Savings Account.");
            System.out.println("Transaction Successful! New Balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    // Display Transaction History
    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}
