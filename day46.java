
package wiwiLestiani;

import java.util.Arrays;

public class day46 {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int elemenHapus = 30;

        int indeksHapus = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == elemenHapus) {
                indeksHapus = i;
                break;
            }
        }

        if (indeksHapus != -1) {
            int[] newData = new int[data.length - 1];
            System.arraycopy(data, 0, newData, 0, indeksHapus);
            System.arraycopy(data, indeksHapus + 1, newData, indeksHapus, data.length - indeksHapus - 1);
            System.out.println("Array setelah menghapus elemen " + elemenHapus + ": " + Arrays.toString(newData));
        } else {
            System.out.println("Elemen " + elemenHapus + " tidak ditemukan dalam array.");
        }
    }
}

