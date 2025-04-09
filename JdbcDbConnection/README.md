create table -> comando sql per la creazione di una nuova tabella

id -> intero, positivo,univoco ed autoincrementale
campo -> nelle tabello se un campo viene dichiarato di un tipo può contenere solo ed eesclusivamente quel tipo di dato

varchar(255) -> Stringa di massimo 255 caratteri

not null -> il campo non può essere null

Consistenza delle tabelle
- Un campo non può e ne deve essere MAI vuoto al massimo deve contenere NULL

drop table -> utilizzato per eliminare le tabelle

insert into <nome tabella>-> inserimento all'interno di una tabella
(campo1, campo2, campo3,.....) -> nomi dei campi nell'ordine in cui sono nella tabella
values -> definisce l'inizio del valori da inserire


JDBC -> Java database connection


SELECT p.name, v.attribute, v.value -> selezione di colonne precise tramite aliasing

FROM products p join variants v -> si descrve quali tabelle devo unire, in join senza specifica è l'inner join

ON p.id = v.product_id -> si descrive dove far perno per la relazione