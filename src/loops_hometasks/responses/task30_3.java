package loops_hometasks.responses;
import java.util.Scanner;

public class task30_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите общий выделенный бюджет: ");
        int budget = s.nextInt();
        System.out.print("Введите количество проектов: ");
        int quantityProjects = s.nextInt();
        for (int i = 1; i <= quantityProjects; i++) {
            System.out.print("Введите стоимость бюджета проекта " + i + " : ");
            int costBudget = s.nextInt();
            if (costBudget <= budget) {
                System.out.println("Проект " + i + " получил бюджет в размере: " + costBudget);
                budget -= costBudget;
                System.out.println("Бюджет: " + budget);
                System.out.println();
            } else {
                System.out.println("Бюджет закончился, проект " + i + " не получил финансирование.");
                System.out.println();
                break;
            }
        }
    }
}