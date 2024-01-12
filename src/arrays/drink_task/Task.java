package arrays.drink_task;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] drinks = {"Американо", "Капучино", "Латте", "Колд Брю"};
        while (true) {
            for (int i = 0; i < drinks.length; i++) {
                System.out.println(i+1 + ". " + drinks[i]);
            }
            System.out.println("0. Выйти");

            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("Вы вышли из меню напитков");
                break;
            }

            if (num >= 1 && num <= drinks.length){
                System.out.println("Ожидайте, готовим " + drinks[num-1]);
            } else {
                System.out.println("Некорректный номер");
            }

        }
    }
}
