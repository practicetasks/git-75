package methods.solutions;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();

        String category = "наушники";
        String country = "Казахстан";
        double purchase = 120;
        double cashback = example.processOrder(category, country, purchase);
        System.out.println("Кешбек: " + cashback);
    }

//    public static void main(String[] args) {
//        Example example = new Example();
//
//        String category = "наушники";
//        String country = "Казахстан";
//        double purchase = 120;
//        double cashback = example.processOrder(category, country, purchase);
//        System.out.println("Кешбек: " + cashback);
//
//
//
////        String country = "США";
////        double purchase = 120;
////        double afterProcessingDelivery = example.processDelivery(country,purchase);
////        System.out.println("Итоговая стоимость с учетом доставки: " + afterProcessingDelivery);
////        Вывести итоговую стоимость с учетом доставки
//
//
//
//
//
//
//
//
//
//
////        String name = "Михаил";
////        String result = example.greeting(25);
////        System.out.println(result + ", " + name);
//
//
////        example.greeting(24);
//
////        1. Добавить
////        2. Обновить
////        3.
////        5
////        expected: Доброй ночи
////        result: example.greeting(5);
//    }
}
