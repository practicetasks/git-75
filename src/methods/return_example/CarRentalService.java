package methods.return_example;

public class CarRentalService {

    public double calculateRentalPrice(String model, int days) {
        switch (model) {
            case "Эконом":
                return 10000 * days;
            case "Бизнес":
                return 20000 * days;
            case "Премиум":
                return 30000 * days;
            default:
                return 0;
        }
    }

    public double calculateDeliveryCost(String region) {
        switch (region) {
            case "Ближний регион":
                return 5000;
            case "Дальний регион":
                return 10000;
            default:
                return 0;
        }
    }

    public double calculateTax(String region, double price) {
        switch (region) {
            case "Город":
                return price * 0.12;
            case "Ближний регион":
                return price * 0.10;
            case "Дальний регион":
                return price * 0.08;
            default:
                return price;
        }
    }


    public double processRentalOrder(String model, int days, String region) {
        double rentalPrice = calculateRentalPrice(model, days);
        double deliveryCost = calculateDeliveryCost(region);
        double tax = calculateTax(region, rentalPrice);
        double totalCost = rentalPrice + deliveryCost + tax;

        if (days >= 7 && days <= 14) {
            totalCost *= 0.95;
        } else if (days > 14) {
            totalCost *= 0.90;
        }

        return totalCost;
    }
}
