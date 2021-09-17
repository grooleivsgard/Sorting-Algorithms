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

* I oppgave 2 så brukte vi en ... til å ... *(eksepmel)*

* I oppgave 3 bygget vi videre fra metoden i Programkode 1.1.2 i kompendiet. Istedenfor å returnere maks indeksen, så teller vi heller antall ulike tall. Siden tabellen er i stigende rekkefølge trenger vi bare å gå gjennom tabellen en gang. Teller registreres kun når vi finner et tall som er ulikt det forrige.

* I oppgave 4 så brukte vi en venstre- og høyrepeker (left og right) til å sortere oddetall og partall. I første omgang sjekket vi om arrayet kun inneholdt partall eller kun oddetall med henholdsvise metoder. Metodene brukte modolus-operatoren for å sjekke om arrayet inneholdt partall eller oddetall, og returnerte enten true eller false. Dersmo true ble returnert, brukte vi den innebygde sorteringsalgoritmen til Java, Arrays.sort() for å sortere arrayet i sin helhet. Dersom det ble returnert false fra begge metodene, dvs at arrayet inneholdt både partall og oddetall, brukte vi en for-løkke for å løpe gjennom arrayet. Her ble pekerne brukt til å sjekke hvert tall, om de var oddetall eller partall, med modulus-operatoren. Venstrepeker ble flyttet mot høyre og høyrepeker mot venstre, og arrayet ble på denne måten sortert ved å bruke metoden bytt() til å bytte om verdier til ønsket side. Til slutt ble arrayet sortert i to deler, først fra indeks 0 til og med venstrepekeren (oddetallene), og deretter fra venstrepeker til siste indeks i arrayet (partallene). 

* I oppgave 5 så brukte vi en rotasjonsmetode fra 1.3.13 d) i kompendiet, for å rotere et array en plass mot høyre. I denne prosessen opprettet vi en hjelpetabell char [] b som lagrer den siste verdien i arrayet før rotasjonen. Med en for-løkke blir arrayet forskyvet et hakk mot høyre, og verdien i [] b blir kopiert over til indeks 0 (destPos 0) i [] a. 

* I oppgave 6 så valgte vi å bruke en rotasjonsmetode som tar i bruk Euklids algoritme for å oppnå en mest mulig effektiv algoritme, som vist i Programkode 1.3.13 i) i kompendiet, med kun 2n tabellaksesser. Her blir den største felles divisoren for lengden av array (n) og antall plasser verdier skal flyttes (k) funnet (s). S blir satt som som grenseverdi i for-løkken da dette tilsvarer antall sykluser nødvendig for å rotere arrayet k plasser.

* I oppgave 7 så brukte vi en ... til å ... *(eksepmel)*


* I oppgave 8 så brukte vi en ... til å ... *(eksepmel)*

**Annet å bemerke**

* Vi opprettet en MidlertidigMain.java for å teste oppgavene og se riktige verdier som skulle bli skrevet ut.
* Det oppstod feilmelding med Gradle Test Executor, så oppgave 7a), b) og 8 ble testet utenfor Oblig1.
* *Warnings er enten beskrevet i readme.md eller fjernet.*