package polymorphism.example_2;

public class ElectricCar extends Car {
    private int voltage;

    public ElectricCar(String brand, String model, int maxSpeed) {
        super(brand, model, maxSpeed);
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
}
