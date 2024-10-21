import java.util.Scanner;

public class A341_Rechteck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    // EINGABE:
        // ask user for input & initialize needed integer variables
        System.out.print("Gib eine Laenge einer Seite deines Rechtecks ein: ");
        int len1 = sc.nextInt();

        System.out.print("Gib die zweite Laenge einer Seite deines Rechtecks ein: ");
        int len2 = sc.nextInt();

    // VERARBEITUNG:
        // calculate the 'umfang' and 'flaeche' variables
        int umfang = 2 * len1 + 2 * len2;
        int flaeche = len1 * len2;

    // AUSGABE:
        // print the calculatet results
        System.out.println("SeiteA (in cm): " + len1);
        System.out.println("SeiteB (in cm): " + len2);
        System.out.println("Umfang = " + umfang + " cm");
        System.out.println("Flaeche = " + flaeche + " cm^2");

        // close scanners object stream (no more input from CL possible)
        sc.close();
    }
}
