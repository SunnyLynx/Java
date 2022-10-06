package PracticalWork2;

public class Task1_4 {
    public static void main(String[] args) {
        int A = 2;
        int B = 7;
        int sum = 0;

        for (int i = A; i <= B; i++) {
            sum += i;
        }

        System.out.println("Сумма всех целых чисел от A до B включительно = " + sum);
    }
}
