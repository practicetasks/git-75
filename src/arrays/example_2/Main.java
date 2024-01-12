package arrays.example_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] currencies = {"USD", "EUR", "JPY", "KZT"};
//
//        System.out.println("""
//                1. USD
//                2. EUR
//                3. JPY
//                4. KZT""");
//
//
//        System.out.print("Введите номер валюты: ");
//        int currency = scanner.nextInt();
//
//        System.out.println("Вы выбрали " + currencies[currency-1]);

        Scanner scanner = new Scanner(System.in);

        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};


        System.out.println("Текущий массив: " + Arrays.toString(expenses));
        System.out.println("Расходы за неделю хранятся под индексами от 1 (пн) до 7 (вс).");
        System.out.println("Введите индекс дня, траты за который вы хотите отредактировать:");

        // Объявите переменную, которая будет хранить индекс выбранного элемента
        int day = scanner.nextInt();

        System.out.println("Введите новую сумму трат за этот день:");
        // Объявите переменную, в которой будет сохранено новое значение трат за выбранный день
        double newExpense = scanner.nextDouble();

        // Замените значение элемента с нужным индексом на новое
        expenses[day - 1] = newExpense;
        System.out.println("Измененный массив: " + Arrays.toString(expenses));

    }
}
