class SavingsAccount extends Account{
    private static double interestRate;
    SavingsAccount(String accountHolderName, double balance){
        super(accountHolderName, balance);
    }
    public static void setInterestRate(double rate){
        interestRate = rate;
    }
    public static double getInterestRate(){
        return interestRate;
    }
    public void withdraw(double amount){
        if (balance >= amount){
        balance -= amount;
    }
    else{
        try {
            throw new InsufficientFundException("insufficientfund");
        } catch (InsufficientFundException e) {
//To show the exception
            e.printStackTrace();
            }
        }
    }
}
