# Bank Management System
## Overview
This Java program represents a simple Bank Management System that includes three classes - Account, SavingsAccount, and CurrentAccount. The main functionality is encapsulated in these classes, and the central management is handled by the Bank class.

## Classes
### 1. Account
The Account class is an abstract class serving as the base for all account types. It includes basic attributes such as accountHolderName and balance. Key methods include:

getAccountHolderName(): Retrieves the account holder's name.
getBalance(): Retrieves the current balance.
deposit(double amount): Adds the specified amount to the account balance.
withdraw(double amount): An abstract method representing the withdrawal functionality. Specific implementations are provided in subclasses.
### 2. SavingsAccount
The SavingsAccount class is a subclass of Account, representing a savings account. It includes features like:

setInterestRate(double rate): Sets the interest rate for the savings account.
getInterestRate(): Retrieves the interest rate.
withdraw(double amount): Overrides the withdraw method from the base class to include specific logic for savings accounts, checking for sufficient funds.
### 3. CurrentAccount
Similar to SavingsAccount, CurrentAccount is a subclass of Account representing a current account. It includes features like:

setOverdraftLimit(double limit): Sets the overdraft limit for the current account.
getOverdraftLimit(): Retrieves the overdraft limit.
withdraw(double amount): Overrides the withdraw method from the base class to include specific logic for current accounts, allowing for overdrafts.
### 4. InsufficientFundException
This is a custom exception class that extends Exception. It is thrown when a withdrawal operation is attempted with insufficient funds in the account.

### 5. Bank
The Bank class serves as the main driver class, handling a collection of Account objects and providing methods for:

Adding accounts to the bank.
Depositing amounts into specific accounts.
Managing exceptions during withdrawal operations.
##Usage
To use this Bank Management System:

1. Create instances of SavingsAccount and CurrentAccount.
2. Set specific parameters like interest rates and overdraft limits.
3. Add these accounts to the Bank using the addAccount method.
4. Perform operations like deposits and withdrawals through the Bank class methods.
5. Test different scenarios, including edge cases, to ensure the robustness of the system.

   This basic functionality of the Bank Management System, includes account creation, parameter setting, deposit, and withdrawal operations, along with exception handling.The program demonstrates the principles of object-oriented programming, emphasizing method overriding, encapsulation, and exception handling. The modular design allows for easy extension to accommodate additional account types or features. By utilizing the provided classes and methods, users can simulate various banking operations, such as deposits and withdrawals, while handling exceptions like insufficient funds gracefully. This system serves as a foundation for understanding and implementing more complex banking systems, offering a practical example of Java programming principles in a real-world context.

