package methods.return_hometask;

public class Example {
    double CarRentalService(String model, int days) {
        switch (model) {
            case "Эконом":
                int service = 10000 * days;
                System.out.println("Общая стоимость аренды в тенге: " + service);
                break;
            case "Бизнес":
                service = 15000 * days;
                System.out.println("Общая стоимость аренды в тенге: " + service);
                break;
            case "Премиум":
                service = 25000 * days;
                System.out.println("Общая стоимость аренды в тенге: " + service);
                break;
        }
        return 0;
    }

    double calculateDeliveryCost(String region) {
        switch (region) {
            case "Город":
                int many = 0;
                System.out.println("Доставка бесплатная");
                break;
            case "Ближний регион":
                many = 5000;
                System.out.println("Стоимость доставки в тенге: " + many);
                break;
            case "Дальний регион":
                many = 10000;
                System.out.println("Стоимость доставки в тенге: " + many);
                break;
        }
        return 0;
    }

    double calculateTax(String region, double price) {
        switch (region) {
            case "Город":
                return price * 0.12;
            case "Ближний регион":
                return price * 0.1;
            case "Дальний регион":
                return price * 0.08;
        }
        return 0;
    }

    double processRentalOrder(String model, int days, String region, double price) {
        double calculateRentalPrice = CarRentalService(model, days);
        double calculateDeliveryCost = calculateDeliveryCost(region);
        double calculateTax = calculateTax(region, price);
        double sail = 0;
        if (days <= 0 && days > 7) {
            sail = 0;
            System.out.println("Скидки нету");
        } else if (days <= 7 && days > 14) {
            sail = price * 0.05;
            System.out.println("Скидка: " + sail);
        } else if (days <= 14) {
            sail = price * 0.1;
            System.out.println("Скидка: " + sail);
        }
        System.out.println("Итоговая стоимость аренды в тенге:" + price + calculateRentalPrice + calculateDeliveryCost + calculateTax + sail);
        return 0.0;
    }

}