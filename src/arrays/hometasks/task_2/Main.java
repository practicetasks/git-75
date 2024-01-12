package arrays.hometasks.task_2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 4, 8, 5};
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        int max2nd = numbers[0];
        for (int number : numbers) {
            if (number > max2nd && number < max) {
                max2nd = number;
            }
        }

        System.out.println(max);
        System.out.println(max2nd);
    }
}
