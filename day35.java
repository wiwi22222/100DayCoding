
package wiwiLestiani;

import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();

        double akar = Math.sqrt(angka);
        System.out.println("Akar kuadrat: " + akar);

        scanner.close();
    }
}

    
