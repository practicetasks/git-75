package methods.example_1;

public class Main {

    public static void main(String[] args) {
        // Ниже вызовите новый метод
        String highestGrossingFilm = findHighestGrossingFilm();
        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);
    }

    public static String findHighestGrossingFilm() {
        String film1 = "Титаник";
        int income1 = 2194;

        String film2 = "Аватар";
        int income2 = 2810;

        String film3 = "Тёмный рыцарь";
        int income3 = 1084;

        // Допишите реализацию метода ниже
        if (income1 > income2 && income1 > income3) {
            return film1;
        } else if (income2 > income1 && income2 > income3) {
            return film2;
        } else {
            return film3;
        }
    }

//    public static void main(String[] args) {
//        int result = plus(5, 6);
//        System.out.println(result);
//
//        System.out.println(hello("Alexey"));
//    }
//
//    static String hello(String name) {
//        return "Hello " + name;
//    }
//
//    static int plus(int a, int b) {
//        return a + b;
//    }

}
