
package wiwiLestiani;
        
import java.util.Scanner;

public class day91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        // Memeriksa apakah bilangan Armstrong
        if (isArmstrong(bilangan)) {
            System.out.println(bilangan + " adalah bilangan Armstrong.");
        } else {
            System.out.println(bilangan + " bukan bilangan Armstrong.");
        }
    }

    // Metode untuk memeriksa apakah bilangan Armstrong
    private static boolean isArmstrong(int num) {
        int temp = num;
        int panjang = String.valueOf(num).length();
        int jumlah = 0;

        while (temp > 0) {
            int digit = temp % 10;
            jumlah += Math.pow(digit, panjang);
            temp /= 10;
        }

        return jumlah == num;
    }
}

