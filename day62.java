
package wiwiLestiani;

import java.util.Scanner;

public class day62 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah angka
        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();

        // Meminta pengguna untuk memasukkan angka-angka
        System.out.println("Masukkan angka-angka:");
        int[] angka = new int[jumlahAngka];
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        // Memanggil metode pengurutan (dalam contoh ini, menggunakan Bubble Sort)
        bubbleSort(angka);

        // Menampilkan hasil pengurutan
        System.out.println("\nHasil Pengurutan:");
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print(angka[i] + " ");
        }

        scanner.close();
    }

    // Metode Bubble Sort untuk mengurutkan array
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Menukar elemen jika tidak dalam urutan
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

