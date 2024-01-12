package inheritance.example_3;

import arrays.reference_types.Product;

public class Main {
    public static void main(String[] args) {
        test(new Product());
    }

    static void test(int a) {
        System.out.println("Целое число " + a);
    }

    static void test(double a) {
        System.out.println("Дробное число " + a);
    }

    static void test(int b, double a) {
        System.out.println(a + b);
    }

    static void test(Product product) {

    }
}
