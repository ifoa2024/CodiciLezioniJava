Ereditarietà
- Java è a ereditarietà singola
- Ereditare vuol dire ricevere tutte le funzionalità e caratteristiche della classe padre
- I figli vedono tutto ciò che è contenuto nel padre, il padre non vede assolutamente ciò che è contenuto nei figli, classi sorelle non si vedono fra di loro

La keyword super richiama il costruttore del padre

le kwyword di solito posseggono una sinstassi differente rispetto ai metodi e al richiamo degli attributi

Fanno parte del linguaggio e servono a dare direttive


Modificatori di accesso
- Public -> acesso in lettura e scrittura in qualsiasi parte del codice
- Private -> acesso in lettura e scrittura solo all'interno della classe in cui vengono definiti, e non vengono ereditati
- Protected -> acesso in lettura e scrittura all'interno della classe in cui vengono definiti, vengono ereditati e quindi sono accessibili in lettura e scrittura anche all'interno delle classi ereditate
- Package -> E' l'accesibilità di default di java cioè sono visibili all'interno del package cioè il folder in cui sono presenti i file