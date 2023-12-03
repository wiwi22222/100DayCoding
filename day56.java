
package wiwiLestiani;

import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        boolean prima = true;

        if (bilangan <= 1) {
            prima = false;
        } else {
            for (int i = 2; i <= bilangan / 2; i++) {
                if (bilangan % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        input.close();
    }
}


