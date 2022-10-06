package PracticalWork1;

public class Task2 {
    public static void main(String[] args) {

        int weightUnit = 5;
        double weight = 5.5;
        double k = 0;
        double res;

        switch (weightUnit) {
            case (1): k = 1;
            break;

            case (2): k = 0.000001;
            break;

            case (3): k = 0.001;
            break;

            case (4): k = 1000;
            break;

            case (5): k = 100;
            break;

            default:
                System.out.println("Ошибка");
        }

        res = weight * k;
        System.out.println("Рузультат = " + res + " килограмм");

    }
}
