package methods.solutions;

public class Example {
//    void greeting(int hour) {
//        if (hour < 0 || hour > 23) {
//            System.out.println("Некорректное число");
//        } else if (hour < 6 || hour == 23) {
//            System.out.println("Доброй ночи");
//        } else if (hour < 12) {
//            System.out.println("Доброе утро");
//        } else if (hour < 18) {
//            System.out.println("Добрый день");
//        } else {
//            System.out.println("Добрый вечер");
//        }
//    }

    String greeting(int hour) {
        if (hour < 0 || hour > 23) {
            return "Некорректное число";
        } else if (hour < 6 || hour == 23) {
            return "Доброй ночи";
        } else if (hour < 12) {
            return "Доброе утро";
        } else if (hour < 18) {
            return "Добрый день";
        } else {
            return "Добрый вечер";
        }
    }

    double processOrder(String category, String country, double purchase) {
        boolean isAvailable = checkAvailability(category);

        if (!isAvailable) {
            System.out.println("в данной категорий товары отсутствуют");
            return 0.0;
        }


        double priceAfterDiscount = processDiscount(category, purchase);
        double deliveryCost = processDelivery(country);
        double tax = makeTax(country, priceAfterDiscount);

        double total = priceAfterDiscount + deliveryCost + tax;
        System.out.println("Передали: " + purchase);
        System.out.println("Стоимость после обработки категорий: " + priceAfterDiscount);
        System.out.println("Стоимость после обработки доставки: " + deliveryCost);
        System.out.println("Налог: " + tax);
        System.out.println("Итого к оплате: " + total);

        return total * 0.05;
    }



    double processDiscount(String category, double purchase){
        switch (category) {
            case "смартфоны":
                return purchase * 0.9;
            case "ноутбуки":
                return purchase * 0.8;
            case "наушники":
                return purchase * 0.85;
            default:
                return purchase;
        }
    }

    double processDelivery(String country) {
        if (!country.equals("США") && !country.equals("КАНАДА")) {
            return 10;
        }
        return 0;
    }

    double makeTax(String country, double price) {
        switch (country) {
            case "США":
                return price * 0.14;
            case "КАНАДА":
                return price * 0.13;
            default:
                return price * 0.05;
        }
    }

    boolean checkAvailability(String category) {
        if (category.equals("наушники")){
            return false;
        }
        return true;
    }







    void multiply(int a, int b){
        System.out.println(a * b);
        multiply(7, 6);
    }


    void method1(){
        System.out.println("Раз");
        method2();
    }

    void method2() {
        System.out.println("Два");
        method1();
    }


    void checkDaysInMonth(int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
            case 4, 6, 9, 11 -> System.out.println("30 дней");
            case 2 -> System.out.println("28 либо 29 дней");
            default -> System.out.println("Некорректный номер");
        }
    }


    void isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + " - " + (isPrime ?  "" :  "не ") + "простое число");
    }
}
