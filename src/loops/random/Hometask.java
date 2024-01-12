package loops.random;

import java.util.Random;
import java.util.Scanner;

public class Hometask {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный диапазон: ");
        int from = scanner.nextInt();

        System.out.print("Введите конечный диапазон: ");
        int to = scanner.nextInt();

        int generatedNumber = random.nextInt(from, to + 1);

        System.out.print("Сколько попыток хотите дать? ");
        int attempts = scanner.nextInt();

        System.out.printf("Угадайте число от %d до %d: ", from, to);
//        =========================================================================================================


//        int input = scanner.nextInt();
//        for (int i = attempts - 1; i > 0; i--) {
//            if (input == generatedNumber) {
//                System.out.println("Вы угадали число!");
//                break;
//            } else if (generatedNumber > input) {
//                System.out.printf("Заданное число БОЛЬШЕ (осталось попыток %d): ", i);
//            } else {
//                System.out.printf("Заданное число МЕНЬШЕ (осталось попыток %d): ", i);
//            }
//            input = scanner.nextInt();
//        }
//        if (input != generatedNumber) {
//            System.out.println("Вы не смогли угадать число!");
//            System.out.println("Заданное число: " + generatedNumber);
//        }


//        =========================================================================================================


//        int input = scanner.nextInt();
//        while (attempts > 1) {
//            attempts--;
//            if (input == generatedNumber) {
//                break;
//            } else if (generatedNumber > input) {
//                System.out.printf("Заданное число БОЛЬШЕ (осталось попыток %d): ", attempts);
//            } else {
//                System.out.printf("Заданное число МЕНЬШЕ (осталось попыток %d): ", attempts);
//            }
//            input = scanner.nextInt();
//        }
//
//        if (input == generatedNumber) {
//            System.out.println("Вы угадали число!");
//        } else {
//            System.out.println("Вы не смогли угадать число");
//            System.out.println("Заданное число: " + generatedNumber);
//        }

        while (attempts > 0) {
            int input = scanner.nextInt();
            if (input == generatedNumber) {
                break;
            } else if (attempts > 1) {
                if (input < generatedNumber) {
                    System.out.printf("Заданное число БОЛЬШЕ (осталось попыток %d): ", attempts - 1);
                } else {
                    System.out.printf("Заданное число МЕНЬШЕ (осталось попыток %d): ", attempts - 1);
                }
            } else {
                System.out.println("Вы не смогли угадать число");
                System.out.println("Заданное число: " + generatedNumber);
            }
            attempts--;
        }

    }
}
