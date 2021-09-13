package no.oslomet.cs.algdat.Oblig1;

// Midlertidig main-metode for å sjekke at metodene skriver ut ønsket resultat.

import static no.oslomet.cs.algdat.Oblig1.Oblig1.*;

public class MidlertidigMainTest {

    public static void main(String[] args) {
        // Oppgave 2 og 3
        int [] tabellOppg2 = {5, 3, 7, 4, 3, 5, 7, 8, 6, 7};

        int ulikeTall = antallUlikeSortert(tabellOppg2);
        System.out.println("Det er " + ulikeTall + " ulike tall i tabellen.");

        char [] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        rotasjon(a);

        // Oppgave 7
        String a = flett("ABC","DEFGH");
        String b = flett("IJKLMN","OPQ");
        String b = flett("","AB");
        System.out.println(a + " " + b + " " + c);
// Utskrift: ADBECFGH IOJPKQLMN AB
    }
}
