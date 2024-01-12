package static_example;

import java.util.Arrays;


class Test {
    public static void main(String[] args) {
//        String a = "123";
//        int b = Integer.parseInt(a);
//        System.out.println(b + 2);

//        Double.parseDouble();
//        Long.parseLong();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}

class Example  {
    static int i;
    int j;

    static {
        i = 10;
        System.out.println("Вызван статический блок");
    }

    Example() {
        System.out.println("Вызов конструктора");
    }
}


class Data {
    static int[] numbers = new int[10];

    static {
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }
}


class Product {
    private int id;
    private String name;

    public Product(String name) {
        this.id = getUniqueId();
        this.name = name;
    }

    private static int serial = 1;

    public static int getUniqueId() {
        return serial++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}