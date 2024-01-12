package loops.hometask_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Кол-во ступенек: ");
        int stairs = scanner.nextInt();
        for (int block = 1; block <= stairs; block++) {
            for (int j = stairs; j >= block; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= block; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

