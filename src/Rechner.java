import java.util.Scanner;

public class Rechner {
    public static void main(String[] args)
    {
        // declaration of 3 int variables
        int zahl1;
        int zahl2;
        int ergebnis;
        int differenz;
        int produkt;
        int quotient;
        int rest;


        // create object tastatur of type Scanner
        Scanner tastatur = new Scanner(System.in);


    // EINGABE:

        // ask user for input
        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");

        // init int value from user into zahl1 variable
        zahl1 = tastatur.nextInt();

        // ask user for input again
        System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");

        // init int value from user into zahl2 variable
        zahl2 = tastatur.nextInt();


    // VERARBEITUNG:

        // calculate sum of both integers
        ergebnis = zahl1 + zahl2;
        differenz = zahl1 - zahl2;
        quotient = zahl1 / zahl2;
        produkt = zahl1 * zahl2;
        rest = zahl1 % zahl2;


    // AUSGABE

        // Print out a newline
        System.out.println();

        // print out literal Summe: and the calculated sum variable
        System.out.println("Summe: " + ergebnis);
        System.out.println("Differenz: " + differenz);
        System.out.println("Produkt: " + produkt);
        System.out.println("Quotient: " + quotient);
        System.out.println("Rest: " + rest);


        // close stream from tastatur (no more input possible)
        tastatur.close();
    }
}
