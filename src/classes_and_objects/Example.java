package classes_and_objects;


public class Example {
    void display(String name, String lastname, int age) {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + lastname);
        System.out.println("Возраст: " + age);
    }

    void test() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    void processAge(int age) {
        if (age >= 18) {
            System.out.println("совершеннолетний");
        } else {
            System.out.println("несовершеннолетний");

        }
    }

void formatFriendsCount(int friends) {
    if (friends == 0) {
        System.out.println("У вас нет друзей");
    } else if (friends == 1) {
        System.out.println("У вас 1 друг");
    } else if (friends >= 2 && friends <= 4) {
        System.out.println("У вас " + friends + " друга");
    }  else {
        System.out.println("У вас " + friends + " друзей");
    }
}

}
