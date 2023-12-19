
package wiwiLestiani;

import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Masukkan nama penumpang: ");
        String namaPenumpang = sc.nextLine();
        
        System.out.println("Masukkan jumlah tiket yang dipesan: ");
        int jumlahTiket = sc.nextInt();
        
        double hargaTiket = 180000;
        double totalBiaya = hargaTiket * jumlahTiket;
        double pajak = totalBiaya * 0.11;
        double totalBiayaPajak =totalBiaya + pajak;
        
        System.out.println("---------------------------------------");
        System.out.println("Rincian Pembelian Tiket");
        System.out.println("---------------------------------------");
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Jumlah Tiket : " + jumlahTiket);
        System.out.println("Harga Tiket : Rp. " + hargaTiket);
        System.out.println("Total Biaya : Rp. " + totalBiaya);
        System.out.println("Pajak (11%) : Rp. " + pajak);
        System.out.println("Total Biaya + Pajak : Rp. " + totalBiayaPajak);
        System.out.println("----------------------------------------");
    }
    
}

    