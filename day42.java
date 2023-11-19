
package wiwiLestiani;

import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan harga : ");
        
        double harga, diskon, m, total;
        harga = a.nextDouble();
        diskon = 10;//nilai diskon
        m = harga * diskon / 100;//rurmus diskon 
        total = harga - m;
        System.out.println("total " + total);
    }

}
    
