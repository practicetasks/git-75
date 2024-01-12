package scanner.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите столицу Австралии: ");
        String answer = scanner.next();
        System.out.println("Ваш ответ: " + answer);
        System.out.println("Правильный ответ: Канберра");
    }
}
