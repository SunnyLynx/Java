package PracticalWork3;

import java.util.Scanner;

public class Task1 {

    // Необходимо реализовать калькулятор с использование методов.
    // Каждая операция калькулятора - это отдельный метод программы.

    public static void main(String[] args) {

        System.out.println("Введите 2 числа");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Выберите операцию (введите нужную цифру:");
        System.out.println("1 - '+'; 2 - '-'; 3 - '*'; 4 - '/'");
        Scanner scanner2 = new Scanner(System.in);
        int c = scanner2.nextInt();

        if (c == 1) {
            System.out.println(Calc.sum(a,b));
        } else if (c == 2) {
            System.out.println(Calc.sub(a,b));
        } else if (c == 3) {
            System.out.println(Calc.mult(a,b));
        } else if (c == 4) {
            System.out.println(Calc.div(a,b));
        } else {
            System.out.println("Вы ввели неверное число операции");
        }
    }

}

