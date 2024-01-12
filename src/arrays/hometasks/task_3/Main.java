package arrays.hometasks.task_3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " простое число");
            }
        }
    }
}
