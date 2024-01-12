package arrays.hometask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
//    1. Задача об инвертировании массива:
//   - Задание: Создайте массив из пяти строк и инвертируйте его порядок, используя временные переменные для обмена значениями.
//   - Пример: String[] colors = {"Красный", "Синий", "Зеленый", "Желтый", "Черный"};
//   - Цель: Научиться менять местами элементы массива.
//        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый", "Черный"};
//        String first = colors[0];
//        String second = colors[1];
//        String third = colors[2];
//        String fourth = colors[3];
//        String fifth = colors[4];
//
//        colors[0] = fifth;
//        colors[1] = fourth;
//        colors[2] = third;
//        colors[3] = second;
//        colors[4] = first;
//
//        System.out.println(Arrays.toString(colors));
//        String[] reversedColors = {colors[4], colors[3], colors[2], colors[1], colors[0]};

//2. Задача о замене элементов массива на другой элемент:
//   - Задание: Создайте массив из пяти чисел. Замените значение в середине массива на произвольное число, введенное пользователем.
//   - Пример: int[] numbers = {2, 4, 6, 8, 10};
//   - Цель: Понимание индексации массивов и замена элементов.
//        Random random = new Random();
//
//        int[] numbers = {2, 4, 6, 8, 10};
//        int randomIndex = random.nextInt(0, numbers.length );
//        numbers[randomIndex] = 999;
//
//        System.out.println(Arrays.toString(numbers));

//
//3. Задача о объединении двух массивов в один:
//   - Задание: Создайте два массива по три элемента каждый. Объедините их в один массив из шести элементов.
//   - Пример: String[] array1 = {"Яблоко", "Банан", "Апельсин"}; String[] array2 = {"Томат", "Огурец", "Перец"};
//   - Цель: Научиться соединять массивы без использования циклов.
        String[] array1 = {"Яблоко", "Банан", "Апельсин"};
        String[] array2 = {"Томат", "Огурец", "Перец"};
        String[] array4 = new String[array1.length + array2.length];
        array4[0] = array1[0];
        array4[1] = array1[1];
        array4[2] = array1[2];
        array4[3] = array2[0];
        array4[4] = array2[1];
        array4[5] = array2[2];

        String[] array3 = {array1[0], array1[1], array1[2], array2[0], array2[1], array2[2]};

//4. Задача о замене всех элементов массива на одинаковые:
//   - Задание: Создайте массив из пяти элементов. Попросите пользователя ввести строку и замените все элементы массива на эту строку.
//   - Пример: String[] words = new String[5];
//   - Цель: Понимание работы с массивами и пользовательским вводом.
//
//5. Задача о создании массива с реверсивными значениями:
//   - Задание: Создайте массив из пяти целых чисел. Создайте второй массив, в котором значения будут в обратном порядке по сравнению с первым массивом.
//   - Пример: int[] original = {1, 2, 3, 4, 5};
//   - Цель: Понимание создания и инициализации массивов, а также работы с индексами.
    }
}
