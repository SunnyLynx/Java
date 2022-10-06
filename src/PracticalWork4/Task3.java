package PracticalWork4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    /*
    Дана матрица размера M × N.
    Для каждой строки матрицы найти сумму ее элементов.
     */

    public static void main(String[] args) {

        System.out.println("Введите целые положительные числа M и N");
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        if (M <= 0 || N <= 0) {
            System.out.println("Вы ввели число >= 0");
            return;
        }

        int[][] matrix = new int[M][N];
        Random random = new Random();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int sum = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sum += matrix[i][j];
            }
            System.out.println(sum);
        }
    }
}
