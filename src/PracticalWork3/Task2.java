package PracticalWork3;

import java.util.Scanner;

public class Task2 {

    /*
    Представьте, что сумма за пользование услугами такси складывается
    из базового тарифа в размере $4,00 плюс $0,25 за каждые 140 м поездки.
    Напишите метод, принимающий в качестве единственного параметра расстояние поездки в километрах
    и возвращающую итоговую сумму оплаты такси.
    В основной программе должен демонстрироваться результат вызова метода.
     */


    public static void main(String[] args) {

        System.out.println("Введите длинну поездки в километрах");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println(getRes(a));
    }

    static double getRes(double a) {
        return 4.0 + (0.25 * a);
    }
}

