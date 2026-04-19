import java.util.Scanner;

public class SwitchCaseExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DAFTAR MENU");
        System.out.println("===========");
        System.out.println("1. Nasi Goreng + Teh Es");
        System.out.println("2. Mie Ayam + Teh Es");
        System.out.println("3. Pangsit + Air Putih Hangat");
        System.out.print("Pilih menu (1-3): ");

        //Validasi input
        if (input.hasNextInt()) {
            int menu = input.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println(" ");
                    System.out.println("Menu kamu adalah Nasi Goreng + Teh Es");
                    break;
                }
                case 2: {
                    System.out.println(" ");
                    System.out.println("Menu kamu adalah Mie Ayam + Teh Es");
                    break;
                }
                case 3: {
                    System.out.println(" ");
                    System.out.println("Menu kamu adalah Pangsit + Air Putih Hangat");
                    break;
                }
                default: {
                    System.out.println(" ");
                    System.out.println("Menu tidak tersedia");
                }
            }
            System.out.println("Terima kasih sudah memesan :) ");
        }
        else {
            System.out.println("Input harus berupa angka!");
        }

        input.close();
    }
}
