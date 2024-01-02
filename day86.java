
package wiwiLestiani;

import java.util.Arrays;

public class day86 {
    public static void main(String[] args) {
        String[] namaBuah = {
                "Banana", "Apple", "Cherry", "Date", "Kiwi",
                "Fig", "Lemon", "Honeydew", "Elderberry", "Grapes",
                "Watermelon", "Nectarine", "Strawberry", "Papaya", "Quince",
                "Raspberry", "Orange", "Tangerine", "Uva", "Mango"
        };

        Arrays.sort(namaBuah);

        System.out.println("Dalam urutan abjad:");

        for (String buah : namaBuah) {
            System.out.println(buah);
        }
    }
}


    

