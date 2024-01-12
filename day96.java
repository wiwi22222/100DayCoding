package wiwiLestiani;

import java.util.Scanner;

public class day96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array Awal:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Masukkan indeks yang ingin diganti: ");
        int indeksPengganti = scanner.nextInt();

        System.out.print("Masukkan nilai pengganti: ");
        int nilaiPengganti = scanner.nextInt();

        array[indeksPengganti] = nilaiPengganti;

        System.out.println("Array Setelah Perubahan:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
