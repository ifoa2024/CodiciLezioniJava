package it.ifoa.progettofinaleifoa.services;

import java.util.List;

public interface CrudService<ReadDto, Model, Key>{
    //recupera tutti i dati
    List<ReadDto> readAll();
    //recupera solo un dato preciso
    ReadDto read(Key key);
    //crea un nuovo dato
    ReadDto create(Model model);
    //modifica un dato esistente
    ReadDto update(Key key, Model model);
    //cancella un dato esistente
    void delete(Key key);
}
