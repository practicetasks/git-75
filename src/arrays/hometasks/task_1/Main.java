package arrays.hometasks.task_1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 9, 12, 17};
        int total = 0;
        for (int number : numbers) {
            if (number % 3 == 0) {
                total += number;
            }
        }
        System.out.println(total);

    }
}
