
package wiwiLestiani;

import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan angka: ");
            int input = scanner.nextInt();

            if (input % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("You and I, end");
                break;
            }
        }
    }
}

    

