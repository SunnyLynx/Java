package PracticalWork4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {

    /*
     Дана целочисленная матрица размера M × N.
     Найти номер первой из ее строк, содержащих
     равное количество положительных и отрицательных элементов
     (нулевые элементы матрицы не учитываются). Если таких строк нет, то вывести 0.
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
                matrix[i][j] = random.nextInt(-10, 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int flag = 0;

        for (int i = 0; i < M && flag == 0; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] > 0) {
                    count += 1;
                } else if (matrix[i][j] < 0) {
                    count -= 1;
                }
            }
            if (count == 0) {
                System.out.println(i);
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println(0);
        }


    }
}
