package arrays.reference_types;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new Product();
        products[0].name = "Iphone 12";
        products[0].price = 419990;

        products[1] = new Product();
        products[1].name = "Iphone 13";
        products[1].price = 519990;
        displayProducts(products);


        Product[] products2 = new Product[2];
        products2[0] = new Product();
        products2[0].name = "Airpods Pro";
        products2[0].price = 111990;

        products2[1] = new Product();
        products2[1].name = "Sony XM5";
        products2[1].price = 149990;
        displayProducts(products2);

    }

    static void displayProducts(Product[] products) {
        System.out.println("\nТовары");
        for (Product product : products) {
            System.out.println(product.name + " " + product.price);
        }
    }

    public static void reverseArray(int[] numbers) {
        // Реализация метода
    }

    static void sum(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            counter += number;
        }
        System.out.println("Сумма чисел: " + counter);
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Количество товаров: ");
//        int amountOfProducts = scanner.nextInt();
//
//        Product[] products = new Product[amountOfProducts];
//        for (int i = 0; i < products.length; i++) {
//            products[i] = new Product();
//
//            System.out.println("Название товара");
//            products[i].name = scanner.next();
//
//            System.out.println("Стоимость товара");
//            products[i].price = scanner.nextInt();
//        }
//
//        for (Product product : products) {
//            System.out.println(product.name + " " + product.price);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        Country[] countries = new Country[3];
////
////        for (int i = 0; i < countries.length; i++) {
////            Country country = new Country();
////
////            System.out.print("Введите название страны: ");
////            country.name = scanner.next();
////
////            countries[i] = country;
////        }
////
////        System.out.println(Arrays.toString(countries));
//    }
//    public static void main(String[] args) {
//        Country[] countries = new Country[3];
//
//        Country country = new Country();
//        country.name = "Казахстан";
//        countries[0] = country;
//
//        country = new Country();
//        country.name = "Россия";
//        countries[1] = country;
//
//        country = new Country();
//        country.name = "Узбекистан";
//        countries[2] = country;
//
//        for (Country c : countries) {
//            System.out.println(c.name);
//        }
//
//        for (int i = 0; i < countries.length; i++) {
//            System.out.println(countries[i].name);
//        }
//    }
}
