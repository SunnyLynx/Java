package PracticalWork1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите 2 числа");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Выберите операцию (введите нужную цифру:");
        System.out.println("1 - '+'; 2 - '-'; 3 - '*'; 4 - '/'");
        Scanner scanner2 = new Scanner(System.in);
        int c = scanner2.nextInt();

        if (b == 0 && c == 4) {
            System.out.println("Делить на 0 нельзя");
        } else {
            switch (c) {
                case (1):
                System.out.println(a + b);
                break;

                case (2):
                System.out.println(a - b);
                break;

                case (3):
                System.out.println(a * b);
                break;

                case (4):
                System.out.println(a / b);
                break;

                default:
                System.out.println("Вы вели некорректное число операции");
            }
        }
    }
}
