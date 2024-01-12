package loops.random;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int generatedNumber = random.nextInt(1, 101);
        int input = scanner.nextInt();
        if (generatedNumber == input) {
            System.out.println("Вы угадали число");
        } else {
            System.out.println("Вы не угадали число");
        }
    }
}
