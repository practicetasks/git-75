package loops.random;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int generatedNumber = random.nextInt(101);
        while (true) {
            int input = scanner.nextInt();
            if (input == generatedNumber) {
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
