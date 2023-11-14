
package wiwiLestiani;
        
import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan alas : ");
        int alas = scanner.nextInt();

        System.out.print("masukkan tinggi ");
        int tinggi = scanner.nextInt();

        int hasil = alas * tinggi;
        int hasil2 = hasil * 1 / 2;

        System.out.println("maka hasilnya " + hasil2);
    }
}
