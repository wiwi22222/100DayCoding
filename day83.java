
package wiwiLestiani;

import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nomor bulan (1-12): ");
        int nomorBulan = scanner.nextInt();

        String musim;

        switch (nomorBulan) {
            case 12:
            case 1:
            case 2:
                musim = "Musim Dingin";
               
            case 3:
            case 4:
            case 5:
                musim = "Musim Semi";
                break;
            case 6:
            case 7:
            case 8:
                musim = "Musim Panas";
                break;
            case 9:
            case 10:
            case 11:
                musim = "Musim Gugur";
                break;
            default:
                musim = "Bulan tidak valid";
                break;
        }

        System.out.println("Bulan ke-" + nomorBulan + " terjadi pada musim " + musim);

    }
    
}
    

