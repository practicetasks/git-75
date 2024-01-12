package scanner.task_5;

import java.util.Scanner;

// Factorial
public class Main {
    public static void main(String[] args) {
        // Создание объекта Scanner для ввода данных пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();

        // Проверка на отрицательное число
        if (number < 0) {
            System.out.println("Факториал отрицательного числа не существует.");
        } else {
            int factorial = 1;
            // Вычисление факториала для положительного числа
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Факториал числа " + number + " равен " + factorial + ".");
        }
    }
}
