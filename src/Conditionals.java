public class Conditionals {
    public static void main(String[] args) {
//        int speed = 1;
//        if (speed == 0) {
//            System.out.println("Нет ветра");
//        } else if (speed == 1) {
//            System.out.println("Легкий ветер");
//        } else if (speed == 2) {
//            System.out.println("Средний ветер");
//        } else if (speed == 4) {
//            System.out.println("...");
//        } else {
//            System.out.println("Есть ветер");
//        }

//        int number = 0;
//        if (number > 0) {
//            System.out.println("Число положительное");
//        } else if (number < 0) {
//            System.out.println("Число отрицательное");
//        } else {
//            System.out.println("Число равно нулю");
//        }

//        int age = 20;
//        if (age >= 18) System.out.println("Вы совершеннолетний");
//        else System.out.println("Вы несовершеннолетний");
//        int score = 90;
        
//        от 90 до 100 - Отлично
//        от 75 до 89 - Хорошо
//        от 60 до 74 - Удовлетворительно
//        меньше 60 - Неудовлетворительно
//        &&
//        if (score >= 90 && score <= 100) {
//
//        } else if (score >= 75 && score <= 89) {
//
//        } else if () {
//
//        }

//        String weather = "солнечная";
//        int temperature = 25;
//        boolean isGoodWeather = temperature >= 25 && weather == "солнечная";
//
//        if () {
//            System.out.println("Хорошая погода, можно идти на пляж");
//        } else {
//            System.out.println("Неподходящая погода для пляжа");
//        }


//        && - and            || - or       ! - not

//        Если температура воздуха больше или равно 25
//        и погода солнечная -> Хорошая погода, можно идти на пляж

//        В противном случае -> Неподходящая погода для пляжа

//
//        int x = 4;
//
//        boolean isNegative = x < 0;
//        System.out.println(isNegative);

        // ВОПРОС: 64 000 мегабайт больше или равно 64 гигабайтам??
//        int megabytes = 64000;
//        int gigabytes = 64;
//        int megabytesPerGigabyte = 1024;
//        int result = gigabytes * megabytesPerGigabyte;
//        boolean isMbMore = megabytes >= result;
//        System.out.println(isMbMore);
//        String weather = "солнечно";
//        System.out.println(weather == "солнечно");
//        System.out.println(weather.equals("солнечно"));

//        String color = "Зеленый";
//        if (color.equals("Красный")) {
//            System.out.println("Беру яблоки");
//        } else {
//            System.out.println("Беру апельсины");
//        }
//        System.out.println("Иду домой.");






//        int variable1 = 0;
//        double variable2;
//        int variable3 = 3;
//        if (variable3 < 5) {
//            String variable4 = "С областями видимости у новичков часто бывают сложности.";
//            double variable5 = 76.5;
//            variable1 = 33;
//            System.out.println("Но у вас таких проблем не будет!");
//        }
//        double variable6;




//        double rateUSD = 444.06;
//        double tenges = 124356.5;
//
//        if (rateUSD < 450) {
//            System.out.println("Отличный курс доллара — рекомендую купить!");
//        }
//        System.out.println("Ваши сбережения в долларах: " + tenges / rateUSD);


//        double rateUSD = 444.06;
//        double rateEUR = 489.32;
//        double tenges = 124356.5;
//
//        String currency = "EUR";
//        // Если currency равно "USD", то конвертируем в доллары, иначе в евро
//        System.out.println("Вы конвертируете тенге в " + currency);
//        if (currency == "USD") {
//            System.out.println("Ваши сбережения в долларах: " + tenges / rateUSD);
//        } else if (currency == "EUR") {
//            System.out.println("Ваши сбережения в евро: " + tenges / rateEUR);
//        } else {
//            System.out.println("Валюты " + currency + " на данный момент нет");
//        }




//        double purchase = 9000;
//        if (purchase >= 10000) {
//            double discount = 60;
//            if (discount >= 5 && discount <= 50) {
//                purchase -= purchase * (discount / 100);
//                System.out.println("Сумма с учетом " + (int) discount + "% скидки составляет: " + purchase);
//            } else {
//                System.out.println("Скидка должна быть не меньше 5 и не больше 50");
//            }
//        } else {
//            System.out.println("Скидка не доступна");
//        }


//        double purchase = 9000;
//        double discount = 60;
//        if (purchase >= 10000 && discount >= 5 && discount <= 50) {
//            purchase -= purchase * (discount / 100);
//            System.out.println("Сумма с учетом " + (int) discount + "% скидки составляет: " + purchase);
//        } else {
//            System.out.println("Скидка не доступна");
//        }


//        Домашние задачи:
//
//1) Вы разрабатываете программу для онлайн-магазина.
// Пользователи могут получить скидку в зависимости от суммы покупки.
// Если сумма покупки превышает 10000 тенге, применяется скидка 10%.
// Если сумма покупки меньше 10000 тенге, скидка не предоставляется.
// Напишите программу, которая проверяет сумму покупки и выводит сумму
// с учетом скидки (если она применяется) или сообщение "Скидка не доступна". Пример:
//
//double purchase = 15000;
//Ожидаемый результат:
//Сумма с учетом 10% скидки составляет: 13500
//
//
//
//double purchase = 9000;
//Ожидаемый результат:
//Скидка не доступна
//
//
//
//
//2) Задача: Напишите программу-калькулятор, которая выполнит операции над двумя предварительно заданными числами. Программа будет использовать заданные значения для выполнения операций (сложение, вычитание, умножение, деление). При помощи логических операторов выполните операцию и выведите результат. Пример:
//
//int a = 12;
//int b = 4;
//String sign = "+";
//if (sign == "+") {
//    ...
//}
//
//
//Ожидаемый результат: 16
//
//int a = 12;
//int b = 4;
//String sign = "-";
//Ожидаемый результат: 8



//        int number1 = 5;
//        int number2 = 8;
//
//        String sign = "+";
//
//        switch (sign) {
//            case "+":
//                System.out.println(number1 + number2);
//                break;
//            case "-":
//                System.out.println(number1 - number2);
//                break;
//            case "/":
//                System.out.println(number1 / number2);
//                break;
//            case "*":
//                System.out.println(number1 * number2);
//                break;
//            default:
//                System.out.println("Некорректный символ");
//        }


//        int age = 19;
//        boolean isValidAge = age >= 18;
//        int a = isValidAge ? 1 : 0;
//        System.out.println(a);



//        for (int i = 1; i <= 6; i++){
//            System.out.println("Решаем задачу " + i);
//        }
//        System.out.println("Задачи решены");
        System.out.println("Это первый этаж дома, который построил Джек.");
        for (int i = 2; i <= 10; i++) {
            System.out.printf("А это %d этаж, он на один выше, чем этаж %d\n", i, i-1);
        }

//        10 > 5 = true  sout
//        9 > 5 = true  sout
//        8 > 5 = true  sout
//        7 > 5 = true  sout
//        6 > 5 = true  sout
//        5 > 5 = false

        // Решаем задачу 1
        // Решаем задачу 2
        // Решаем задачу 3
        // Решаем задачу 4
        // Решаем задачу 5
        // Решаем задачу 6
        // Задачи решены



//        while (product <= 5) {
//            System.out.println("Текущее количество корзины: " + product);
//            product++;
//        }

//        do {
//            System.out.println("Текущее количество корзины: " + product);
//            product++;
//        } while (product <= 5);

        // 10 <= 5 = false


//        if (sign.equals("+")) {
//            System.out.println(number1 + number2);
//        } else if (sign.equals("-")) {
//            System.out.println(number1 - number2);
//        } else if (sign.equals("/")) {
//            System.out.println(number1 / number2);
//        } else if (sign.equals("*")) {
//            System.out.println(number1 * number2);
//        } else {
//            System.out.println("Некорректный символ");
//        }


    }
}
