import java.util.Scanner;

public class scroe {

    public static void main(String[] args) {
        int testScore;
        Scanner scanIn = new Scanner(System.in);
        int a = scanIn.nextInt();
        if (a <= 49) {
            System.out.println("F");
        } else if (a >= 50 && a <= 54) {
            System.out.println("D");
        } else if (a >= 55 && a <= 59) {
            System.out.println("D+");
        } else if (a >= 60 && a <= 64) {
            System.out.println("c");
        } else if (a >= 65 && a <= 69) {
            System.out.println("c+");
        } else if (a >= 70 && a <= 74) {
            System.out.println("b");
        } else if (a >= 75 && a <= 79) {
            System.out.println("b+");
        } else if (a >= 80) {
            System.out.println("A");
        } else if (a >= 90 && a <= 95) {
            System.out.println("A+");
        }
        System.out.println();
    }
}
