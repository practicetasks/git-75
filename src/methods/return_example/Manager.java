package methods.return_example;

public class Manager {


    void isPrime(int number) {
        if (number < 2) {
            System.out.println("Число не является простым");
            return;
        }

        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                System.out.println("Число не является простым");
                return;
            }
        }
        System.out.println("Число является простым");
    }


    void multiplyWithReturn(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
            return;
        }
        System.out.println("конец цикла");
    }


    void multiplyWithBreak(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
            break;
        }
        System.out.println("конец цикла");
    }


    double test(int a) {
        System.out.println("раз");
        if (a == 1) {
            System.out.println("два");
            return 0.0;
        }
        System.out.println("три");
        return 0.1;
    }


    String validateAge(int age){
        if (age >= 0 && age <= 5) {
            return "Ребенок";
        } else if (age >= 6 && age <= 11) {
            return "Юноша";
        } else if (age >= 12 && age <= 17) {
            return "Подросток";
        } else if (age >= 18) {
            return "Совершеннолетний";
        }
        return "Некорректное число";
    }


    String getName() {
        return "John";
    }

    String getMessage() {
        System.out.println("Test message");
        return "Test";
    }

    void testMethod(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void info(int a) {
        System.out.println(a + 2);
    }

    int method1(int a, int b) {
        return a + b;
    }

    String greeting(String name) {
        return "Hello " + name;
    }
}
