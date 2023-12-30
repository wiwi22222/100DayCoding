
package wiwiLestiani;

import java.util.Arrays;
import java.util.Scanner;

public class day82 {

    public static void main(String[] args) {
        int[][] data = new int [3][3];
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("masukkan angka ["+i+"]["+j+"]");
                data[i][j] = sc.nextInt();
                
            }
        }
        System.out.println("--------------");
        System.out.println(Arrays.deepToString(data));
            }
            
        }
    
    
