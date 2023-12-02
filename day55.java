//menetukan hari esok
package wiwiLestiani;

import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan hari (1-7): ");
        int hari = input.nextInt();

        String hariIni = getNamaHari(hari);
        String hariEsok = getNamaHari((hari % 7) + 1);

        System.out.println("Hari ini: " + hariIni);
        System.out.println("Hari esok: " + hariEsok);

        input.close();
    }

    static String getNamaHari(int nomorHari) {
        String[] namaHari = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        if (nomorHari >= 1 && nomorHari <= 7) {
            return namaHari[nomorHari - 1];
        } else {
            return "Invalid";
        }
    }
}

