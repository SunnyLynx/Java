package PracticalWork4;

import java.util.Scanner;

public class Task1 {

    /*
    Даны целые положительные числа M и N.
    Сформировать целочисленную матрицу размера M × N,
    у которой все элементы J-го столбца имеют значение 5*J (J = 1, …, N).
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

        int[][] array = new int[M][N];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = 5 * (j + 1);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

