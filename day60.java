
package wiwiLestiani;

import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input informasi mahasiswa dari pengguna
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan jurusan: ");
        String jurusan = scanner.nextLine();

        System.out.print("Masukkan IPK: ");
        double ipk = scanner.nextDouble();

        // Membuat objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa, nim, jurusan, ipk);

        // Menampilkan informasi mahasiswa
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println(mahasiswa);

        scanner.close();
    }
}

class Mahasiswa {
    private String namaMahasiswa;
    private String nim;
    private String jurusan;
    private double ipk;

    public Mahasiswa(String namaMahasiswa, String nim, String jurusan, double ipk) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public String toString() {
        return "Nama Mahasiswa: " + namaMahasiswa +
               "\nNIM: " + nim +
               "\nJurusan: " + jurusan +
               "\nIPK: " + ipk;
    }
}

