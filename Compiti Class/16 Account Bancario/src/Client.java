

public class Client {
//
    private String name;
    private Account account;

    public Client(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void addFunds(double amount) {
        account.deposit(amount);
    }

    public void withdrawFunds(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("prelievo respinto");
        }
        else {
            System.out.println("prelievo accettato");
            account.withdraw(amount);
        }

    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", account=" + account.getBalance() +
                '}';
    }
}
