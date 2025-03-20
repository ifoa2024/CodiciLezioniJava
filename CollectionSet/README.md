toString()
- quello di default di object stampa il riferimento
- tutte le vole che provo a fare una stampa su un oggetto viene SEMPRE chiamato il metodo toString della classe


Confronto di uguaglianza di SET
- Utilizza sia equals che hascode come metodi per il confronto
- VERO : equals true, hascode stesso identificativo
- FALSE : equals true, hascode identificativo diverso
- FALSE : equals false, hascode stesso identificativo
- FALSE : equals false, hascode identificativo diverso


Di SET esistono due implementazioni specifiche
- HashSet -> è molto veloce in scrittura, utilizza la tabella di hashing per evitare collizioni in scrittura,
            hashset si basa su equals ed hashcode
- TreeSet -> è molto veloce in lettura, utilizza gli alberi di conseguenza è molto veloce in lettura(ricerca)
             il treeset utilizza un coparator per decidere se due oggetti sono uguali