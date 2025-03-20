Collection metodi
- ADD: aggiunge un elemento ad una collezione
    - public boolean add(Object o);
- ADD ALL: aggiunge più elementi ad una collezione
    - public boolean addAll(Collection c);
- CLEAR: pulisce la collezione
    - public void clear();
- CONTAINS: verifica se un determinato oggetto appartiene ad una collezione
    - public boolean contains(Object o);
- CONTAINS ALL: verifica la presenza di un gruppo di oggetti in una collezione
    - public boolean containsAll(Collection c);
- IS EMPTY: verifica se una collezione è vuota
    - public boolean isEmpty();
- REMOVE: rimuove un determinato oggetto da una collezione
    - public boolean remove(Objcet o);
- REMOVE ALL: elimina un gruppo di oggetti da una collezione
    - public boolean removeAll(Collection c);
- SIZE: restituisce la dimenzione della collezione
    - public int size();
- TO ARRAY: trasforma una collection in un array
    - public Object[] toArray();

LIST
- E' una collezione che segue tutte le regole di una lista
- E' una interfaccia che possiede tutti i metodi necessari
- Esistono due tipologie:
    - ArrayList
    - LinkedList

ARRAY LIST
- Segue tutte le regole degli arrray, possiede quindi indici per caratterizzare gli elementi e tutti gli elementi sono di un tipo specifico
- Non è però a dimensione fissa
- Questa collection è molto veloce in lettura ma poco veloce in scrittura poichè avendo tutit i dati memorizzati n locazioni contingue se aggiungo elementi dovrò effettuare ogni volta un copia ed incolla dell'intero array. E' veloce però in lettura proprio perchè possiede gli indici e i dati sono in locazioni di meoria contigue.

LINKED LIST
- 
-
-
-

possiede dei metodi in più:
- addFirst() -> aggiunge un elemento in testa
- addLast() -> aggiunge un elemento in coda
- removeFirst() -> rimuove un elemento in testa
- removeLast() -> rimuove un elemento in coda
- getFisrt() -> restituisce l'elemento di testa
- getLast() -> restituisce l'elemento di coda

Iterator
- Tutte le interfacce sviluppano l'interfaccia Iterator