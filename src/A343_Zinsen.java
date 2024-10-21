import java.util.Scanner;

public class A343_Zinsen {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    // EINGABE:
        // take user input & initialize needed integer variables
        System.out.print("Wie viel Einzahlung: ");
        double einzahlung = sc.nextInt();

        System.out.print("Wie viele Zinsen: ");
        double zinsen = sc.nextInt();

        System.out.print("Wie viele Jahre: ");
        int jahre = sc.nextInt();


    // VERARBEITUNG:
        // calculate results
        double gesamt = einzahlung + (einzahlung * zinsen/100 * jahre);
        double basis = einzahlung * (1 + (zinsen / 100));
        double gesamtWithZinsen = Math.pow(basis, jahre);

    // AUSGABE:
        // print out calculated results
        System.out.println("Der Investor hat insgesamt " + gesamt + " Euro erhalten");
        System.out.println("Der Investor hat insgesamt " + gesamtWithZinsen + " Euro erhalten (mit Zinseszins)");

        // close scanners object stream (no more input from CL possible)
        sc.close();
    }
}
