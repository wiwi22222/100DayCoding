
package wiwiLestiani;

import java.util.Scanner;
        
public class day89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        double bilangan = scanner.nextDouble();

        // Menentukan akar bilangan
        if (bilangan >= 0) {
            double akar = Math.sqrt(bilangan);
            System.out.println("Akar dari " + bilangan + " adalah: " + akar);
        } else {
            System.out.println("Bilangan negatif tidak memiliki akar real.");
        }

        scanner.close();
    }
}


