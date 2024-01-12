package methods.task_1;

public class Main {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();

        String model = "Эконом";
        int days =  10;
        String region = "Город";

        double total = carRentalService.processRentalOrder(model, days, region);
        System.out.println(total);
    }
}
