package com.pz.youtube.DataBase;

import org.springframework.data.repository.CrudRepository;

public interface ZdjeciaRepository extends CrudRepository<Zdjecia, Long> {
    Zdjecia findZdjeciaByNazwa(String nazwa);
}
