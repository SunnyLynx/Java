package PracticalWork2;

import static java.lang.Math.pow;

public class Task2_1 {
    public static void main(String[] args) {
        int N = 32;
        int K = 1;

        while (N != pow(2, K)) {
            K++;
        }

        System.out.println(K);
    }
}
