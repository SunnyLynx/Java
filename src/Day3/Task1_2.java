package Day3;

public class Task1_2 {
    public static void main(String[] args) {
        int A = 2;
        int B = 10;
        int N = 0;

        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
            N += 1;
        }

        System.out.println();
        System.out.println("N = " + N);

    }
}
