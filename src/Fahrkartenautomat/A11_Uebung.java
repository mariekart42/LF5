package Fahrkartenautomat;

public class A11_Uebung {

    static byte hehe = 4;
    public static void main(String[] args)
    {

        // Uebung 1
        int cent;
        cent = 70;
        cent = 80;
        System.out.println(cent);

        double maximum;
        maximum = 95.50;
        System.out.println(maximum);


        // Uebung 2
        // bool [true, false]
        boolean x1 = true;

        // short [-32768 bis 32767]
        short x2 = -1000;

        // float
        float x3 = 1.255F;

        // char
        char x4 = '#';

        // byte [-128 bis 127]
        byte x5 = 8;

        // long [-9.223.372.036.854.775.808 bis 9223372036854775807]
        long x6 = 2147483648L;


        // Uebung 3
        String lol = "Ich bin Brot";
        System.out.println(lol);

        final int check_nr = 8765;
        System.out.println(check_nr);


        // Uebung 4
        // Eindeutigkeit, RAM sinnvoller nutzen durch nicht zu grosse allocierung von Speicherplatz fuer grosse Variable typen


        // Uebung 5
        int ergebnis = 4 + 8 * 9 - 1;
        System.out.println(ergebnis);

        byte zaehler = 1;
        zaehler++;
        System.out.println(zaehler);

        float div = 22F / 6;
        System.out.println(div);

        // a++ und ++a fuehrt zu den selben ergebnissen, allerdings wird bei a++ erst das a zu einer variable zugewiesen, bei ++a wird a erst incrementiert und dann einer variablen zugewiesen


        /*
          && Operator
        false && false >> false
        false && true >> false
        true && false >> false
        true && true >> true

         || Operator
        false || false >> false
        false || true >> true
        true || false >> true
        true || true >> true
        */

        byte flip = 10;
        if (flip > 7 && flip < 12)
            System.out.println(flip);
        if (flip != 10 || flip == 12)
            System.out.println(flip);

        String lol1 = "Meine Oma ";
        String lol2 = "fährt im ";
        String lol3 = "Hühnerstall Motorrad.";
        String final_lol = lol1 + lol2 + lol3;

    }

}
