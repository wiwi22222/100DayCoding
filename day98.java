
package wiwiLestiani;
        
import java.util.Scanner;

public class day98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = scanner.nextInt();
        
        System.out.print("Masukkan tarif per jam: ");
        double tarifPerJam = scanner.nextDouble();

        double gaji = hitungGaji(jamKerja, tarifPerJam);

        System.out.println("Gaji karyawan adalah: $" + gaji);
    }

    public static double hitungGaji(int jamKerja, double tarifPerJam) {
        double gaji = jamKerja * tarifPerJam;

        if (jamKerja > 40) {
            gaji += (jamKerja - 40) * (tarifPerJam * 0.5);
        }

        return gaji;
    }
}

    
