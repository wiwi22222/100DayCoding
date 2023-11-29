
package wiwiLestiani;

public class day52 {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transpose = new int[matriks[0].length][matriks.length];

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }

        System.out.println("Matriks Asli:");
        tampilkanMatriks(matriks);
        System.out.println("Matriks Transpose:");
        tampilkanMatriks(transpose);
    }

    static void tampilkanMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}


