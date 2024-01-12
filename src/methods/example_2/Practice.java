package methods.example_2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int balls = 18;
        System.out.println("У Пикселя " + balls + " мячиков");
        playPixel(balls);
        System.out.println("Пиксель вернул все мячики");
        System.out.println("Их снова " + balls);
    }

    public static void playPixel(int balls) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мячиков он спрятал?");
        int hiddenBalls = scanner.nextInt();
        balls -= hiddenBalls;
        System.out.println("Осталось " + balls );
    }
//    public static void main(String[] args) {
//        String username = "Пиксель";
//        sayHello();
//    }
//
//    public static void sayHello() {
//        String username = "Байт";
//        System.out.println("Привет, " + username);
//    }
//    public static void main(String[] args) {
//
//        int tenge = 15000;
//        int result = converter(tenge, getCurrency("eur"));
//        System.out.println(result);
//    }
//
//    static int converter(int tenge, int currency) {
//        return tenge / currency;
//    }
//
//    static int getCurrency(String currencyCode) {
//        switch (currencyCode) {
//            case "usd":
//                return usd();
//            case "eur":
//                return 503;
//            default:
//                return -1;
//        }
//    }
//
//
//    static int usd() {
//        return 459;
//    }

//    public static void main(String[] args) {
//        System.out.println(method(2));
//    }
//
//
//    static int method(int command) {
//        System.out.println("Раз");
//        if (command == 2) {
//            System.out.println("Два");
//            return 2;
//        }
//
//        System.out.println("Три");
//        return 3;
//    }

//    public static void main(String[] args) {
//        System.out.println("Наибольшее из чисел = " + findMax());
//    }
//
//    public static int findMax() {
//        int a = 3;
//        int b = 3;
//        if (a > b) {
//            return a;
//        } else if (a < b) {
//            return b;
//        }
//    }

//    public static void main(String[] args) {
//        example(1);
//    }
//
//    public static void example(int command) {
//        return;
//        if (command == 1) {
//            System.out.println("Привет!");
//        } else if (command == 0) {
//            System.out.println("Выход");
//            return; // Оператор return стоит в конце блока кода ветвления
//            // При сommand == 0 метод будет сразу завершён
//        }
//        // Эта строка будет выведена, если метод не завершился (сommand == 1)
//        System.out.println("Напечатаем ещё одну строку");
//    }
}
