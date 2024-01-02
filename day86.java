
package wiwiLestiani;

import java.util.Arrays;

public class day86 {
    public static void main(String[] args) {

        // Array string dengan 20 nama buah
        String[] namaBuah = {
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grapes", "Honeydew", "Kiwi", "Lemon",
                "Mango", "Nectarine", "Orange", "Papaya", "Quince",
                "Raspberry", "Strawberry", "Tangerine", "Uva", "Watermelon"
        };

        // Menggunakan metode Arrays.sort untuk mengurutkan array
        Arrays.sort(namaBuah);

        // Menampilkan hasil pengurutan
        System.out.println("Dalam urutan abjad:");

        for (String buah : namaBuah) {
            System.out.println(buah);
        }
    }
}


    

