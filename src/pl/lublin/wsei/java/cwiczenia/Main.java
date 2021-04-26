package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {
    /**
     * Funkcja main
     *
     * @param args argumenty funkcji main
     */
    public static void main(String[] args) {

        int a = 2;
        double b = 3.14;
        String s = " przykładowy tekst";

        System.out.printf("a = %d, b = %.2f, s=%20s %n", a, b, s);

        System.out.println("Nazywaliśmy to \"Witamina B3\"");

        System.out.println("\nalfa\tsin(alfa)");
        for (int i = 0; i < 370; i += 10) {
            System.out.printf("%d\t%f\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        }

        int sum = 0;
        System.out.println("\narg\tlog2(arg)\tsum(arg)");
        for (int i = 1; i < 32; i *= 2) {
            sum += i;
            System.out.printf("%d\t%.2f\t\t%d\n", i, (Math.log(i) / Math.log(2)), sum);
        }

        Scanner inp = new Scanner(System.in);
        int x, y;
        do {
            System.out.print("Podaj pierwsza liczbe: ");
            x = inp.nextInt();
            if (x == 0) break;
            System.out.print("Podaj druga liczbe: ");
            y = inp.nextInt();
            if (y == 0) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", x, y, x + y);
        } while (true);

    }
}