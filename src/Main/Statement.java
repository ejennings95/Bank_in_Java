package Main;

import java.util.ArrayList;
import java.util.Collections;

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
        statement.append("date || credit || debit || balance\n");
        Collections.reverse(transactions);
        for (Transactions transaction : transactions) {
            statement.append(transaction.getTransactionDate());
            if (transaction.getTransactionType() == "deposit") {
                statement.append(" || " + String.format("%.2f", transaction.getTransactionAmount()) + " ||");
            } else if (transaction.getTransactionType() == "withdrawal"){
                statement.append(" || || " + String.format("%.2f", transaction.getTransactionAmount()));
            }
            statement.append(" || " + String.format("%.2f", transaction.getCurrentBalance()) + "\n");
        }
        System.out.println(statement);
        return statement;
    }
}
