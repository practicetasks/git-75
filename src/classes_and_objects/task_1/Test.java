package classes_and_objects.task_1;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        account.owner = "Dima";
        account.add(2500);

        Product product = new Product();
        product.name = "Молоко";
        product.price = 420;

        Product product1 = new Product();
        product1.name = "Хлопья";
        product1.price = 700;

        product.compareWithOtherProduct(product1);

        account.pay(product);
        account.pay(product1);
        account.display();
        // Владелец: Dima
        // Баланс: ...
        // История покупок: Молоко
    }
}
