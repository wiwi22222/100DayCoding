
package wiwiLestiani;

import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata : ");
        String teks = scanner.nextLine();
        String teksTerbalik = "";

        for (int i = teks.length() - 1; i >= 0; i--) {
            teksTerbalik += teks.charAt(i);
        }

        System.out.println("Teks terbalik: " + teksTerbalik);

        scanner.close();
    }
}

    
