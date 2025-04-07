Approcci alla programmazione
- Imperativo(definiamo il come)
    - Dettagliamo ogni passaggio della nostra logica
- Dichiarativo(ci intreressiamo al cosa)
    - Programmazione funzionale
        - Non è il programmatore a definire i passaggio logici dell'algoritmo
        - Si basa principalmente sul concetto di funzioni PURE

STREAM
- E' un flusso di dati che recupera la struttura dati e ne utilizza i singoli elementi

Funzioni
- Pure -> Utilizzano il dato senza però modificarne lo stato
- Impure -> Cambiano lo stato di un qualsiasi dato


person->person.gender.equals(Gender.FEMALE)

public boolean equalsGender(Person person){
    return person.gender.equals(Gender.FEMALE)
}

LAMBDA FUNCTION
- La programmzione funzionale si basa tutta sulle lmbda function

Sintassi:
parameter -> expression (predicato)

esempi:
- lambda con type inference
    num -> num * 2;
- lambda no type inference
    (int num) -> num * 2;
- (parameter 1, parameter 2) -> {
        code ...;
        return something;
    }