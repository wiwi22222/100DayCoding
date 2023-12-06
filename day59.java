
package wiwiLestiani;

import java.util.Scanner;

public class day59 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input informasi buku dari pengguna
        System.out.print("Masukkan nama buku: ");
        String namaBuku = scanner.nextLine();

        System.out.print("Masukkan nama pengarang: ");
        String pengarang = scanner.nextLine();

        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();

        System.out.print("Masukkan jumlah halaman: ");
        int jumlahHalaman = scanner.nextInt();

        // Membuat objek buku
        Buku buku = new Buku(namaBuku, pengarang, tahunTerbit, jumlahHalaman);

        // Menampilkan informasi buku
        System.out.println("\nInformasi Buku:");
        System.out.println(buku);

        // Menampilkan rata-rata jumlah halaman buku
        double rataRataHalaman = hitungRataRataHalaman(buku);
        System.out.println("\nRata-rata Jumlah Halaman Buku: " + rataRataHalaman);

        scanner.close();
    }

    // Metode untuk menghitung rata-rata jumlah halaman buku
    static double hitungRataRataHalaman(Buku buku) {
        return buku.getJumlahHalaman();
    }
}

class Buku {
    private String namaBuku;
    private String pengarang;
    private int tahunTerbit;
    private int jumlahHalaman;

    public Buku(String namaBuku, String pengarang, int tahunTerbit, int jumlahHalaman) {
        this.namaBuku = namaBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String toString() {
        return "Nama Buku: " + namaBuku +
               "\nPengarang: " + pengarang +
               "\nTahun Terbit: " + tahunTerbit +
               "\nJumlah Halaman: " + jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
}

