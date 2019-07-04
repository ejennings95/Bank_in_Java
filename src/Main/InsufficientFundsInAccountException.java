package Main;

public class InsufficientFundsInAccountException extends Exception {

    public InsufficientFundsInAccountException(String message) {
        super(message);
    }
}
