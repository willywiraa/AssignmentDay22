package IfElseExercise;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("May i know your age?: ");
        int age = input.nextInt();

        if(age >= 21){
            System.out.println("You can drink alcohol");
        }
        else{
            System.out.println(" ");
            System.out.println("Sorry, your age doesn't meet the minimum requirement :(");
            System.out.println("Comeback when you turn 21 :)");
        }

        input.close();
    }
}
