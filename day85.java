
package wiwiLestiani;

import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai X : ");
        int x = input.nextInt();
        
        System.out.print("Masukkan nilai Y : ");
        int y = input.nextInt();
        
        swapValues(x, y);
    }

    public static void swapValues(int a, int b) {
        System.out.println("Sebelum pertukaran:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        
        // Proses pertukaran nilai
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Setelah pertukaran:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }
}

    

