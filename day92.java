
package wiwiLestiani;

import java.util.Scanner;

public class day92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Desimal ke Romawi");
        System.out.println("2. Romawi ke Desimal");

        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan bilangan desimal: ");
            int desimal = scanner.nextInt();
            String romawi = konversiDesimalKeRomawi(desimal);
            System.out.println("Hasil konversi: " + romawi);
        } else if (pilihan == 2) {
            scanner.nextLine(); 
            System.out.print("Masukkan bilangan Romawi: ");
            String romawi = scanner.nextLine();
            int desimal = konversiRomawiKeDesimal(romawi);
            System.out.println("Hasil konversi: " + desimal);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    private static String konversiDesimalKeRomawi(int desimal) {
        String[] simbol = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] nilai = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder hasil = new StringBuilder();
        int indeks = nilai.length - 1;

        while (desimal > 0) {
            if (desimal >= nilai[indeks]) {
                hasil.append(simbol[indeks]);
                desimal -= nilai[indeks];
            } else {
                indeks--;
            }
        }

        return hasil.toString();
    }

    private static int konversiRomawiKeDesimal(String romawi) {
        int hasil = 0;

        for (int i = 0; i < romawi.length(); i++) {
            int nilai1 = nilaiRomawi(romawi.charAt(i));

            if (i + 1 < romawi.length()) {
                int nilai2 = nilaiRomawi(romawi.charAt(i + 1));

                if (nilai1 >= nilai2) {
                    hasil += nilai1;
                } else {
                    hasil += nilai2 - nilai1;
                    i++;
                }
            } else {
                hasil += nilai1;
                i++;
            }
        }

        return hasil;
    }

    private static int nilaiRomawi(char karakter) {
        switch (karakter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

    
