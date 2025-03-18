Classe
- Descrizione di come dovrà essere composto un determinato oggetto
Oggetto
- Istanza di una classe

Nome di una classe
Extract, incapsulate, abstract

Keyword new
- Chiama un costruttore. Quale? Quello della classe definita alla sua destra.

La keyword this nel costruttore
- dell'oggetto che andrò a creare

keyword this nei metodi
- possiamo ometterla
- dell'oggetto che ho creato

Overload
- Per il costruttore si chiama overloading del costruttore

Dot notation
- in java la dot notation definisce "entra nell'oggetto e prendimi quello che ti sto indicando"


Object references
- Lo stack contiente tutto ciò che non è un oggetto(varabili, dichiarazioni di funzioni ecc ecc)
- Lo heap contiene solo gli oggetti

Side effect
- il side effect avviene quando cambio lo stato di una qualsiasi entità dall'esterno dell'entità stessa

Funzioni pure

int a = 20;
int b = 30;

public int somma(int num1, int num2){
    return num1 + num2;
}

somma(a,b);

Funzione non pure

int a = 20;
int b = 30;

public int somma(int num1, int num2){
    num1 = 27;

    return num1 + num2;
}

somma(a,b);

Equals
- E' un metodo ereditato dal padre onnipotente object
- Ha il comportamento di default uguale a "=="


@Override
- Si definisce annotation
- una annotation non è codice eseguibile ma semplicemnte una direttiva per il compilatore

Override
- Sovrascrivere un comportamento di default(di base)

Object Equality e Object identity
- Equality -> se hanno lo stesso indirizzo di memoria 
- Identity -> se posseggono gli stessi attributi