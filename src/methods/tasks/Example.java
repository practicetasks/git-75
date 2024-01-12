package methods.tasks;

public class Example {
    void display(String name, String lastname, int age) {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + lastname);
        System.out.println("Возраст: " + age);
    }


    void formatFriendsCount(int friendsCount) {
        switch (friendsCount) {
            case 0 -> System.out.println("У вас нет друзей");
            case 1 -> System.out.println("У вас 1 друг");
            case 2, 3, 4 -> System.out.println("У вас " + friendsCount + " друга");
            default -> System.out.println("У вас " + friendsCount + " друзей");
        }
    }

    void greeting(int hours) {
        if (hours >= 0 && hours < 6 || hours == 23) {
            System.out.println("Доброй ночи");
        } else if (hours >= 6 && hours < 12) {
            System.out.println("Доброе утро");
        } else if (hours >= 12 && hours < 18) {
            System.out.println("Добрый день");
        } else if (hours >= 18 && hours < 23) {
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Некорректное число");
        }
    }

    void checkDaysInMonth(int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 4, 6, 9, 11:
                System.out.println("В этом месяце 30 дней");
                break;
            case 2:
                System.out.println("В этом месяце 28 или 29 дней");
                break;
            default:
                System.out.println("Некорректный номер месяца");
        }
    }


    void isPrime(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.println(number + " - не является простым числом.");
                return;
            }
        }
        System.out.println(number + " - простое число.");
    }



}
