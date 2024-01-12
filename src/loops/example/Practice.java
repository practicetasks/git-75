package loops.example;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

//        int days = 3; // Количество дней, когда Байт будет тренироваться
//        int run = 2; // Число пробежек в день
//        int carrots = 5; // Число морковок после пробежки
//
//        for (int i = 1; i <= days; i++) { // Внешний цикл для смены дней
//            System.out.println("День " + i);
//
//            for (int j = 1; j <= run; j++) { // Вложенный цикл для пробежек
//                System.out.println(" Пробежка " + j);
//
//                for (int k = 1; k <= carrots; k++) { // Ещё один вложенный цикл для морковок
//                    System.out.println("  Морковка " + k);
//                }
//            }
//        }
//        System.out.println("Самое время спеть: всё идет по планууу!");






// Random


//        int flatsNumber = 5; // Количество квартир на этаже
//        int floorsNumber = 10; // Количество этажей
//        for (int i = 1; i <= floorsNumber; i++) {
//            for (int j = 1; j <= flatsNumber; j++) {
//                int currentFlat = (i - 1) * flatsNumber + j;
//                System.out.println("Этаж " + i + " квартира " + currentFlat + " доставлен");
//            }
//        }
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i * j + "\t");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите кол-во ступенек: ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }



        System.out.print("Введите общий выделенный бюджет: ");
        int budget = scanner.nextInt();

        System.out.print("Введите количество проектов: ");
        int projectsNumber = scanner.nextInt();

        for (int i = 1; i <= projectsNumber; i++) {
            System.out.print("Введите стоимость бюджета проекта " + i + ": ");
            int projectCost = scanner.nextInt();
            if (projectCost <= budget) {
                System.out.println("Проект " + i + " получил бюджет в размере " + projectCost);
                budget -= projectCost;
                System.out.println("Оставшийся бюджет: " + budget) ;
            } else {
                System.out.println("Бюджет закончился, проект " + i + " не получил финансирование");
            }
            System.out.println();
        }

//        System.out.print("Введите кол-во фильмов: ");
//        int movieAmount = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= movieAmount; i++) {
//            System.out.print("Введите продолжительность фильма в минутах: ");
//            int movieRuntime = scanner.nextInt();
//            sum += movieRuntime;
//        }
//
//        System.out.printf("Общая продолжительность всех фильмов в часах: %.2f", (double) sum / 60);



    }
}