
package wiwiLestiani;

import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print (
    "Masukkan suhu dalam Celsius: ");
        double suhuCelsius = scanner.nextDouble();
    double suhuKelvin = suhuCelsius + 273.15;
    System.out.println ("Suhu dalam Kelvin: " + suhuKelvin);
    
}
} 

