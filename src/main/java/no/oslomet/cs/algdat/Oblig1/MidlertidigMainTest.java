package no.oslomet.cs.algdat.Oblig1;

// Midlertidig main-metode for å sjekke at metodene skriver ut ønsket resultat.

import java.util.Arrays;

import static no.oslomet.cs.algdat.Oblig1.Oblig1.*;

public class MidlertidigMainTest {

    public static void main(String[] args) {

        /*
        // Oppgave 2 og 3
        int [] array = {5, 3, 7, 4, 3, 5, 7, 8, 6, 7};

        int ulikeTall = antallUlikeSortert(array);
        System.out.println("Det er " + ulikeTall + " ulike tall i tabellen.");

        // Oppgave 5
        char [] n = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        rotasjon(n);
         */

        /*
        //Oppgave 7
        String a = flett("ABC","DEFGH");
        String b = flett("IJKLMN","OPQ");
        String c = flett("","AB");
        System.out.println(a + " " + b + " " + c);
        // Utskrift: ADBECFGH IOJPKQLMN AB

        String e = flett("AM ","L","GEDS","ORATKRR","","R TRTE","IO","TGAUU");
        System.out.println(e);
        // Utskrift: ALGORITMER OG DATASTRUKTURER
         */

        // Oppgave 8
        int[] a = {6,10,16,11,7,12,3,9,8,5};
        int[] indeks = indekssortering(a);
        System.out.println(Arrays.toString(a)); // skriver ut a
        System.out.println(Arrays.toString(indeks)); // skriver ut indeks

        // Utskrift: [6, 10, 16, 11, 7, 12, 3, 9, 8, 5] a er ikke endret
        // Utskrift: [6, 9, 0, 4, 8, 7, 1, 3, 5, 2]

        int[] indeks_verdi = indekssortering(a);
        for (int i = 0; i < a.length; i++) System.out.print(a[indeks_verdi[i]] + " ");
        // Utskrift: 3 5 6 7 8 9 10 11 12 16

    }
}
