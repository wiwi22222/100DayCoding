
package wiwiLestiani;

import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Harga: ");
        double harga, diskon, m, total;
        harga = scanner.nextDouble();
        diskon = 10;
        m = harga * diskon / 100;
        total = harga - m;
        System.out.println("Total " + total);
    }

}
    

