MAP metodi:
- PUT: Inserisce un nuovo dato
    - put(K key, V value);
- GET: recupera un oggetto in base alla chiave
    - get(Object key);
- CONTAINS KEY: controlla se esiste un oggetto in base alla chiave
    - containsKey(Object key);
- CLEAR: rimuove tutti gli elementi della map
    - clear()
- KEY SET: restituisce l'insieme di tutte le chiavi
    keySet();
- VALUES: restituisce una collezione di tutti i valori
    values()

Map organizza i propri dati utilizzato quelli che vengono definiti bucket


Map ha due implementazioni
- HashMap
- TreeMap
(Stesse regole del set)

NELLE MAP: La chiave è fondamentale, deve essere univoca

Per le map la parola entry si riferisce alla key