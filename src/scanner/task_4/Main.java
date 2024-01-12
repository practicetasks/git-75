package scanner.task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number*i);
        }
    }
}
