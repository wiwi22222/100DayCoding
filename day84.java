
package wiwiLestiani;

public class day84 {
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'd', 'e'};
        char[] array2 = {'f', 'g', 'h', 'i', 'j'};
        
        int panjang = array1.length + array2.length;
        char[] arrayGabungan = new char[panjang];

        for (int i = 0; i < array1.length; i++) {
            arrayGabungan[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arrayGabungan[array1.length + i] = array2[i];
        }
        
        System.out.print("Array Gabungan: ");
        for (int i = 0; i < arrayGabungan.length; i++) {
            System.out.print(arrayGabungan[i] + " ");
        }
    }
}

    

