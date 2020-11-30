import java.util.Scanner;

public class ScreenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number m");
        double m = scanner.nextDouble();
        System.out.println("Enter number n");
        double n = scanner.nextDouble();

        int d = 10;
        double b = Math.abs(d - n);
        double c = Math.abs(d - m);

        if (b == c) {
            System.out.println("Number " + n + "and" + m + "equal" + d);
        } else {
            System.out.println("Number  " + m + "shines to " + d);
        }
        if (b < c) {
            System.out.println("Number" + n + "shines to " + d);
        }
    }
}


