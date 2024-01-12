package scanner.example_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int number = scanner.nextInt();
//        for (int i = 1; i <= number; i++) {
//            System.out.println(i);
//        }

//        %
//
//        int total = 0;
//        System.out.print("Введите количество: ");
//        int amount = scanner.nextInt();
//        for (int i = 1; i <= amount; i++) {
//            System.out.print("Введите число: ");
//            int number = scanner.nextInt();
//            total += number;
//        }
//        System.out.println("Сумма введенных чисел: " + total);


        // 1) Вывести все числа от 1 до введенного числа, которые делятся на 3


        // 2) Вывести сумму всех чисел от 1 до введенного числа, которые делятся на 3

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nСумма чисел: ...");

    }
}
