import java.util.Scanner;
public class A342_Spielbank {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    // EINGABE:
        // get user input & initialize needed integer variables
        System.out.print("Anzahl an 5 Euro Chips: ");
        int chip5 = sc.nextInt();

        System.out.print("Anzahl an 10 Euro Chips: ");
        int chip10 = sc.nextInt();

        System.out.print("Anzahl an 20 Euro Chips: ");
        int chip20 = sc.nextInt();

        System.out.print("Anzahl an 50 Euro Chips: ");
        int chip50 = sc.nextInt();

        System.out.print("Anzahl an 100 Euro Chips: ");
        int chip100 = sc.nextInt();

    // VERARBEITUNG:
        // calculate result
        int ergebnis = chip5 * 5 + chip10 * 10 + chip20 * 20 + chip50 * 50 + chip100 * 100;

    // AUSGABE:
        // print calculated result
        System.out.println("Ihr Auszahlungsbetrag beträgt: " + ergebnis + " Euro.");

        // close scanners object stream (no more input from CL possible)
        sc.close();
    }
}
