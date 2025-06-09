package it.ifoa.progettofinaleifoa.services;

import java.util.List;
/*
 * D = Dto ricevuto
 * M = Dao(model) da manipolare
 * K = Tipologia dell'id da manipolare
 */
public interface CrudService<D, M, K>{
    //recupera tutti i dati
    List<D> readAll();
    //recupera solo un dato preciso
    D read(K k);
    //crea un nuovo dato
    D create(M m);
    //modifica un dato esistente
    D update(K k, M m);
    //cancella un dato esistente
    void delete(K k);
}
