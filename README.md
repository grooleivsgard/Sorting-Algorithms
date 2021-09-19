[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=446844&assignment_repo_type=GroupAssignmentRepo)
# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer.
Oppgaven er levert av følgende studenter:
* Jenny Liang Nergård, S312980, s312980@oslomet.no
* Gro Elisabeth Oleivsgard, S344222, s344222@oslomet.no

# Arbeidsfordeling
I oppgaven har vi hatt følgende arbeidsfordeling:
* Jenny har hatt hovedansvar for oppgave 2, 3, 7 og 8.
* Gro har hatt hovedansvar for oppgave 1, 4, 5, og 6.

# Oppgavebeskrivelse
* I oppgave 1 så gikk vi frem ved å bruke bubble sort, slik at en og en verdi blir byttet gjennom en for-løkke. På denne måten ender det største tallet opp som siste verdi i arrayet, og vi kan dermed returnere siste posisjon som maks i maks(). I ombyttinger() brukte vi samme metode, men initialiserte en teller som økte for antall ombyttinger gjennom arrayet.  


* I oppgave 2 så gikk vi frem ved å bruke samme metode som i Programkode 1.1.2 i kompendiet. Istedenfor å returnere maks indeksen, så teller vi heller antall ulike tall. Siden tabellen er i stigende rekkefølge trenger vi bare å gå gjennom tabellen en gang. Teller registreres kun når vi finner et tall som er ulikt det forrige. Fordi tallene i tabellen må inneholde tall i stigende rekkefølge vil funksjonen kun telle dersom tallet før er mindre. Teller starter på 1 fordi funksjonen starter sammenlikningen det 1. tallet i rekken med det 2. tallet i rekken.


* I oppgave 3 så sammenlikner vi to indekser (i, j) i to nøstede for-løkker. Teller starter på 0 i motsetning til  oppgave 2 fordi vi kjører en løkke inni en løkke for å sammenlikne tall, uavhengig av rekkefølge på tallene.
  

* I oppgave 4 så brukte vi en venstre- og høyrepeker (left og right) til å sortere oddetall og partall. I første omgang sjekket vi om arrayet kun inneholdt partall eller kun oddetall med henholdsvise metoder. Metodene brukte modolus-operatoren for å sjekke om arrayet inneholdt partall eller oddetall, og returnerte enten true eller false. Dersmo true ble returnert, brukte vi den innebygde sorteringsalgoritmen til Java, Arrays.sort() for å sortere arrayet i sin helhet. Dersom det ble returnert false fra begge metodene, dvs at arrayet inneholdt både partall og oddetall, brukte vi en for-løkke for å løpe gjennom arrayet. Her ble pekerne brukt til å sjekke hvert tall, om de var oddetall eller partall, med modulus-operatoren. Venstrepeker ble flyttet mot høyre og høyrepeker mot venstre, og arrayet ble på denne måten sortert ved å bruke metoden bytt() til å bytte om verdier til ønsket side. Til slutt ble arrayet sortert i to deler, først fra indeks 0 til og med venstrepekeren (oddetallene), og deretter fra venstrepeker til siste indeks i arrayet (partallene). 


* I oppgave 5 så brukte vi en rotasjonsmetode fra 1.3.13 d) i kompendiet, for å rotere et array en plass mot høyre. I denne prosessen opprettet vi en hjelpetabell char [] b som lagrer den siste verdien i arrayet før rotasjonen. Med en for-løkke blir arrayet forskyvet et hakk mot høyre, og verdien i [] b blir kopiert over til indeks 0 (destPos 0) i [] a. 


* I oppgave 6 så valgte vi å bruke en rotasjonsmetode som tar i bruk Euklids algoritme for å oppnå en mest mulig effektiv algoritme, som vist i Programkode 1.3.13 i) i kompendiet, med kun 2n tabellaksesser. Her blir den største felles divisoren for lengden av array (n) og antall plasser verdier skal flyttes (k) funnet (s). S blir satt som som grenseverdi i for-løkken da dette tilsvarer antall sykluser nødvendig for å rotere arrayet k plasser.


* I oppgave 7a) så gikk vi frem ved å bruke løsningsforslag til oppgave 1b) i 1.3.11 i kompendiet. Først fant vi den tegnstrengen som er kortest ved å bruke en Math.min() metode. Deretter opprettet vi en ny tom tabell. Denne bruker vi til å fylle inn annenhvert tegn, først fra tabell s, der vi fletter tegnene sammen fra de ulike tegnstrengene, så fra t.


* I oppgave 7b) så gikk vi frem ved å flette på nesten samme måte som i oppgave 7a). Denne gangen måtte vi først finne totalt antall tegnstrenger i stringtabell s. Deretter opprettet vi en ny tom stringtabell. Den fyllte vi inn det første tegnet fra hver tegnstreng. Mellomrom telles også som en streng. Den innebygde charAt() metoden blir brukt for å finne indeksen til det aktuelle tegnet.


* I oppgave 8 så har vi kommet frem til løsningen ved å basere programkoden på avsnitt 1.3.4 Utvalgssortering, samt løsningsforslag til oppgaver fra Avsnitt 1.3.4. Først kopierete vi tabell a ved å bruke java-metoden clone(). Deretter lånte vi maks() metode fra oppgave 1 for å finne største verdi til a (a sin kopi). Vi satte storste_verdi til misnte_verdi for så å flytte den sist via en nøstet for-løkke. Alle indeksene sortert etter hvilke tall som er støsrt ble deretter plassert i indeks_a som var en ny tabell "uten verdier", og med lik lengde som a. 


**Annet å bemerke**

* Vi opprettet en MidlertidigMain.java for å teste oppgavene og se riktige verdier som skulle bli skrevet ut.
* Det oppstod feilmelding med Gradle Test Executor, så oppgave 7a), b) og 8 ble testet utenfor Oblig1. Fikk tilsutt hjelp av TA slik at innstillingene i Intellij ble oppdatert og det var mulig å kjøre en endelig test.