
package wiwiLestiani;

public class day79 {
    public static void main(String[] args) {
        int[] nilai = {57, 48, 75,30, 88, 98, 56, 93, 200, 68, 85, 91, 65,111};
        int lulus = 0; 
        int tidakLulus = 0;
        int invalid = 0;
           for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 70 && nilai[i]<= 100) {
                lulus++;
            } else if(nilai[i] >= 0 && nilai[i] < 70){
                tidakLulus++;
            }else{
               invalid++;
            }
        }
        System.out.println("Jumlah Lulus: " + lulus);
        System.out.println("Jumlah Tidak Lulus: " + tidakLulus);
        System.out.println("Jumlah nilai tidak valid: " + invalid);
    }
    
}
    

