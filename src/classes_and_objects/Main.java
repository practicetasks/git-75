package classes_and_objects;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.owner = "Jack";

        account1.add(500);
        account1.add(2500);
        account1.pay(2700);
        account1.display();

        Account account2 = new Account();
        account2.owner = "Denis";

        account2.add(700);
        account2.add(800);
        account2.display();


        account2.transfer(account1, 1000);
        account1.display();
        account2.display();

    }
}

