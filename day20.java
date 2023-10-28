package wiwilestiani;

import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menggunakan Scanner untuk mengambil input penghasilan
        System.out.print("Masukkan penghasilan bulanan Anda: ");
        double penghasilan = scanner.nextDouble();

        // Inisialisasi variabel pajak
        double pajak = 0;

        // Memeriksa kondisi pajak
        if (penghasilan >= 5000000) {
            pajak = 0.10;  // 10% pajak
        } else if (penghasilan >= 3000000) {
            pajak = 0.05;  // 5% pajak
        }

        // Menghitung penghasilan bersih
        double penghasilanBersih = penghasilan - (penghasilan * pajak);

        // Menampilkan hasil
        System.out.println("Penghasilan bersih Anda per bulan adalah: " + penghasilanBersih);

        // Menutup Scanner
        scanner.close();
    }
}
