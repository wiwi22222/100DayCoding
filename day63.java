
package wiwilestiani;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.print("Masukkan jumlah elemen set pertama: ");
        int size1 = scanner.nextInt();
        System.out.println("Masukkan elemen set pertama:");
        inputSetElements(scanner, set1, size1);

        System.out.print("Masukkan jumlah elemen set kedua: ");
        int size2 = scanner.nextInt();
        System.out.println("Masukkan elemen set kedua:");
        inputSetElements(scanner, set2, size2);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Himpunan Gabungan: " + union);
        System.out.println("Himpunan Irisan: " + intersection);

        scanner.close();
    }

    // Method untuk memasukkan elemen-elemen ke dalam set
    public static void inputSetElements(Scanner scanner, Set<Integer> set, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            set.add(scanner.nextInt());
        }
    }
}


