package polymorphism.example_2;

public class Kolesa {
    private Car[] cars;

    public Kolesa(int size) {
        cars = new Car[size];
    }

    public void addCar(Car car) {
        cars[0] = car;
    }


    public void showCarInfo(Car car) {
        System.out.println("Тип машины: ...");
        System.out.println("Бренд: " + car.getBrand());
        System.out.println("Модель: " + car.getModel());
        System.out.println("Макс скорость: " + car.getMaxSpeed());
        if (car instanceof ElectricCar) {
            System.out.println("Вольт: " + ((ElectricCar) car).getVoltage());
        }
    }

    public Car[] getCars() {
        return cars;
    }
}
