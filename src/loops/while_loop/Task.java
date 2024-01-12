package loops.while_loop;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Американо");

            System.out.print("Введите пароль: ");
            String password = scanner.next();
            if (password.equals("admin")){
                System.out.println("Доступ разрешен");
                break;
            }
            System.out.println("Неправильный пароль, попробуйте еще раз!");
        }
    }
}
