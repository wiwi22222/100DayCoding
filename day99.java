
package wiwiLestiani;
        
import java.util.Scanner;

public class day99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        System.out.print("Masukkan harga per barang: $");
        double hargaPerBarang = scanner.nextDouble();
        double totalHarga = hitungTotalHarga(jumlahBarang, hargaPerBarang);

        System.out.println("Total harga sebelum diskon: $" + totalHarga);
        double diskon = hitungDiskon(totalHarga);
        double totalHargaSetelahDiskon = totalHarga - diskon;

        System.out.println("Diskon: $" + diskon);
        System.out.println("Total harga setelah diskon: $" + totalHargaSetelahDiskon);
    }

    public static double hitungTotalHarga(int jumlahBarang, double hargaPerBarang) {
        return jumlahBarang * hargaPerBarang;
    }

    public static double hitungDiskon(double totalHarga) {
        if (totalHarga > 100) {
            return totalHarga * 0.1;
        } else {
            return 0;
        }
    }
}

    

