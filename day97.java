
package wiwiLestiani;

import java.util.Scanner;

public class day97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the year
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();

        // Determine if it's a leap year
        int[] jumlahHari = {31, (tahun % 4 == 0 && (tahun % 100 != 0 || tahun % 400 == 0)) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        int totalHari = 0;

        for (int i = 0; i < jumlahHari.length; i++) {
            totalHari += jumlahHari[i];
            System.out.println(namaBulan[i] + " memiliki " + jumlahHari[i] + " hari.");
        }

        System.out.println("Jumlah hari dalam tahun " + tahun + " adalah " + totalHari + " hari.");
      }
     }
        