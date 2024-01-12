package loops_hometasks.task_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min;
        if (a <= b && a <= c){
            min = a;
        } else if (b <= c && b <= a) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("Наименьшее число: " + min);
    }
}
