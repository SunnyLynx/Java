package PracticalWork3;

import java.util.Scanner;

public class Task3 {
    /*
    Интернет-магазин предоставляет услугу экспресс-доставки
    для части своих товаров по цене $10,95 за первый товар в заказе
    и $2,95 – за все последующие.
    Напишите метод, принимающий в качестве единственного параметра
    количество товаров в заказе и возвращающую общую сумму доставки.
    В основной программе должны производиться запрос количества позиций
    в заказе у пользователя и отображаться на экране сумма доставки.
     */

    public static void main(String[] args) {

        System.out.println("Введите количество товаров в заказе");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println("Сумма доставки = " + getRez(a));
    }

    static double getRez(double a) {
        return 10.95 + (2.95 * (a-1));
    }
}
