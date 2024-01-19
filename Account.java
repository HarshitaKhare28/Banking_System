abstract class Account{
    public String accountHolderName;
    double balance;
    Account(String accountHolderName, double balance){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    abstract void withdraw(double amount) throws InsufficientFundException;
    }