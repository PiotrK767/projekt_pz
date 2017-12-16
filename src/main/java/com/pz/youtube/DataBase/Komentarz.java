package com.pz.youtube.DataBase;


import lombok.Getter;
import lombok.Setter;


import lombok.Builder;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
//@Builder

public class Komentarz {


    private int idZdjecia;
    private int idUzytkownika;
    private String komentarz;

    public Komentarz(int idZdjecia, int idUzytkownika, String komentarz){

        this.idZdjecia = idZdjecia;
        this.idUzytkownika = idUzytkownika;
        this.komentarz = komentarz;

    }

    //protected Komentarz(){};
       }

