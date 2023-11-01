
package wiwiLestiani;

import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih menu:");
        System.out.println("1. Menu 1");
        System.out.println("2. Menu 2");
        System.out.println("3. Menu 3");

        System.out.print("Masukkan nomor menu: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Menu 1");
                break;
            case 2:
                System.out.println("Anda memilih Menu 2");
                break;
            case 3:
                System.out.println("Anda memilih Menu 3");
                break;
            default:
                System.out.println("Menu tidak valid.");
        }

        scanner.close();
    }
}


