package PracticalWork3;

import java.util.Scanner;

public class Task4 {

    /*
    Простое число представляет собой число, большее единицы,
    которое без остатка делится лишь на само себя и единицу.
    Напишите метод для определения того, является ли введенное число простым.
    Возвращаемое значение должно быть либо True, либо False.
    В основной программе, как и ожидается, пользователь должен ввести целое число
    и получить ответ о том, является ли оно простым.
     */

    public static void main(String[] args) {

        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (isPrime(a)) {
            System.out.println("Введенное число простое");
        } else {
            System.out.println("Ввведенное число не является простым");
        }

    }

    static boolean isPrime(int a) {
        boolean flag = true;

        for (int i = 2; i < a && flag; i++) {
            if (a%i != 0) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
