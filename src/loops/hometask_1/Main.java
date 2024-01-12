package loops.hometask_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во фильмов: ");
        int movieAmount = scanner.nextInt();

        double total = 0;
        for (int i = 0; i < movieAmount; i++) {

            System.out.print("Введите продолжительность фильма в минутах: ");
            total += scanner.nextInt();
        }

        System.out.println("Общая продолжительность в часах: " + total / 60);
    }
}
