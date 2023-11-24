//Membuat Array dari Deret Fibonacci:
package wiwiLestiani;

import java.util.Arrays;

public class day47 {
    public static void main(String[] args) {
        int panjangArray = 10;
        int[] fibonacci = new int[panjangArray];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < panjangArray; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Array deret Fibonacci: " + Arrays.toString(fibonacci));
    }
}
