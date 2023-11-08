
package wiwiLestiani;

public class day31 {
    public static void main(String[] args) {
        int[][] array2D = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array2D[i][j] = i * 2 + j + 1;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
   

