
package wiwiLestiani;

import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji bulanan: ");
        int gaji = input.nextInt();

        // Menggunakan perbandingan sederhana untuk menentukan besaran pajak
        if (gaji >= 3000000) {
            double pajak = gaji * 0.05;
            double gajiBersih = gaji - pajak;

            System.out.println("Anda dikenakan pajak 5%");
            System.out.println("Pajak yang dibayarkan: " + pajak);
            System.out.println("Gaji bersih anda: " + gajiBersih);
        } else {
            System.out.println("Tidak dikenakan pajak.");
            System.out.println("Gaji bersih anda: " + gaji);
        }

        input.close();
    }
}
 

