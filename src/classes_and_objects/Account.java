package classes_and_objects;

public class Account {
    String owner;
    double balance;


    void transfer(Account otherAccount, double money) {
        if (money <= balance){
            otherAccount.balance += money;
            balance -= money;
            System.out.println("Со счета " + owner + " перевели на счет " + otherAccount.owner + " на сумму " + money + " тг");
        } else {
            System.out.println("Недостаточно средств");
        }
    }


    void add(double money) {
        balance = balance + money;
        System.out.println("На счет " + owner + " добавлено " + money + " тг.");
    }

    void pay(double money) {
        if (money <= balance) {
            balance = balance - money;
            System.out.println("На счету " + owner + " потрачена сумма на " + money + " тг.");
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    void display() {
        System.out.println("Владелец: " + owner);
        System.out.println("Текущий баланс: " + balance);
        System.out.println();
    }
}
