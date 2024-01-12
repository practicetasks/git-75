package encapsulation;

public class Account {
    private String owner;
    private double balance;

    public Account(String owner) {
        this.owner = owner;
    }

    public void pay(double money){
        if (balance >= money) {
            balance -= money;
        }
    }

    public void addMoney(double money) {
        balance += money;
    }

    public double getBalance(){
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}

