
package wiwiLestiani;

import java.util.Random;
import java.util.Scanner;

public class day57 {
    
    private static String[] daftarKata = {"programming", "java", "computer", "algorithm", "code"};

    public static void main(String[] args) {
        Random random = new Random();
        String kataTertebak = daftarKata[random.nextInt(daftarKata.length)];
        char[] tebakanBenar = new char[kataTertebak.length()];
        for (int i = 0; i < tebakanBenar.length; i++) {
            tebakanBenar[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);

        int kesempatan = 6;
        boolean kataTertebakBelumSelesai = true;

        System.out.println("Selamat datang di Permainan Tebakan Kata!");
        System.out.println("Mulai menebak...");

        while (kataTertebakBelumSelesai && kesempatan > 0) {
            System.out.println("Kata: " + String.valueOf(tebakanBenar));
            System.out.println("Kesempatan Tersisa: " + kesempatan);
            System.out.print("Masukkan huruf tebakan: ");
            char tebakan = scanner.next().charAt(0);

            if (kataTertebak.indexOf(tebakan) == -1) {
                System.out.println("Huruf " + tebakan + " tidak ada dalam kata.");
                kesempatan--;
            } else {
                for (int i = 0; i < kataTertebak.length(); i++) {
                    if (kataTertebak.charAt(i) == tebakan) {
                        tebakanBenar[i] = tebakan;
                    }
                }

                if (String.valueOf(tebakanBenar).equals(kataTertebak)) {
                    kataTertebakBelumSelesai = false;
                    System.out.println("Selamat! Anda berhasil menebak kata: " + kataTertebak);
                }
            }
        }

        if (kesempatan == 0 && kataTertebakBelumSelesai) {
            System.out.println("Maaf, Anda kehabisan kesempatan. Kata yang benar adalah: " + kataTertebak);
        }

        scanner.close();
    }
}

