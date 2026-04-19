import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert status response (200, 404, 500): ") ;
        int response = input.nextInt();

        switch(response){
            case 200:
            {
                System.out.println("OK / Success!");
                break;
            }
            case 404:
            {
                System.out.println("Data not found!");
                break;
            }
            case 500:
            {
                System.out.println("Server error!");
                break;
            }
            default:
            {
                System.out.println("Status unknown");
            }
        }

        input.close();
    }
}
