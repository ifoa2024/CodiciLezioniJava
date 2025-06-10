Progetto semplice java
Ctrl+shift+p -> create java project -> no build tools -> selezionare cartella -> inserire nome nella parte superiore di VSCode

Progetto con Maven
Ctrl+shift+p -> create java project -> maven -> maven-archetype-quickstart -> versione l'ultima più in cima -> nome del pacchetto seguendo l'inverse domain -> nome del progetto -> nome tutto minuscolo o con gli "_" -> selezionare cartella di destinazione -> attendiamo che i passaggi sul terminale finiscano -> ci chiede se la versione del progetto va bene se ok diamo invio -> ci farà un riassunto di tutto, se ci piace diamo come input la "Y" -> vs code potrebbe chiederci di aprilo (se non lo fa facciamolo a mano tramite bash o terminale qualsiasi)-> nel terminale precednete spingere un tasto qualsiasi cosi si chiuderà l'itero processo

Progetto con Spring
Ctrl+shift+p -> spring initializr create a maven project -> scegliamo la versione, la più recente o quella suggerita, basta che non sia SNAPSHOT -> scegliamo il linguaggio -> inseriamo il group id ciè il nome del pacchettone finale -> inseiramo artifact id cioè il nome del progetto -> inseriamo estensione pacchetto finale -> scegliamo la versione di java -> scegliamo le dipendenze -> scegliere folder di memorizzazione progetto -> vscode ci chiede di aprirlo, facciamolo

dipendenze:
- DevTools
- MySqlDriver
- Sprind Data Jpa
- Spring web
- Spring secuirty
- Thymeleaf
- Model mapper da aggiungere a mano

BIGINT -> Long

Contesto di Spring
- L'insieme di tutti gli oggetti(bean) presenti in memoria che possiamo utilizzare quando e dove vogliamo grazie alla dependency injection

JPA e Spring Data
- Spring Data è il progetto utile affinchè avvenga correttamente la comunicazione con il DB, utilizza come ORM(Object relation mapper) Hibernate che segue le specifiche JPA (Jakarta persistance api) per le sue implementazioni

POJO
- Plain old java object, definiscono gli oggetti che il contesto di spring istanzierà ed utilizzerà. Non sono altro che classi normalissime con un costruttore vuoto e getter e setter


GenerationType.IDENTITY
- Riferisce che l'id deve auto-incrementale

Tutte le annotation utilizzate nei model fanno proprio parte di Hibernate(Jpa)

ARCHITETTURA DEL NOSTRO APPLICATIVO
- Model <-> Controller <-> Service <-> Repository
- Pensiamo sempre il database come se fosse sulla nostra mano destra e tutte le richieste http sulla mani sinistra, da sx arrivano le richieste http che viaggeranno verso destra quindi il nostro DB

REPOSITORIES
- Inizieremo sempre da una interfaccia poichè delle vere e proprie implmentazioni dei repository non le faremo mai, a meno che non ci sono esigenze particolari.
All'interno delle nostre interfacce scriveremo quelle che sono le derived qury, o qury native o query non native. Ma in realtà andremo anche ad estendere delle interfacce già esistenti che hanno delle vere e proprie implementazioni che noi andremo ad utilizzare.
stiamo parlando di CrudRepository e ListCrudRepository che ci consentiranno di avere, come dice il nome stesso, tutte le funzionalità base per un CRUD completo (ci fa capire che abbiamo già davvero tutto)

CrudRepository<T, ID>
- E' uni'interfaccia che comprende tutti i metodi necessari per un CRUD completo, unico "problema" è che come tipologia di dato restituisce o un iterable o un optional questo vuol dire che se utilizzassimo solo questa interfaccia saremmo costretti a fare ogni volta tutte le conversioni in base alla tipologia di dato finale che ci serve

ListCrudRepository<T, ID>
- Eredita tutti i metodi di CrudRepository ed in più ne aggiunge qualcuno, ma la cose più importante è che ci consetne proprio di manipolare Liste

Derived query
- Sono un meccanismo fornito da Spring Data che ci consente di creare query a DB utilizzando semplicemente il nome di un metodo ma dobbiamo seguire una sintassi ben precisa altrimenti il framework non sa come fare le traduzioni

Query Native
- Non aabiamo bisgno di seguire una sintassi ben precisa per quanto riguarda il nome, possiamo inventarlo, l'importante è che sia più parlante possibile

@BeforeEach
- Indica che il metodo corredato da questa annotation deve essere lanciato prima di effettuare ogni singolo test


@DataJpaTest
- Indica che vgliamo testare solo ed esclusivamente le jpa senza necessariamente caricare tutto il contesto di spirng

@AutoConfigureTestDatabase(replace = Replace.NONE)
- Indica che stiamo utilizzando lo stesso database e non uno di test, in più nel momento in cui lancerà il metodo before each si salverà i nuovi dati nel database ma una volta teminati i test li eliminerà (come osservato questa operazione fa perdere gli id)

@Autowired
- Questa annotation indica che stiamo effettuando una injection per poter attivare correttamente il meccanismo di spring dell'inersion of control


AssertJ
- Libreria di asserzioni che ci consente di effettuare test in modo facile ed intuitivo

SERVICE
- Ricordiamo che utilizziamo i service per inserire al loro interno la logica di business, solo loro conterranno queste logiche

MODEL MAPPER
- Libreria compatibile con Spring che ci permette di fare il mapping dei dto(data transfer object) verso i dao(models, data access object) e viceversa

@Bean
- Ci consentono di creare dei bean(oggetti istanziati) all'interno del nostro contesto ma ricordiamo che correderanno sempre e solo medoti che istanziano l'oggeto

Mapping Dto in Dao
- La trasformazione da Dao a Dto, e viceversa, possiamo applicarla solo tramite un mapping
- La corrispondenza fra nomi di attributi del Dto e quelli del Dao porta ad un mapping automatico
- Per tutti gli altri attributi che non hanno corispondenza 1 a 1 con il Dao va esplicitato il mapping
- Per effettuare queste operazioni ci affidiamo ad un mapper, model mapper è quello meglio integrato in spring
- mapper.map(ORIGINE,DESTINAZIONE); -> si attiva in questo modo:
                                            - nell'origine esiste un attributo PUBLIC corrispondente per nome ad un attributo PUBLIC nella destinazione?
                                            Se si matching effettuato, diversamente farà riferimento ai getter ed i setter
                                            - viene attivato un getter di un attributo nell'origine, se esiste un setter corrispondente nella destinazione avverrà la mappatura
                                            - per gli attributo che hanno un setter nella destinazione ma non un getter nell'origine, il loro valore rimarrà a null finchè non verrà esplicitata una mappatura

Optional
- E' un tipologia particolare di oggetto, comunica al framework che questo oggetto può esistere come non esistere ma non sarà mai null. Se non esiste sarà al massimo un oggetto vuoto.
- .get() -> trasforma sempre l'oggetto optional nell'oggetto effettivo di una specificata tipologia

METODI HTTTP
- Get -> Restituiscono una risorsa
- Post -> Creano una risorsa
- Put -> Modificano(aggiornano) una risorsa
- Patch -> Modificano una parte della risorsa
- Delete -> Cancellano una risorsa

ENDPOINT
localhost:8080/api/products

Model
- E' l'oggetto scatola che contiene tutti i dati utili a riempire i buchi presenti nel template html da completare

resources
- static
    - risorse statiche sono quella tipologia di risorse che vengono inserite staticamente nella pagine html
    - caratterizzato molto dal client side rendering
- templates
    - caratterizzando il server side rendering, quindi renderizzazione della pagina html lato server


Thymeleaf
- Motore di template, ci permette di agganciare la logica BE alle pagine Html
- xmlns:th="http://www.thymeleaf.org", import del namescape di thymeleaf, mappa tutto sul suffisso "th"

th:text -> è un comando di thymeleaf, e attiva il meccansmo di manipolazione di un campo testo
th:href -> attiva il meccanismo di creazione e manipolazione di link
@{/products/create} -> "@" indica che il path da elaborare è di tipo dinamico, vuol dire che il path potrebbe anche possedere variabili dinamiche
${title} -> SPEL(Spring expression language) definito anche "dialect" è possiede una sintassi specifica
*{name}" -> "*" è il simbolo più utilizzato per indicare un puntatore, quindi indica che stiamo puntando a qualcosa di specifico

th:each -> indica a thymeleaf che deve attivare un foreach
th:action -> indica a thymeleaf che deve attivare l'attribuot action di un form
th:object -> indichiamo a thymeleaf che il form dovrà manipolare un oggetto che gli sta arrivando dal BE
th:field -> indica a thyemeleaf che quel campo di input sarà collegato ad un attributo dell'oggetto che sta manipolando. Se l'oggetto che stiamo manipolando ha dei valori nei campi questo comando ce li mostrerà nel campo di input
th:value -> elaborazione dinamica da parte di thymeleaf del value delle option
th:errors -> cattura gli errori in sesssione, quindi anche le validazioni
th:if -> attiva il meccanismo di if in un tag

"@{/products/delete/{id}(id=${product.id})}" -> sinstassi di elaborazione dinamica det link, formato da due parti a sinistra il path che possiede le variabili e destra, all'interno delle parentesi tonde viene dichiarato come tradurre quella variabile dinamica

SPEL
- $ -> si riferisce a variabili dinamiche


REDIRECT
- Tutte gli handler collegati a rotte di tipo Post, Put, Delete non restitusicono una vista ma fanno la redirect


SPRING SECURITY
- Progetto di spring che ci consente di inserie sicurezza all'interno del nostro progetto
- Per sicurezza si intende sempre che, chi non ha il permesso di fare qualcosa non deve farlo
- Ci basta inserire la dipendenza di spring security nel pom per nitare già che veniamo bloccati in entrata
- Per poter sovrascrivere il comportamento di default abbiamo bisogno di creare un file di configurazione
- All'interno del file di configurazione creeremo i bean utili ai nostri scopi
- Fondamentale il bean di encoding, noi utilizziamo BCrypt
- Altro bean che utilizziamo è quello per la creazione di utenti in memoria, utile in fase di testing o prototipazione che tramite un builder costruisce gli utenti in memoria ram
- Il form di Login richiede solo che i campi di inserimento dell username e password abbiamo "name" corrispondete a "username" , "password". Solo cosi riuscirà ad attivare tutti i meccanismi di sovrascrizione e attivane del sistema.