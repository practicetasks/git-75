package classes_and_objects;

public class Vehicle {
    String type;       // Тип транспортного средства
    boolean isRented;  // Статус аренды

    // Конструктор класса
//    public Vehicle(String type) {
//        this.type = type;
//        this.isRented = false; // По умолчанию транспорт не арендован
//    }

    // Метод для аренды транспорта
    void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println(type + " теперь арендован.");
        } else {
            System.out.println(type + " уже арендован.");
        }
    }

    // Метод для возврата транспорта
    void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println(type + " возвращен и доступен для аренды.");
        } else {
            System.out.println(type + " не арендован.");
        }
    }

    // Метод для печати статуса транспорта
    void printStatus() {
        String status = isRented ? "арендован" : "доступен для аренды";
        System.out.println(type + ": " + status);
    }
}
