import java.util.ArrayList;
import java.util.List;
class Bank {
    private List<Account> accounts;
    public Bank(){
        accounts = new ArrayList<>();
    }
    public void addAccount(Account acc){
        accounts.add(acc);
    }
    //method to deposit the amount
    public void depositToAccount(String accountHolderName, double balance){
        for(Account acc : accounts){
        if(acc.getAccountHolderName() == accountHolderName){
        acc.deposit(balance);
        break;
        }
    }
}
}
