class CurrentAccount extends Account {
    private static double overdraftLimit;
    CurrentAccount( String accountHolderName, double balance){
        super(accountHolderName, balance);
    }
    public static void setOverdraftLimit(double limit){
        overdraftLimit = limit;
    }
    public static double getOverdraftLimit(){
        return overdraftLimit;
    }
    public void withdraw(double amount) {
        if(balance + overdraftLimit >= amount){
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
