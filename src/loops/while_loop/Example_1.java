package loops.while_loop;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Введите пароль: ");
            String password = scanner.next();
            if (password.equals("admin")) {
                System.out.println("Доступ разрешен");
                break;
            }
            System.out.println("Неправильный пароль, попробуйте еще раз!");
        }


        System.out.print("Введите пароль: ");
        String password = scanner.next();
        while (!password.equals("admin")) {
            System.out.println("Неправильный пароль, попробуйте еще раз!");
            System.out.print("Введите пароль: ");
            password = scanner.next();
        }
        System.out.println("Доступ разрешен");
    }
}
