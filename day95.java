
package wiwiLestiani;
        
import java.util.Scanner;

public class day95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Alfamart!");
        System.out.println("Masukkan nama Anda : ");
        String namaPelanggan = input.nextLine();

        System.out.println("\nDftar barang : ");
        System.out.println("1. popok bayi - Rp. 70,000");
        System.out.println("2. susu sgm - Rp. 65,000");
        System.out.println("3. Mie instan - Rp. 10,000");
        System.out.println("4. Beras 10kg - Rp. 130,000");

        System.out.println("\nSilahkan masukkan pilihan  belanja Anda (1-4), atau 0 untuk selesai : ");

        int totalHarga = 0;

        while (true) {
            System.out.println("Pilihan barang (0 untuk selesai) : ");
            int pilihan = input.nextInt();

            if (pilihan == 0) {
                break;
            }
            int hargaBarang = 0;
            String namaBarang = " ";

            switch (pilihan) {
                case 1:
                    namaBarang = "popok bayi";
                    hargaBarang = 70000;
                    break;
                case 2:
                    namaBarang = "susu sgm";
                    hargaBarang = 65000;
                    break;
                case 3:
                    namaBarang = "Mie instan";
                    hargaBarang = 10000;
                    break;
                case 4:
                    namaBarang = "Beras 10kg";
                    hargaBarang = 130000;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih yang lain lagi.");
                    continue;
            }

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahBarang = input.nextInt();

            int subtotal = hargaBarang * jumlahBarang;
            totalHarga += subtotal;

            System.out.println(namaBarang + " x " + jumlahBarang + " = Rp. " + subtotal);

        }
        System.out.println("\nTerima kasih, " + namaPelanggan + "!");
        System.out.println("Total belanja Anda : Rp. " + totalHarga);
    }

}
    

