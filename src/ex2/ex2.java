package ex2;
import java.util.Scanner;

class ex2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Numarul este : ");
        int numar, suma = 0; // Output user input
        numar = myObj.nextInt();
        String str = Integer.toString(numar);
        for (int l = 0; l < str.length(); l++) {
            suma = suma + numar % 10;
            numar/=10;

        }
        System.out.println(suma);
    }
}