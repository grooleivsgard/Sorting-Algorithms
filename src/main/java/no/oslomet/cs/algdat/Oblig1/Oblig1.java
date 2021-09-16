package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import javax.imageio.ImageReader;
import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Oblig1 {
    private Oblig1() {}


    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        //
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
         * Når blir det flest ombyttinger?
         * Det blir flest ombyttinger dersom en permutasjon av tallene 1 til N er synkende fra venstre til høyre
         * Dermed vil det bli en ombytting for hver økning av indeksen.
         *
         * Når blir det færrest?
         * Det blir færrest ombyttinger dersom en permutasjon av tallene fra 1 til N er stigende fra venstre til høyre,
         * fordi tallene allerede vil være sortert og det blir dermed ikke behov for mange ombyttinger.
         *
         * Hvor mange blir det i gjennomsnitt?
         * Etter å ha kjørt metoden randPerm() gjennom ombyttinger 30 ganger, ble det i gjennomsnitt ...
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
        //(4) Returnerer teller som inneholder antall ombyttinger gjennom arrayet.
        return teller;
    }


    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        /**
         * Fordi tallene i tabellen må inneholde tall i stigende rekkefølge vil funksjonen kun telle
         * dersom tallet før er mindre. Teller starter på 1 fordi funksjonen starter sammenlikningen fra
         * det 2. tallet i rekken.
         */

        // Oppretter en teller for å telle antall ulike tall. Teller starter på 1 fordi indeks 0 telles ved først
        // sammenlikning i for-løkken under.
        int teller = 1;

        if (a.length == 0) {
            teller = 0;
            // Hvis tabellen er tom vil teller returnere 0.
        }

        // Lager en for-løkke som går igjennom tabellen en gang for hver indeks.
        for (int i = 0; i < a.length -1; i++) {

             if (a[i] > a[i+1]) {
                // Hvis tabellen ikke er sortert stigende, vil man få en feilmelding.
                throw new IllegalStateException("Tabelllen er ikke sortert stigende.");

            // Kun hvis tallet før er mindre enn tallet etter vil teller øke med 1.
            } else if (a[i] < a[i+1]){
                teller ++;
            }
        }
        return teller;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        /* Oppretter en teller for å telle antall ulike tall. Teller starter på 0 i motsetning til i oppgave 1.
           I motsettning til oppgave 2 er teller 0 fordi vi kjører en løkke inni en løkke for å sammenlikne tall,
           uavhengig av rekkefølge på tallene.
         */
        int teller = 0;

        // Hvis tabellen er tom vil teller returnere teller som er satt til 0.
        if (a.length == 0) {
            return teller;
        }

        // Lager en for-løkke som går igjennom tabellen en gang.
        for (int i = 0; i < a.length; i++) {

            // oppretter en markør som registrer om noen tall i tabellen er like.
            int markor = 0;

            // En for løkke inni for-løkke som sammenlikner verdi på i og j.
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    markor = 1;
                    // Går ut av if-setningen hvis condition er sann.
                    break;
                }
            }
            if (markor == 0) {
                teller ++;
            }
        }
        return teller;
    }

    ///// Oppgave 4 //////////////////////////////////////


    //Bruker metoden bytt() fra Programkode 1.1.8 d) i kompendiet.

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static void delsortering(int[] a) {

        int left = 0; //venstresiden skal inneholde oddetall
        int right = a.length-1; //høyresiden skal inneholde partall

        // (1) Sjekker om arrayet kun er partall, dersom dette er tilfelle, sorter hele arrayet.
        if(partall(a)){
            Arrays.sort(a);

            // (2) Sjekker om arrayet kun er partall, dersom dette er tilfelle, sorter hele arrayet.
        } else if(oddetall(a)){
            Arrays.sort(a);

            // (3) Array inneholder både partall og oddetall
        } else {

            // (4) Setter opp for-løkke for å sortere arrayet etter oddetall og partall.
            for(int i = 0; i < a.length-1; i++){

                // (5) Hvis venstrepeker er på et oddetall, flytt mot høyre.
                while(a[left] % 2 != 0){
                    left++;
                }
                // (5) Hvis høyrepeker er på et partall, flytt mot venstre.
                while(a[right] % 2 == 0){
                    right--;
                }
                // (6) Hvis venstrepeker er mindre enn høyrepeker, kall på metoden bytt() som sorterer om tallene.
                if(left < right){
                    bytt(a, left, right);
                }
            }

            // (7) Sorter oddetall, fra indeks 0 til og med venstrepeker.
            Arrays.sort(a, 0, left);

            // (8) Sorter partall, fra venstrepeker til og med enden av array.
            Arrays.sort(a, left, a.length);
        }

    }

    public static boolean partall (int [] a){

        boolean partall = true;

        // (1) Sjekker om det finnes oddetall i arrayet, isåfall sett partall til false og returner false.
        // Hvis ikke, returner true.
        for(int j : a){
            if(j % 2 != 0){
                partall = false;
                break;
            }
        }
        return partall;
    }

    public static boolean oddetall(int [] a){

        boolean oddetall = true;

        // (1) Sjekker om det finnes partall i arrayet, isåfall sett oddetall til false og returner false.
        // Hvis ikke, returner true.
        for(int j : a){
            if(j % 2 == 0){
                oddetall = false;
                break;
            }
        } return oddetall;

    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {

        //Bruker en liknende rotasjonsmetode 1.3.13 d) som beskrevet i kompendiet i avsnitt 1.3.13,
        // "Forskyvninger og rotasjoner".

        //(1) Dersom tabellen inneholder 1 verdi eller er tom, skal tabellen returneres slik den er uten å endres.
        if(a.length <= 1){
            return;
        }

        // (2) Oppretter en hjelpetabell
        char [] b = Arrays.copyOfRange(a, a.length - 1, a.length);


        //(3) For-løkke forskyver alle verdiene en plass mot høyre.
        for (int i = a.length - 1; i >= 1; i--){
            a[i] = a[i - 1];
        }

        // (4) Kopierer verdi fra indeks 0 i [] b til indeks 1 i [] a.
        System.arraycopy(b, 0, a, 0, 1);
    }

    ///// Oppgave 6 //////////////////////////////////////

    // Euklids algoritme
    public static int gcd(int a, int b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void rotasjon(char[] a, int k) {

        // Bruker Programkode 1.3.13 i) fra kompendiet i Kap 1.3. Dette er en av tre versjoner som kan bli brukt for å
        // rotere et array. Denne versjonen, hvor Euklids algoritme blir brukt,
        // ble valgt for å oppnå den høyeste effektiviteten.

        //(1) Setter a.length til n for bedre lesbarhet
        int n = a.length;

        // (2) Returnerer koden "as is" dersom arrayet inneholder mindre enn 2 verdier.
        if (n < 2) return;

        // (3) Dersom k er negativ, flytt motsatt vei
        if ((k %= n) < 0) k += n;

        // (4) Bruker Euklids algoritme for å finne største felles divisor mellom a.length og k.
        int s = gcd(n, k);

        //(5) Bruker lignende forløkke som i Programkode 1.3.13 i).
        for (int i = 0; i < s; i++)
        {
            char verdi = a[i];

            for (int j = i - k, h = i; j != i; j -= k)
            {
                if (j < 0) j += n;
                a[h] = a[j]; h = j;
            }

            a[i + k] = verdi;
        }
    }


    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        // Bruker løsningsforslag til oppgave 1b) i 1.3.11 i kompendiet

        // Finner den tegnstrengen som er kortest
        int k = Math.min(s.length(), t.length());

        // Oppretter en ny tabell som foreløpig er tom.
        StringBuilder m = new StringBuilder();

        // Går igjennom s og t så lenge den er mindre enn den minste tegnstrengen.
        for (int i = 0; i < k; i++) {
            // legger til annenhver s og t sin bokstav for hver indeks i tegnstrengene (fletting)
            m.append(s.charAt(i)).append(t.charAt(i));
        }
        // Legger så til resterene tegn som er "til overis i den lengste tegnstrengen.
        m.append(s.substring(k)).append(t.substring(k));
        return m.toString();
    }

    /// 7b)
    public static String flett(String... s) {
        // Teller totalt antall tegn i tegnstrengene (8).
        int totalCharacters = 0;

        // Teller igjennom "ordene" til s.
        for (int i = 0; i < s.length; i++) {

            // Finner hvor mange teng som totalt er i s (28).
            for (int j = 0; j < s[i].length(); j++) {
                totalCharacters++;
            }
        }

        // Initialiserer en tom tegnstreng.
        String out = "";

        // Går igjennom alle tegnene i s.
        for (int i = 0; i < totalCharacters; i++) {

            // For hvert tegn den går igjennom i hver tegnstreng, så legger den det til i out.
            for (int j = 0; j < s.length; j++) {

                if (i < s[j].length()) {
                    out += s[j].charAt(i);
                }
            }
        }
        return out;
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        // throw new UnsupportedOperationException();
        
        // SKRIV HVILKEN TYPE SORT SOM ER BRUKT

        // Hvis tabellen er tom vil teller returnere a uten noen endringer.
        if (a.length == 0) {
            return a;
        }

        // Hvis tabellen inneholder kun 1 verdi returneres kun en verdi.
        if (a.length == 1) {
            return new int[]{0};
        }

        // Kopierer tabellen i a.
        int[] kopi = a.clone();

        // Oppretter et ny tabell med samme lengde som a, foreløpig med kun verdi 0.
        int[] indeks_a = new int[a.length];

        // Oppretter så en til tabell som er en ny kopi av a for å finne største verdi (16).
        int storste_verdi = maks(a.clone());

        // Setter minste verdi til å være største verdi (16).
        int minste_verdi = storste_verdi;

        // Minste verdi sin indeks er satt til 0.
        int minste_indeks = 0;

        // Teller igjennom tabell indeks_a.
        for (int i = 0; i < indeks_a.length; i++) {

            // Teller igjennom a.
            for (int j = 0; j < a.length; j++) {

                // Hvis kopi sin indeksverdi er mindre enn minste_verdi (storste_verdi), så settes den til minste_verdi.
                if (kopi[j] < minste_verdi) {
                    minste_verdi = kopi[j];
                    // Indeks settes til minste indeks.
                    minste_indeks = j;
                }
            }

            // Henter neste minste_verdi (storste_verdi).
            kopi[minste_indeks] = storste_verdi+1;

            // Resetter minste_verdi.
            minste_verdi = storste_verdi+1;

            // Legger det minste tallet i indeks_a.
            indeks_a[i] = minste_indeks;

        }

        return indeks_a;
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
