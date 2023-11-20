
package wiwiLestiani;
        
import java.util.Scanner;

public class day43 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan nilai awal:");
        int awal = input.nextInt();
        
        System.out.println("masukkan nilai akhir:");
        int akhir = input.nextInt();
      
        int genap=0;
        int ganjil=0;
        
        for (int i = awal; i <= akhir; i++) {
            if (i%2==0) {
                genap+=1;
                
            } else {
                ganjil+=1;
                
            }
        }
        System.out.println("jumlah Genap: " + genap);
        System.out.println("jumlah ganjil:" + ganjil);
    }

    }
