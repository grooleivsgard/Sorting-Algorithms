package no.oslomet.cs.algdat.Oblig1;

// Midlertidig main-metode for å sjekke at metodene skriver ut ønsket resultat.

import static no.oslomet.cs.algdat.Oblig1.Oblig1.antallUlikeSortert;

public class MidlertidigMainTest {

    public static void main(String[] args) {
        int [] tabellOppg2 = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};

        int ulikeTall = antallUlikeSortert(tabellOppg2);
        System.out.println("Det er " + ulikeTall + " ulike tall i tabellen.");
    }
}
