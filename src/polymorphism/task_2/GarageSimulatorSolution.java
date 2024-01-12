package polymorphism.task_2;

import java.util.Scanner;

public class GarageSimulatorSolution {
    static VehicleType[] types = VehicleType.values();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage garage = new Garage();

        while (true) {
            System.out.println("""
                    1. Добавить транспорт
                    2. Вывести все транспорты
                    3. Удалить транспорт
                    4. Вывести транспорты определенного типа
                    5. Вывести количество транспортов каждого типа
                    0. Завершить""");
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                displayTypes();
                System.out.print("Выберите тип транспорта: ");
                int typeNumber = Integer.parseInt(scanner.nextLine());
                VehicleType type = types[typeNumber - 1];

                String result = "";
                switch (type) {
                    case CAR -> {
                        result = "Автомобиль";
                        System.out.print("Введите название автомобиля: ");
                        garage.add(new Car(scanner.nextLine()));
                    }
                    case BIKE -> {
                        result = "Велосипед";
                        System.out.print("Введите название велосипеда: ");
                        garage.add(new Bike(scanner.nextLine()));
                    }
                }

                System.out.println("Добавлен транспорт типа " + result);
            } else if (command == 2) {
                garage.displayAll();
            } else if (command == 3) {
                garage.displayAllWithNum();

                System.out.print("Введите номер транспорта которого хотите удалить: ");
                int vehicleNum = Integer.parseInt(scanner.nextLine());

                Vehicle vehicle = garage.getVehicles()[vehicleNum - 1];
                garage.remove(vehicle);
            } else if (command == 4) {
                displayTypes();
                System.out.print("Выберите тип транспорта: ");
                int typeNumber = Integer.parseInt(scanner.nextLine());
                VehicleType type = types[typeNumber - 1];
                garage.displayAllByType(type);
            } else if (command == 5) {
                garage.displayCountOfEachType();
            } else if (command == 6) {
                garage.displayAllWithNum();
                System.out.println("Введите номер транспорта 1: ");
                int a = Integer.parseInt(scanner.nextLine());

                System.out.println("Введите номер транспорта 2: ");
                int b = Integer.parseInt(scanner.nextLine());

                garage.swap(a, b);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Несуществующая команда");
            }
            System.out.println();
        }
    }

    static void displayTypes() {
        for (int i = 0; i < types.length; i++) {
            System.out.println(i + 1 + ". " + types[i]);
        }
    }
}
