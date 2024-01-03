package wiwiLestiani;

import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = scanner.nextInt();
        
        // Mengubah kondisi untuk mengecek tidak habis dibagi 2 dan 4
        if (angka % 2 != 0 && angka % 4 != 0) {
            System.out.println("Angka tidak habis dibagi 2 atau 4");
        } else if (angka % 2 == 0 && angka % 4 == 0) {
            System.out.println("Master class");
        } else if (angka % 2 == 0) {
            System.out.println("Pride of 2");
        } else if (angka % 4 == 0) {
            System.out.println("Pride of 4");
        } else {
            System.out.println("Angka tidak habis dibagi 2 atau 4");
        }
    }
}
