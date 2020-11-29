import java.util.Scanner;

public class Numbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = scanner.nextInt();

        if (num % 3 == 1){
            System.out.println("Pair");
        }else {
            System.out.println("odd");
        }

    }
}
