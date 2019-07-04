package Test;

import Main.Account;
import Main.InsufficientFundsInAccountException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static javafx.beans.binding.Bindings.when;
import static org.junit.Assert.assertEquals;

public class AccountTest {

    @DisplayName("default balance of account is to be 0")
    @Test
    void defaultBalance() {
        Account account = new Account();
        assertEquals(0.00, account.getBalance(), 0.0);
    }

    @DisplayName("should be able to deposit money and it be added to the balance")
    @Test
    void deposit() {
        Account account = new Account();
        account.deposit(100.00);
        assertEquals(100.00, account.getBalance(), 0.0);
    }

    @DisplayName("should not be able to withdraw money from the account if unavailable")
    @Test
    void insufficentFunds() throws InsufficientFundsInAccountException {
        Account account = new Account();
        Assertions.assertThrows(InsufficientFundsInAccountException.class, () -> {
            account.withdraw(100.00);
        });
    }

    @DisplayName("should be able to withdraw money from the account if available")
    @Test
    void withdraw() throws InsufficientFundsInAccountException {
        Account account = new Account();
        account.deposit(100.00);
        account.withdraw(50.00);
        assertEquals(50.00, account.getBalance(), 0.0);
    }

}