package scanner.hometask_responses;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        System.out.print("Введите число: ");
        int number = s.nextInt();
//        int factorial = 1;
//        for (int f = 1; f <= number; f++) {
//            factorial *= f;
//        }
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " * " + i + " = " + (i * number));
//        }
//        for (int number = 0; number <= 100; number++) {
//            if (number <= 1) {
////                System.out.println("Введенное число " + number + " не является простым числом");
//            } else if (number <= 3) {
//                System.out.print(number + " ");
////                System.out.println("Введенное число " + number + " является простым числом");
//            } else if (number % 2 == 0 || number % 3 == 0) {
////                System.out.println("Введенное число " + number + " не является простым числом");
//            } else {
////                System.out.println("Введенное число " + number + " является простым числом");
//                System.out.print(number + " ");
//            }
//        }
        if (number <= 1) {
            System.out.println("Введенное число " + number + " не является простым числом");
        } else if (number <= 3) {
            System.out.println("Введенное число " + number + " является простым числом");
        } else if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("Введенное число " + number + " не является простым числом");
        } else {
            System.out.println("Введенное число " + number + " является простым числом");
        }
//        System.out.println("2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97".replace(",", ""));
//        System.out.println("Факториал числа " + number + " = " + factorial);
    }
}
