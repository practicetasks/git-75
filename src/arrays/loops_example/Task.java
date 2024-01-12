package arrays.loops_example;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};

        // 1
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }


        // 2
        for (int i = 0; i < numbers.length / 2; i++) {
            System.out.println(numbers[i]);
        }

        // 3
        for (int i = numbers.length / 2; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 4
        for (int i = 1; i < numbers.length-1; i++) {
            System.out.println(numbers[i]);
        }

        // 5
        for (int i = numbers.length - 3; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 6
        for (int i = 1; i < numbers.length; i+=2) {
            System.out.println(numbers[i]);
        }

        // 7
        int positiveCount = 0;
        int negativeCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            }
            if (number < 0) {
                negativeCount++;
            }
        }

        System.out.println("Кол-во положительный чисел: " + positiveCount);
        System.out.println("Кол-во отрицательных чисел: " + negativeCount);

        // 8
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i-1]) {
                System.out.println(numbers[i]);
            }
        }


        // 9
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
