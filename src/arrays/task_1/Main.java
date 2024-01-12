package arrays.task_1;

public class Main {
    public static void main(String[] args) {
        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};

        // Добавьте 450 тенге к расходам за среду
        expenses[2] += 450;
        System.out.println("Новое значение расходов за среду: " + expenses[2] + " тенге.");

        // Суммируйте три самые крупные траты
        double sum = expenses[1] + expenses[4] + expenses[5];
        System.out.println("Самые большие расходы были во вторник, пятницу и субботу.");
        System.out.println("Всего вы потратили в эти дни: " + sum + " тенге.");
    }
}
