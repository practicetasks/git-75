package loops.random;

import java.util.Random;
import java.util.Scanner;

public class HomeTaskRandom {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный диапазон: ");
        int from = scanner.nextInt();

        System.out.print("Введите конечный диапазон: ");
        int to = scanner.nextInt();

        System.out.print("Сколько попыток хотите дать? ");
        int attempts = scanner.nextInt();

        int generatedNumber = random.nextInt(from, to + 1);

        System.out.print("Угадайте число от " + from + " до " + to + ": ");
        int input = scanner.nextInt();

        while (attempts > 1) {
            if (input == generatedNumber) {
                break;
            } else if (generatedNumber > input) {
                System.out.print("Заданное число БОЛЬШЕ (осталось попыток: " + (attempts - 1) + "): ");
            } else {
                System.out.print("Заданное число МЕНЬШЕ (осталось попыток: " + (attempts - 1) + "): ");
            }
            input = scanner.nextInt();
            attempts--;
        }
        if (input == generatedNumber) {
            System.out.println("Вы угадали число");
        } else {
            System.out.println("Вы не смогли угадать число");
            System.out.println("Заданное число: " + generatedNumber);
        }

//        for (int i = attempts-1; i > 0; i--) {
//            if (input == generatedNumber) {
//                break;
//            } else if (generatedNumber > input) {
//                System.out.print("Заданное число БОЛЬШЕ (осталось попыток: " + i+ "): ");
//            } else {
//                System.out.print("Заданное число МЕНЬШЕ (осталось попыток: " + i+ "): ");
//            }
//            input = scanner.nextInt();
//        }
//
//        if (input == generatedNumber) {
//            System.out.println("Вы угадали число");
//        } else {
//            System.out.println("Вы не смогли угадать число");
//            System.out.println("Заданное число: " + generatedNumber);
//        }
    }
}
