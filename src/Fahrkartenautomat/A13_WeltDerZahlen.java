package Fahrkartenautomat;

public class A13_WeltDerZahlen {

    public static void main(String[] args) {

        // Anzahl der Einwohner in Berlin
        int bewohnerBerlin = 3700000; // ca. 3.7 Millionen

        // Jahr, in dem der erste Computer gebaut wurde
        int ersterComputer = 1941;

        // Anzahl der Planeten im Sonnensystem
        int anzahlPlaneten = 8;

        // Anzahl der Sonnen (Sterne) in der Milchstraße (gerundete Schätzung)
        long sonnenMilchstrasse = 100_000_000_000L; // ca. 100 Milliarden

        // Gewicht des schwersten Tieres der Welt in kg
        int schwerstesTier = 200000; // ca. 200.000 kg für einen Blauwal

        // Fläche des kleinsten Landes der Erde in Quadratkilometern
        double flaecheKleinsteLand = 0.44; // Vatikanstadt: ca. 0,44 km²

        // Fläche der Erdoberfläche, die mit Wasser bedeckt ist, in Quadratkilometern
        int wasser = 361_000_000; // ca. 361 Millionen km²

        // Durchschnittliche Anzahl der Regentage pro Jahr in Waialeale, Hawaii
        int regen = 335;

        // Anzahl der Menschen auf der Erde
        long einwohnerErde = 8_000_000_000L; // ca. 8 Milliarden


        // Wie alt bist du? Wie viele Tage sind das?
        int alterJahre = 22;
        int alterTage = alterJahre * 365 + (alterJahre / 4); // ca. 9131 Tage (inklusive Schaltjahre)

        System.out.println("Bewohner von Berlin: " + bewohnerBerlin);
        System.out.println("Erste Computer gebaut: " + ersterComputer);
        System.out.println("Anzahl an Planeten: " + anzahlPlaneten);
        System.out.println("Sonnen in der Milchstraße: " + sonnenMilchstrasse);
        System.out.println("Schwerstes Tier: " + schwerstesTier);
        System.out.println("Fläche kleinste Land (km2): " + flaecheKleinsteLand);
        System.out.println("Wasser der Erde (km2): " + wasser);
        System.out.println("Regen in Waialeale (Tagen): " + regen);
        System.out.println("Einwoher auf der Erde: " + einwohnerErde);
        System.out.println("Alter in  Tagen: " + alterTage);

    }
}
