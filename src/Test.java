public class Test {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            System.out.println("День " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Серия " + j);
            }
        }
        System.out.println("Ура! Вы прокачали и вложенные циклы, и английский!");
    }
//    public static void main(String[] args) {
//        printPrimeNumbers(20);
//    }
//
//    public static void printPrimeNumbers(int max){
//        for (int i =2; i<=max;i++) {
//            boolean flag = true;
//            for (int j =2; j<=i/2;j++)
//                if(i%j==0){
//                    flag= false;
//                    break;
//                }
//            if (flag) {
//                System.out.println(i);
//            }
//        }
//    }
//    public static void main(String[] args) {
////        int number1 = 3_000_000_000;
////        long number2 = 2_000_000_000;
//
////        int num = 20;
////        System.out.println(num);
////
////        num = 25;
////        System.out.println(num);
//
////        double megabytes = 32409.6;
////        double megabytesPerGigabyte = 1024;
////        double gigabytes = megabytes / megabytesPerGigabyte;
////
////        System.out.println(gigabytes);
//
////        float a = 3.14f;
////        double b = 3.14;
////        System.out.println(b);
//
////        boolean isRaining = true;
//
////        char c = 'C';
//
////        String answer = "Good";
////        System.out.println(answer);
//
////        int b;
////        System.out.println(b);
////        b = 2;
//
//
////        String hello = "Hello";
////        String name = "Alex";
////
////        System.out.println(hello + " " + name);
//
//
//
//        // Вычисление общей стоимости
////        int foodPrice = 8;
////        int bagPrice = 4;
////        int totalSum = foodPrice * 5 + bagPrice * 8;
////
////        System.out.println(totalSum);
//
//
//
////        String weather = "солнечно";
////        int temperature = 25;
////
////        System.out.println("Сегодня " + weather + "\nТемпература воздуха " + temperature + " градусов");
//
//
//
//        //     \n
//        // Сегодня солнечно
//        // Температура воздуха 25 градусов
//
//
////        Выводим текст
////        System.out.println(name + age + 2);
//
//
////        byte a = 12;
////        byte b = 12;
////        byte c = a + b;
////        System.out.println(c);
//
////        int age = 19;
////        age = age + 1;
////        age += 1;
////        age++;
//// 5 - 4 = 1
////        120 - 100 = 20
////        System.out.println(2 != 2);
////        >
////        <
////        ==
////        !=
//
//
////        for (int i = 0; i < 10; i++) {
////            System.out.println(i);
////        }
////
////        System.out.println("Это первый этаж дома, который построил Джек.");
////        for (int i = 2; i <= 10; i++) {
////            System.out.println("А это " + i + " этаж, он на один выше, чем этаж " + (i - 1));
////        }
////
////        for (int i = 1; i < 10; i++) {
////            System.out.println("А это " + (i+1) + " этаж, он на один выше, чем этаж " + i);
////        }
//
//        int money = 2500; // Деньги на корм
//        int foodPerDay = 500; // Стоимость пачки корма
//        int days = 0; // Дни, когда вы сможете покупать корм
//        for (int i = money - foodPerDay; i >= 0; i -= foodPerDay) {
//            days += 3;
//            System.out.println("На " + days + "-й день останется " + i + " тенге.");
//        }
//        System.out.println("Денег хватит на " + days + " дней.");
//
//
//
////        Это первый этаж дома, который построил Джек.
////        А это 2 этаж, он на один выше, чем этаж 1
////        А это 3 этаж, он на один выше, чем этаж 2
////        А это 4 этаж, он на один выше, чем этаж 3
////        А это 5 этаж, он на один выше, чем этаж 4
////        А это 6 этаж, он на один выше, чем этаж 5
////        А это 7 этаж, он на один выше, чем этаж 6
////        А это 8 этаж, он на один выше, чем этаж 7
////        А это 9 этаж, он на один выше, чем этаж 8
////        А это 10 этаж, он на один выше, чем этаж 9
//
//    }
}
