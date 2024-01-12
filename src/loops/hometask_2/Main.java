package loops.hometask_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите общий выделенный бюджет: ");
        int budget = scanner.nextInt();

        System.out.print("Введите кол-во проектов: ");
        int projects = scanner.nextInt();

        for (int i = 1; i <= projects; i++) {
            System.out.print("Введите стоимость бюджета проекта " + i + ":");
            int projectBudget = scanner.nextInt();
            if (projectBudget <= budget){
                budget -= projectBudget;
                System.out.println("Проект " + i + " получил бюджет в размере: " + projectBudget);
                System.out.println("Бюджет: " + budget);
            } else {
                System.out.println("Проект " + i + " не получил финансирование");
            }
        }

    }
}
