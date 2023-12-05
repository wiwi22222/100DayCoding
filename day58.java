
package wiwiLestiani;

import java.util.Scanner;

public class day58 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata atau frasa: ");
        String input = scanner.nextLine();

        System.out.print("Masukkan karakter yang ingin dicari: ");
        char targetChar = scanner.next().charAt(0);

        int count = countOccurrences(input, targetChar);

        System.out.println("Jumlah kemunculan karakter '" + targetChar + "': " + count);

        scanner.close();
    }

    static int countOccurrences(String str, char target) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }
}


