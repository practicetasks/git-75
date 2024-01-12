package loops.random;

import java.util.Random;
import java.util.Scanner;

public class MTest {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int generateNumber = random.nextInt(1, 101);
        System.out.println("Введите число:");

        int input = scanner.nextInt();
        for (int i = 0; i < 20; i++) {
            if (generateNumber < input) {
                System.out.println("Заданное число больше");
            } else if (generateNumber > input) {
                System.out.println("Заданное число больше");

            } else if (generateNumber == input) {
                System.out.println("Вы угадали число");
            }
        }
    }
}
