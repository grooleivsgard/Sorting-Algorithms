package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}


    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        if(a.length <= 0){
            throw new NoSuchElementException();
        }
        //Bruker en for-løkke, som vist i forelesning for Bubble Sort 07.09.2021

        // (1) Løkken sorterer ett tall per gjennomgang, starter på indeks 0 slik at tabellen
        // blir sortert fra venstre til høyre.
        for(int i = 0; i < a.length-1; i++){
                //(2) Sjekker om en verdi er større enn en verdi en plass mot høyre, og bytter isåfall plass.
                if (a[i] > a[i + 1]) {
                    int maks = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = maks;
            }

        }
        //(3) Returnerer siste verdien i tabellen, som også skal være det høyeste tallet.
        return a[a.length-1];

        }


    public static int ombyttinger(int[] a) {
        /**
         * Det blir flest ombyttinger dersom en permutasjon av tallene 1 til N er synkende fra venstre til høyre
         * Dermed vil det bli en ombytting for hver økning av indeksen.
         *
         * Det blir færrest ombyttinger dersom en permutasjon av tallene fra 1 til N er stigende fra venstre til høyre,
         * fordi tallene allerede vil være sortert og det blir dermed ikke behov for mange ombyttinger.
         *
         * I gjennomsnitt vil det være H(n) = log(n) + 0,577 ombyttinger, hvor n = a.length.
         *
         */

        //(1) Initialiserer en teller som skal telle opp alle ombyttinger
        int teller = 0;

        // (2) Bruker liknende for-løkke som i maks() for å flytte største tallet mot høyre.
        for(int i = 0; i < a.length-1; i++){
            //(3) Sjekker om en verdi er større enn en verdi en plass mot høyre. Dersom dette er
            // tilfelle bytter verdiene plass, og teller økes med 1.
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    teller++;
            }
        }
        //(4) Returnerer teller som inneholder antall ombyttinger i arrayet.
        return teller;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        /**
         * Fordi tallene i tabellen må inneholde tall i stigende rekkefølge vil funksjonen kun telle
         * dersom tallet før er mindre. Teller starter på 1 fordi funksjonen starter sammenlikningen fra
         * det 2. tallet i rekken.
         */

        // Oppretter en teller for å telle antall ulike tall.
        int teller = 1;

        // Lager en for-løkke som går igjennom tabellen.
        for (int i = 0; i < a.length -1; ++i) {
            // Hvis tabellen er tom vil teller returnere 0.
            if (a.length == 0) {
                teller = 0;
            // Hvis tabellen ikk er sortert stigende vil det bli sendt en feilmelding.
            } else if (a[i] > a[i+1]) {
                throw new IllegalStateException("Tabelllen er ikke sortert stigende.");
            // Hvis tallet før er mindre enn tallet etter vil teller øke med 1.
            } else if (a[i] < a[i+1]){ //
                teller ++;
            }
        }
        return teller;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        // Oppretter en teller for å telle antall ulike tall.
        int teller = 1;

        // Lager en for-løkke som går igjennom tabellen.
        for (int i = 0; i < a.length -1; ++i) {
            // Hvis tabellen er tom vil teller returnere 0.
            if (a.length == 0) {
                teller = 0;
            }
            // KODE MANGLER HER FOR Å FULLFØRE TELLINGEN.
        }
        return teller;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        /**
         * Lag metoden public static void delsortering(int[] a). Den skal dele
         * parametertabellen a i to sorterte deler. Venstre del skal inneholde oddetallene sortert og
         * høyre del partallene sortert.
         */
        int left = 0; //oddetall
        int right = a.length-1; //partall

        for(int i = 0; i < a.length; i++){
            while(a[left] % 2 == 1){
                left++;
            }
            while(a[right] % 2 == 0){
                right--;
            }
            if(left < right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }

    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        /**
         * Lag metoden
         * public static void rotasjon(char[] a). Den skal «rotere» innholdet i tabellen a én enhet.
         * En rotasjon i en tom tabell eller i en tabell med nøyaktig ett element er ingen feilsituasjon. Men
         * rotasjonen vil da ikke endre noe.
         */


        //Dersom tabellen inneholder 1 verdi eller er tom, skal tabellen returneres slik den er uten å endres.
        if(a.length <= 1){
            return;
        }

        //Bruker en liknende rotasjonsmetode 1.3.13 d) som beskrevet i kompendiet i avsnitt 1.3.13,
        // "Forskyvninger og rotasjoner".

        // (1) Oppretter en hjelpetabell
        char [] b = Arrays.copyOfRange(a, a.length - 1, a.length);


        //(2) For-løkke forskyver alle verdiene en plass mot høyre.
        for (int i = a.length - 1; i >= 1; i--){
            a[i] = a[i - 1];
        }

        // (3) Kopierer verdi fra indeks 0 i [] b til indeks 1 i [] a.
        System.arraycopy(b, 0, a, 0, 1);
        System.out.println("Array etter 1 flytt" + Arrays.toString(a));
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        /**
         * Lag
         * metoden public static void rotasjon(char[] a, int k) der k er et vilkårlig heltall.
         * Hvis k = 1, skal metoden ha samme effekt som metoden i Oppgave 5. Hvis k er negativ, skal
         * rotasjonen gå motsatt vei. En rotasjon i en tom tabell eller i en tabell med nøyaktig ett element er
         * ingen feilsituasjon. Men rotasjonen vil da ikke endre noe. Det er ingen grense på størrelsen til k.
         * Målet er å gjøre metoden så effektiv som mulig.
         */

        //Dersom tabellen inneholder 1 verdi eller er tom, skal tabellen returneres slik den er uten å endres.

        //Samme metode som i oppg. 5 ble foretrukket for å forskyve tabellen,
        // men det er viktig å bemerke at denne vil være mest effektiv hvis k er liten i forhold til a.length.

        // (1) Oppretter en hjelpetabell
        char [] b = Arrays.copyOfRange(a, a.length - k, a.length);

        //(2) For-løkke forskyver alle verdiene en plass mot høyre.
       for (int i = a.length - k; i >= k; i--){
                a[i] = a[i - k];
            }

        // (3) Kopierer forflyttede verdier til rett plass i [] a.
        System.arraycopy(b, 0, a, 0, k);
        System.out.println("Array etter" + k + "flytt" + Arrays.toString(a));
    }


    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
