package methods.return_example;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();


//        EXAMPLE 1
        String greet = manager.greeting("Alex");
        System.out.println(greet);


//        EXAMPLE 2
        int result = manager.method1(1, 5);
        System.out.println(result);


//        EXAMPLE 3
        manager.info(5);


//        EXAMPLE 4
        manager.testMethod(4, 5, 6);


//        EXAMPLE 5
        String message = manager.getMessage();
        System.out.println(message);


//        EXAMPLE 6
        String validateAge = manager.validateAge(16);
        System.out.println(validateAge);


//        EXAMPLE 7
        manager.test(0);


//        EXAMPLE 8
        manager.multiplyWithBreak(5);


//        EXAMPLE 9
        manager.multiplyWithReturn(5);
    }
}
