public class Account {
/**
* content: this is a class that use for recording the account
* @author huynh anh nguyen
* @version 31.03.2025*/
    private double balance ;
    private String accountNumber ;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    /**
     * @param amount to insert desidered deposit amount
     * @return adding into balance the amount*/
    public void deposit(double amount) {
        setBalance(balance+amount);
    }
    /**
     * @param amount to insert desidered deposit amount
     * @return subtracting into balance the amount*/
    public void withdraw(double amount) {
        setBalance(balance-amount);
    }

}
