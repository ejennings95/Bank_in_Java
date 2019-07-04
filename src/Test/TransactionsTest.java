package Test;

import Main.Account;
import Main.Transactions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TransactionsTest {

    @DisplayName("a new transaction should set the transactionDate")
    @Test
    void setTransactionDate() {
        Transactions transaction = new Transactions("04/07/19", 10.00, "Deposit", 20.00);
        assertEquals("04/07/19", transaction.getTransactionDate());
    }

    @DisplayName("a new transaction should set the transactionAmount")
    @Test
    void setTransactionAmount() {
        Transactions transaction = new Transactions("04/07/19", 10.00, "Deposit", 20.00);
        assertEquals(10.00, transaction.getTransactionAmount(), 0.0);
    }

    @DisplayName("a new transaction should set the transactionType")
    @Test
    void setTransactionType() {
        Transactions transaction = new Transactions("04/07/19", 10.00, "Deposit", 20.00);
        assertEquals("Deposit", transaction.getTransactionType());
    }

    @DisplayName("a new transaction should set the currentBalance")
    @Test
    void setCurrentBalance() {
        Transactions transaction = new Transactions("04/07/19", 10.00, "Deposit", 20.00);
        assertEquals(20, transaction.getCurrentBalance(), 0.0);
    }
}