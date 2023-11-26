//Menggabungkan Dua Array dengan Metode System.arraycopy
package wiwiLestiani;

import java.util.Arrays;

public class day49 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] gabungan = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, gabungan, 0, array1.length);
        System.arraycopy(array2, 0, gabungan, array1.length, array2.length);

        System.out.println("Array setelah digabungkan: " + Arrays.toString(gabungan));
    }
}

    

