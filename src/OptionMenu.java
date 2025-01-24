import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    private final Scanner menuInput = new Scanner(System.in);
    private final HashMap<Integer, Account> accounts = new HashMap<>();

    // Login
    public void getLogin() throws IOException {
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3 && !loggedIn) {
            try {
                System.out.println("=== Welcome to ATM Project ===");
                System.out.print("Enter Your Customer Number: ");
                int customerNumber = menuInput.nextInt();

                System.out.print("Enter Your PIN: ");
                int pinNumber = menuInput.nextInt();

                // Validate Login
                if (accounts.containsKey(customerNumber) && accounts.get(customerNumber).getPinNumber() == pinNumber) {
                    loggedIn = true;
                    getAccountType(accounts.get(customerNumber));
                } else {
                    attempts++;
                    System.out.println("Invalid Customer Number or PIN. Attempts Left: " + (3 - attempts));
                }
            } catch (Exception e) {
                System.out.println("Invalid Input. Please Try Again!");
                menuInput.nextLine(); // Clear invalid input
            }
        }

        if (!loggedIn) {
            System.out.println("Too Many Failed Attempts. Account Locked!");
        }
    }

    // Display Account Type Menu
    public void getAccountType(Account account) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n=== Account Menu ===");
            System.out.println("1. Checking Account");
            System.out.println("2. Savings Account");
            System.out.println("3. Transaction History");
            System.out.println("4. Logout");
            System.out.print("Select an Option: ");

            try {
                int selection = menuInput.nextInt();
                switch (selection) {
                    case 1 -> handleCheckingAccount(account);
                    case 2 -> handleSavingAccount(account);
                    case 3 -> account.displayTransactionHistory();
                    case 4 -> {
                        System.out.println("Logging out...");
                        exit = true;
                    }
                    default -> System.out.println("Invalid Choice. Please Try Again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input. Please Try Again.");
                menuInput.nextLine();
            }
        }
    }

    // Handle Checking Account
    private void handleCheckingAccount(Account account) {
        System.out.println("\n=== Checking Account Menu ===");
        System.out.println("1. View Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Back");
        System.out.print("Select an Option: ");

        try {
            int choice = menuInput.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Checking Account Balance: " + account.getCheckingBalance());
                case 2 -> {
                    System.out.print("Enter Amount to Withdraw: ");
                    account.withdrawFromChecking(menuInput.nextDouble());
                }
                case 3 -> {
                    System.out.print("Enter Amount to Deposit: ");
                    account.depositToChecking(menuInput.nextDouble());
                }
                case 4 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid Choice. Please Try Again.");
            }
        } catch (Exception e) {
            System.out.println("Invalid Input. Please Try Again.");
            menuInput.nextLine();
        }
    }

    // Handle Savings Account
    private void handleSavingAccount(Account account) {
        System.out.println("\n=== Savings Account Menu ===");
        System.out.println("1. View Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Back");
        System.out.print("Select an Option: ");

        try {
            int choice = menuInput.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Savings Account Balance: " + account.getSavingBalance());
                case 2 -> {
                    System.out.print("Enter Amount to Withdraw: ");
                    account.withdrawFromSaving(menuInput.nextDouble());
                }
                case 3 -> {
                    System.out.print("Enter Amount to Deposit: ");
                    account.depositToSaving(menuInput.nextDouble());
                }
                case 4 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid Choice. Please Try Again.");
            }
        } catch (Exception e) {
            System.out.println("Invalid Input. Please Try Again.");
            menuInput.nextLine();
        }
    }

    // Add Account Creation Option
    public void createAccount() {
        System.out.println("=== Create New Account ===");
        System.out.print("Enter New Customer Number: ");
        int customerNumber = menuInput.nextInt();

        if (accounts.containsKey(customerNumber)) {
            System.out.println("Customer Number Already Exists. Try Again.");
            return;
        }

        System.out.print("Enter New PIN: ");
        int pinNumber = menuInput.nextInt();

        Account newAccount = new Account();
        newAccount.setCustomerNumber(customerNumber);
        newAccount.setPinNumber(pinNumber);

        accounts.put(customerNumber, newAccount);
        System.out.println("Account Created Successfully!");
    }
}
