import java.util.Scanner;

public class PeersonPass {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Password ::");
        String passwordUser = scanner.next();
        if (passwordUser.equals("pass123")){
            System.out.println("You are authorized");
        }else if(passwordUser.equals("Admin")){
            System.out.println("you are authorized as an administrator");
        }else {
            System.out.println("wrong password");
        }



    }
}
