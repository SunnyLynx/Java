package Day2;

public class Task1_3 {
    public static void main(String[] args) {

        double A = 1;
        double B = 2.5;
        double C = 5.7;

//        double A = 1;
//        double B = 5.7;
//        double C = 2.5;

        if (A < B && B < C) {
            System.out.println(A*2 + " " + B*2 + " " + C*2);
        } else {
            System.out.println(A*(-1) + " " + B*(-1) + " " + C*(-1));
        }
    }
}
