package com.pz.youtube.DataBase;

import org.springframework.data.repository.CrudRepository;

public interface Sl_KategoriiRepository extends CrudRepository<Sl_Kategorii, Long> {
    Sl_Kategorii findSl_KategoriiByNazwa(String nazwa);
}
