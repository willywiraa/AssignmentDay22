package IfElseExercise;
import java.util.Scanner;

public class IfOnly {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 21) {
            System.out.println("You are allowed to drink alcohol!");
        }

        input.close();
    }
}
