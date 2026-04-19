package IfElseExercise;
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        String correctUsername = "willy";
        String correctPassword = "willyganteng";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        if(correctUsername.equals(username)){
            if(correctPassword.equals(password)){
                System.out.println(" ");
                System.out.println("LOGIN SUCCESS!");
            }
            else {
                System.out.println("Wrong password");
            }
        }
        else {
            System.out.println("Username not found!");
        }


        input.close();
    }
}
