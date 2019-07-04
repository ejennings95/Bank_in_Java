package Main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Account {

    public double balance = 0.00;
    public ArrayList<Transactions> transactions = new ArrayList<Transactions>();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    public void deposit(double amount){
        setBalance(balance + amount);
        transactions.add(new Transactions(dateToday(), amount, "deposit", balance));
    }

    public void withdraw(double amount) throws InsufficientFundsInAccountException {
        if (balance - amount <0) throw new InsufficientFundsInAccountException("There is insufficient funds in this account");
        setBalance(balance - amount);
        transactions.add(new Transactions(dateToday(), amount, "withdrawal", balance));
    }

    private String dateToday() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        return formatter.format(date);
    }
}
