package loops.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите кол-во ступенек: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("#");
            }
            System.out.print(" ");
            for (int j = 1; j <= i ; j++) {
                System.out.print("#");
            }
            for (int j = number * 2 - i; j >= i ; j -= 1) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("##");
            }
            System.out.println();
        }

    }
}
