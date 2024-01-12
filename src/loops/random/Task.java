package loops.random;

import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int generatedNumber = random.nextInt(1, 101);
        while (true) {
            System.out.print("Введите число: ");
            int input = scanner.nextInt();
            if (generatedNumber == input) {
                System.out.println("Вы угадали число");
                break;
            } else if (generatedNumber > input) {
                System.out.println("Заданное число БОЛЬШЕ");
            } else {
                System.out.println("Заданное число МЕНЬШЕ");
            }
        }
    }
}
