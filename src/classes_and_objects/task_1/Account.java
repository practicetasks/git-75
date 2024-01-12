package classes_and_objects.task_1;

public class Account {
    String owner;
    double balance;
    String history = "";
    double spentMoney;


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

    void pay(Product product) {
        if (product.price <= balance) {
            balance = balance - product.price;
            history += product.name + " ";
            spentMoney += product.price;
            System.out.println("На счету " + owner + " потрачена сумма на " + product.price + " тг.");
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    void display() {
        System.out.println("Владелец: " + owner);
        System.out.println("Текущий баланс: " + balance);
        System.out.println("История покупок: " + history);
        System.out.println("Потрачено: " + spentMoney);
        System.out.println();
    }
}
