import java.util.Scanner;
public class A344_Wechselstube {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    // EINGABE:
        // ask for user input & initialize needed variables
        System.out.print("Wie viel Euro haben Sie? ");
        int euro = sc.nextInt();

        System.out.print("Wie viel Cent haben Sie? ");
        int cent = sc.nextInt();

    // VERARBEITUNG:
        // calculate result for how many of each coins are present
        // I use a tmp (temporary) variable, to save the amount of originally calculated 'centGesamt'
        int centGesamt = euro * 100 + cent;
        int tmp = centGesamt;
        int amount2euro = (tmp / 100) / 2;

        tmp -= amount2euro * 2 * 100;
        int amount1euro = tmp / 100;

        tmp -= amount1euro * 100;
        int amount50cent = tmp / 50;

        tmp -= amount50cent * 50;
        int amount20cent = tmp / 20;

        tmp -= amount20cent * 20;
        int amount10cent = tmp / 10;

        tmp -= amount10cent * 10;
        int amount5cent = tmp / 5;

        tmp -= amount5cent * 5;
        int amount2cent = tmp / 2;

        tmp -= amount2cent * 2;
        int amount1cent = tmp;

    // AUSGABE:
        // print the results
        System.out.println("Sie bekommen "+ centGesamt + " Cent als:");
        System.out.println(amount2euro + " 2-Euro-Muenzen");
        System.out.println(amount1euro + " 1-Euro-Muenzen");
        System.out.println(amount50cent + " 50-Cent-Muenzen");
        System.out.println(amount20cent + " 20-Cent-Muenzen");
        System.out.println(amount10cent + " 10-Cent-Muenzen");
        System.out.println(amount5cent + " 5-Cent-Muenzen");
        System.out.println(amount2cent + " 2-Cent-Muenzen");
        System.out.println(amount1cent + " 1-Cent-Muenzen");

        // close scanners object stream (no more input from CL possible)
        sc.close();
    }
}
