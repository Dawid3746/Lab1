package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {
    /**
     * Funkcja main
     *
     * @param args argumenty funkcji main
     */
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int x, y;
        do {
            System.out.print("Podaj liczbe: ");
            x = inp.nextInt();
            if (x == 0) break;

            System.out.printf("dec=%s\nhex=%s\nbin=%s \n".toUpperCase(),
                    x,
                    leftPad(Integer.toHexString(x), '0', 4),
                    leftPad(Integer.toBinaryString(x), '0', 4));

        } while (true);


    }

    public static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i < aWidth; i += 1) {
            res = aChar + res;
        }

        return res;
    }
}