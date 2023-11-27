
package wiwiLestiani;

public class day50 {
    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10};
        int hasil = hitungTotal(data);
        System.out.println("Total nilai dalam array: " + hasil);
    }

    static int hitungTotal(int[] array) {
        int total = 0;
        for (int nilai : array) {
            total += nilai;
        }
        return total;
    }
}


