package Main;

import java.util.ArrayList;

public class Statement {

    public ArrayList<Transactions> transactions;
    public StringBuilder statement = new StringBuilder();


    public Statement(ArrayList<Transactions> accountTransactions) {
        setTransactions(accountTransactions);
    }

    public void setTransactions(ArrayList<Transactions> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    public StringBuilder displayStatement() {
        statement.append("date || credit || debit || balance");
        for (Transactions transaction : transactions) {
            statement.append(transaction.getTransactionDate());
            if (transaction.getTransactionType() == "Deposit") {
                statement.append(" || " + transaction.getTransactionAmount() + " ||");
            } else if (transaction.getTransactionType() == "withdrawal"){
                statement.append(" || || " + transaction.getTransactionAmount());
            }
            statement.append(" || " + transaction.getCurrentBalance() + "\n");
        }
        return statement;
    }
}
