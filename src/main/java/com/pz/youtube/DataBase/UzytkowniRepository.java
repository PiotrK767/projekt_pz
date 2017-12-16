package com.pz.youtube.DataBase;

import org.springframework.data.repository.CrudRepository;

public interface UzytkowniRepository extends CrudRepository< Uzytkownik, Long> {

    Uzytkownik findUzytkownikByNazwaUzytkownika(String nazwaUzytkownika);
}
