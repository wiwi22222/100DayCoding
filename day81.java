
package wiwiLestiani;

public class day81 {
    public static void main(String[] args) {
        int[] nomor = {5, -2, 9, 3, -4, 7, 11};
        
        double rataRata = hitungRataRataPositif(nomor);
        
        if (Double.isNaN(rataRata)) {
            System.out.println("Tidak ada angka positif dalam array.");
        } else {
            System.out.println("Rata-rata angka positif dalam array adalah: " + rataRata);
        }
    }
    
    public static double hitungRataRataPositif(int[] arr) {
        int jumlah = 0;
        int jumlahAngkaPositif = 0;
    
        for (int angka : arr) {
            if (angka > 0) {
                jumlah += angka;
                jumlahAngkaPositif++;
            }
        }
    
        return (jumlahAngkaPositif == 0) ? Double.NaN : (double) jumlah / jumlahAngkaPositif;
    }
}

    

