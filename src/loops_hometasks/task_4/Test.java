package loops_hometasks.task_4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " - простое число");
        } else {
            System.out.println(number + " - не является простым числом");
        }

//        6
//        2, 3, 4, 5

//        12
//        2, 3, 4, 5, 6, 7


    }
}
