package encapsulation;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Dima");
        account.addMoney(500);
        account.addMoney(500);
        account.pay(500);

        System.out.println(account.getBalance());
        System.out.println(account.getOwner());
    }
}
