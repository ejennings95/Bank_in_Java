package Main;

public class Transactions {

    public String transactionDate;
    public Double transactionAmount;
    public String transactionType;
    public Double currentBalance;

    public Transactions(String date, Double amount, String type, Double balance){
        setTransactionDate(date);
        setTransactionAmount(amount);
        setTransactionType(type);
        setCurrentBalance(balance);
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String date) {
        this.transactionDate = date;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double amount) {
        this.transactionAmount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String type) {
        this.transactionType = type;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double balance) {
        this.currentBalance = balance;
    }

}
