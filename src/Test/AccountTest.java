package Test;

import Main.Account;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @DisplayName("should start with hangar equating to an empty array")
    @Test
    void defaultBalance() {
        Account account = new Account();
        assertEquals(0.00, account.getBalance(), 0.0);
    }

    @DisplayName("should start with hangar equating to an empty array")
    @Test
    void deposit() {
        Account account = new Account();
        account.deposit(100.00);
        assertEquals(100.00, account.getBalance(), 0.0);
    }

}