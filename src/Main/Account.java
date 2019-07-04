package Main;

public class Account {

    public double balance = 0.00;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount){
        setBalance(balance + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsInAccountException {
        if (balance - amount <0) throw new InsufficientFundsInAccountException("There is insufficient funds in this account");
        setBalance(balance - amount);
    }
}
