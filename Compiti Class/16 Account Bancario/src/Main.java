public class Main {
    public static void main(String[] args) {
        Account account = new Account(1200, "CH 0145455222");
        Client client = new Client("Mark", account);

        System.out.println(client);

        client.addFunds(10000);
        System.out.println(client);

        client.withdrawFunds(11201);

    }
}