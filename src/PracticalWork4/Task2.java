package PracticalWork4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    /*
    Дана матрица размера M × N.
    Вывести ее элементы в следующем порядке:
    первый столбец сверху вниз, второй столбец снизу вверх,
    третий столбец сверху вниз, четвертый столбец снизу вверх и т. д.
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

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int el;
                el = (j%2 == 0) ? matrix[i][j] : matrix[matrix.length - i-1][j];
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
