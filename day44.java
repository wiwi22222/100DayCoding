
package wiwiLestiani;

 import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        double total = 0;

        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("Masukkan data ke-" + i + ": ");
            double data = scanner.nextDouble();
            total += data;
        }

        double rataRata = total / jumlahData;
        System.out.println("Rata-rata: " + rataRata);

        scanner.close();
    }
}

    
