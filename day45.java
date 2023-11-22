
package wiwiLestiani;

import java.util.Arrays;

public class day45 {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] jumlahKolom = new int[matriks[0].length];

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                jumlahKolom[j] += matriks[i][j];
            }
        }

        System.out.println("Jumlah setiap kolom matriks: " + Arrays.toString(jumlahKolom));
    }
}


