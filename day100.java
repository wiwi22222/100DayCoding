package wiwiLestiani;

import java.util.Scanner;

public class day100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah hari coding: ");
        int jumlahHariCoding = scanner.nextInt();

        System.out.print("Masukkan jumlah commit: ");
        int jumlahCommit = scanner.nextInt();

        boolean lulus = cekLulusISC100DayCoding(jumlahHariCoding, jumlahCommit);

        if (lulus) {
            System.out.println("Selamat! Anda telah lulus ISC 100 day coding!");
        } else {
            System.out.println("Maaf, Anda belum lulus ISC 100 day coding. Terus semangat!");
        }
    }

    public static boolean cekLulusISC100DayCoding(int jumlahHariCoding, int jumlahCommit) {

        return (jumlahHariCoding >= 100) && (jumlahCommit <= 1);
    }
}
