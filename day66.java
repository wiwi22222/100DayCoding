
package wiwiLestiani;

import java.util.Scanner;

public class day66 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();

        boolean[] statusMahasiswa = new boolean[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Apakah Mahasiswa ke-" + (i + 1) + " lulus? (true/false): ");
            statusMahasiswa[i] = scanner.nextBoolean();
        }
        int lulus = 0;
        for(boolean status : statusMahasiswa){
            if(status){
                lulus++;
            }
        }
        System.out.println("Jumlah Mahasiswa yang lulus: "+ lulus);
    }

}
