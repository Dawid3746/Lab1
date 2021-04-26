package pl.lublin.wsei.java.cwiczenia;

public class Main {
    /**
     * Funkcja main
     * @param args argumenty funkcji main
     */
    public static void main(String[] args){

        int a = 2;
        double b = 3.14;
        String s = " przykładowy tekst";

        System.out.printf("a = %d, b = %.2f, s=%20s %n",a,b,s);

        System.out.println("Nazywaliśmy to \"Witamina B3\"");

        System.out.println("\nalfa\tsin(alfa)");
        for (int i =0; i < 370; i += 10){
            System.out.printf("%d\t%f\n", i, Math.sin(i/360.0*2*Math.PI));
        }


    }
}