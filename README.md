# ATM Machine Project

This is a Java-based console application that simulates an ATM machine. The project implements basic ATM functionalities like account creation, checking and savings account management, deposits, withdrawals, transaction history, and account security features.

## Features

- **Account Management**:
  - Create new accounts with a unique customer number and PIN.
  - Login with customer number and PIN.
  
- **Checking & Savings Accounts**:
  - View account balances.
  - Deposit and withdraw money.
  - Separate handling for checking and savings accounts.

- **Transaction History**:
  - View a detailed history of transactions for both accounts.

- **Account Locking**:
  - Locks accounts after three failed login attempts.

- **Enhanced User Experience**:
  - Validates inputs to prevent crashes.
  - Clear and user-friendly menus.
  - Secure logout option.

## Technologies Used

- **Programming Language**: Java
- **IDE**: IntelliJ IDEA or any other Java-compatible IDE
- **Concepts**: OOP (Object-Oriented Programming), Input Validation, Exception Handling

## Project Structure
AtmMachineProject/
├── Account.java        # Represents the bank account with balances and transactions
├── OptionMenu.java     # Handles user interactions and menu options
├── Atm.java            # Main class to run the application
Getting Started
Clone this repository:

  bash
  Copy
  Edit
  
git clone https://github.com/<your-username>/atm-machine-project.git

Open the project in your preferred Java IDE.

Run the Atm.java file to start the application.


How to Use
  Create an Account: Enter a new customer number and PIN.
  Login: Use your customer number and PIN to log in.
  Choose an Option:
  View balances for checking or savings accounts.
  Deposit or withdraw money.
  View transaction history.
  Logout: Securely log out after completing your transactions.

Future Enhancements
  Persistent storage using a database or file system.
  Enhanced UI/UX using JavaFX or a web-based frontend.
  Support for multiple currencies.
  Screenshots
  Main Menu
  markdown
  Copy
  Edit

=== Welcome to ATM Project ===
1. Create Account
2. Login
3. Exit
  Checking Account Menu
  markdown
  Copy
  Edit


=== Checking Account Menu ===
1. View Balance
2. Withdraw
3. Deposit
4. Back
  Transaction History
  javascript
  Copy
  Edit

Transaction History:
1. Deposited $500.00 to Checking Account.
2. Withdrew $200.00 from Savings Account.
