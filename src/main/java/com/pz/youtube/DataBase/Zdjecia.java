package com.pz.youtube.DataBase;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;



    @Entity
    @Setter
    @Getter
    //@Builder

    public class Zdjecia {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        private int _id;
        private String nazwa;
        private Date data;
        private String opis;
        private int _idUzytkownika;

      public Zdjecia( String nazwa, Date data, String opis, int _idUzytkownika){
          this.nazwa = nazwa;
          this.data = data;
          this.opis = opis;
          this._idUzytkownika = _idUzytkownika;
      }

    protected Zdjecia(){};

    }

