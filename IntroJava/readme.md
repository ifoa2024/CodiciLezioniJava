NOMENCLATURA
- il nome della classe deve iniziare con la maiuscola
- in inglese
- al singolare
- se composta da più parole utilizzare pascal case (camel case)

ESTENSIONE
- .java , sta ad indicare che il file contiene codice java


public class HelloWorld
- class è la keyword per identificare una classe
- poi c'è il nome della classe
- il nome della classe DEVE CORRISPONDERE al nome del file


public static void main(String[] args)
- static indica che questo metodo non dipende assolutamente dalla presenza di un oggetto ma può essere chiamato direttamente utilizzando la classe
- main metodo principale


Type system di Java

In java tutte le classi che dichiaro diventano un tipo

Il type system di un linguaggio è l’insieme dei tipi di dato del linguaggio e di come questi vengono gestiti.

Serve per capire come il linguaggio gestisce i dati e quali sono le operazioni possibili su questo linguaggio.

Possiamo suddividerlo in:

- come effettua le verifiche sui tipi di dato che stiamo utilizzando

- come effettua le verifiche sulla correttezza dei dati che sto utilizzando

Verifiche sui tipi di dato e sulle operazioni

Verifica dei dati in due modi

statico

dinamico

Statico

la tipologia di controllo statico avviene quando il programma effettua le operazioni di controllo a compile time, ovvero prima di essere eseguito, generando il bytecode.
Nel caso di Java quando lanciamo il comando da terminale javac.

Dinamico

la tipologia di controllo dinamico invece avviene quando il programma effettua le operazioni durante l'esecuzione del codice. Run time compile (solitamente usato nei linguaggi interpretati)
PHP da errore durante l'esecuzione.


Verifiche sulla correttezza dei dati che sto utilizzando

Per tipizzazione abbiamo due tipi di tipizzazione, ovvero forte e debole, vediamoli nel dettaglio.

forte

vuol dire che devo indicare il tipo delle variabili quando le dichiaro,

vuol dire che devo indicare i valori di ritorno di una funzione

vuol dire che devo indicare il tipo di dato che riceve una funzione

debole

un linguaggio può effettuare conversioni in maniera autonoma

Java è a tipizzazione statica e forte

https://aulab-it.zoom.us/j/83528351981?pwd=fPZomJdrawIDWIfq4x36wdsbLgxsNu.1