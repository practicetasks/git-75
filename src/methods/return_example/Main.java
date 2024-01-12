package methods.return_example;

public class Main {
    public static void main(String[] args) {
        CarRentalService service = new CarRentalService();

        // Параметры для тестового заказа
        String model = "Бизнес";
        int days = 10;
        String region = "Город";

        System.out.println("Итоговая стоимость аренды: " + service.processRentalOrder(model, days, region) + " тенге");
    }
}
