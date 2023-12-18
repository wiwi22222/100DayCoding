package wiwiLestiani;

import java.util.Arrays;

public class day71 {
    public static void main(String[] args) {
        boolean[] Array = new boolean[10];
        for (int i = 0; i < Array.length; i++) {
            if (i % 2 == 0) {
                Array[i] = true;
            } else {
                Array[i] = false;
            }
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.println("indeks" + i + ":" + Array[i]);
        }
    }
}
