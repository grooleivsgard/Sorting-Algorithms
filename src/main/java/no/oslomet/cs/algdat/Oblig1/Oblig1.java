package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}


    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        //må lages
        //throw new UnsupportedOperationException();
        if(a.length <= 0){
            throw new NoSuchElementException();
        }
        //Bruker to for-løkker

        // (1) Ytre løkke sorterer ett tall per gjennomgang
        for(int i = 0; i < a.length-1; i++){
            // (2) Indre løkke bytter om verdiene på posisjonene
            for(int j = 0; j < a.length-1; j++) {

                //sjekker om en verdi er større enn en verdi en plass mot høyre
                if (a[j] > a[j + 1]) {
                    //System.out.println("Inversjon! Bytter plass på " + j + " og " + (j-1) );
                    int maks = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = maks;
                }
            }

        }//MANGLER SJEKK om last_value faktisk er maks tallet
        return a[a.length-1];

        }


    public static int ombyttinger(int[] a) {
        //throw new UnsupportedOperationException();

        int teller = 0;

        for(int i = 0; i < a.length-1; i++){

            // (2) Indre løkke bytter om verdiene på posisjonene
            for(int j = 0; j < a.length-1; j++) {

                // (3) Dersom det er en ombytting økes teller
                if (a[j] > a[j + 1]) {
                    //System.out.println("Inversj2on! Bytter plass på " + j + " og " + (j-1) );
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    teller++;

                }

            }

        } return teller;

    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
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
