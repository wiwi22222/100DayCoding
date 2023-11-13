
package wiwiLestiani;

import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        if (angka1 > angka2) {
            System.out.println(angka1 + " lebih besar.");
        } else if (angka2 > angka1) {
            System.out.println(angka2 + " lebih besar.");
        } else {
            System.out.println("Kedua angka sama besar.");
        }

        scanner.close();
    }
}

    
