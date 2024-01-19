# Banking_System
Implemented a banking system with multilevel inheritance and customer filtering in java
## Problem Statement
Create an abstract class called Account which serves as the base class for SavingsAccount and CurrentAccount. The Account class provides common functionality like account holder name, balance, deposit, and abstract method withdraw, which must be implemented by the derived classes. The SavingsAccount class represents a savings account and has an additional static variable interestRate to store the interest rate. The withdraw method is overridden to check if the balance is sufficient before performing the withdrawal. For insufficient fund raise an exception “insufficientfund”. The CurrentAccount class represents a current account and has an additional static variable overdraftLimit to store the overdraft limit. The withdraw
method is also overridden to consider the overdraft limit when determining if a withdrawal is allowed. For insufficient fund raise an exception “insufficientfund”.
The Bank class is the main class that creates objects of SavingsAccount and CurrentAccount, performs various operations like deposits, withdrawals, and interest
calculations, and displays the balances.

1. demonstrate the multilevel (3 levels) inheritance in the given problem
statement. (Consider required data in the given problem statement)
2. Print the names of all the customers whose name starts with “A” (make use of
string method startsWith(String prefix)).
## Approach
Created seperate classes Account,Savings Account, Current Account and main class Bank. Implemented method overriding by creating various methods like withdraw, deposit, get balance and exception handling by creadted a Insuffienct fund exception class and handling it using try catch block. Then lastly using all the class methods in bank class by calling them through objects and testing through various test cases. 

