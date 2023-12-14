
package wiwilestiani;

import java.util.Scanner;

public class day67 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilih,harga  = 0, porsi;
        System.out.println("menu makanan");
        System.out.println("1. nasi goreng\n2. mie ayam  ");
        System.out.print("Pilih : ");
        pilih = scanner.nextInt();
        switch(pilih){
            case 1:
                System.out.print("porsi : ");
                porsi = scanner.nextInt();
                System.out.println("nasi goreng(10k/porsi)");
                harga = 10000 * porsi;
                System.out.println("total : Rp. "+harga);
                break;
            case 2:
                System.out.print("porsi : ");
                porsi = scanner.nextInt();
                System.out.println("mie ayam(10k/porsi)");
                harga = 10500 * porsi;
                System.out.println("total : Rp. "+harga);
                break;
            default:
                System.out.print("pilihan salah");
                break;
        }
        System.out.println("");
    }
}
}
