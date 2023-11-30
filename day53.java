
package wiwiLestiani;
        
import java.util.Scanner;

public class day53 {
    static double saldo = 1000; // Saldo awal

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    tarikTunai();
                    break;
                case 3:
                    setorTunai();
                    break;
                case 4:
                    System.out.println("Terima kasih. Anda telah keluar.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    static void cekSaldo() {
        System.out.println("Saldo Anda: " + saldo);
    }

    static void tarikTunai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah penarikan: ");
        double jumlah = scanner.nextDouble();

        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + saldo);
        }
    }

    static void setorTunai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah setoran: ");
        double jumlah = scanner.nextDouble();

        saldo += jumlah;
        System.out.println("Setoran berhasil. Saldo Anda sekarang: " + saldo);
    }
}

