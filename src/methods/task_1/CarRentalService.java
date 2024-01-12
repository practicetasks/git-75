package methods.task_1;

public class CarRentalService {


    double processRentalOrder(String model, int days, String region) {
        double rentPrice = calculateRentalPrice(model, days);
        double deliveryCost = calculateDeliveryCost(region);
        double total = rentPrice + deliveryCost;

        double tax = calculateTax(region, total);

        total += tax;
        if (days >= 7 && days <= 14) {
            total *= 0.95;
        } else if (days > 14){
            total *= 0.9;
        }
        return total;
    }

    double calculateRentalPrice(String model, int days) {
        switch (model) {
            case "Эконом":
                return 10000 * days;
            case "Бизнес":
                return 15000 * days;
            case "Премиум":
                return 20000 * days;
            default:
                return -1;
        }
    }

    double calculateDeliveryCost(String region) {
        switch (region) {
            case "Город":
                return 0;
            case "Ближний регион":
                return 5000;
            case "Дальний регион":
                return 10000;
            default:
                return -1;
        }
    }


    double calculateTax(String region, double price) {
        switch (region) {
            case "Город":
                return price * 0.12;
            case "Ближний регион":
                return price * 0.1;
            case "Дальний регион":
                return price * 0.08;
            default:
                return 0;
        }
    }
}
