
package wiwilestiani;

import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double modal, tahun, inves = 0;
        System.out.print("Masukkan modal awal.    : ");
        modal = scanner.nextDouble();
        System.out.print("lama investasi (/tahun) : ");
        tahun = scanner.nextInt();
        for (int i = 1; i <= tahun; i++) {
            inves = modal * 0.05;
            modal += inves;

            System.out.println("investasi tahun ke " + i + " : Rp " + modal);
        }
        System.out.println("================================");
        System.out.print("total investasi " + " tahun " + " : Rp " + modal);
    }
}


