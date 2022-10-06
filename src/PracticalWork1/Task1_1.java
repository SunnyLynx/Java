package PracticalWork1;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            number += 1;
        }
        System.out.println(number);

        // Задача 2
        System.out.println("Введите целое число");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();


        if (number1 > 0) {
            number1 +=1;
        } else if (number1 < 0) {
            number1 -=2;
        } else {
            number1 = 10;
        }

        System.out.println(number1);
    }
}
