package methods.tasks;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Example example = new Example();

        System.out.print("Время: ");
        example.greeting(new Scanner(System.in).nextInt());
    }
}

