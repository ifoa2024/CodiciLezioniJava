Snapshot= Versione ancor ain fase di sviluppo quindi instabile

scope = dice quando il pacchetto deve essere utilizzato

dipendenze transitorie = sono le dipendenze che hanno le librerie importate nel nostro progetto

context = il contesto è l'insieme degli oggetti che spring utilizza (i bean)

GOAL di Maven
clean -> pulisce tutti i .class
compile -> crea i .class

Struttura di un applicativo Spring
view -> controller -> service -> repository -> DB
view <- controller <- service <- repository <- DB

view = Viste, servono per mostrare i dati
controller = Controllano tutto ciò che le viste fanno
service = contengono al logica di business(logica lega al dominio, cioè dove stiamo risolvendo il problema)
repository = si occupano solo ede eslcusivamente della comunicazione con il DB
DB = storage dei dati


Stereotype
@Component -> costruiscono la struttura del progetto