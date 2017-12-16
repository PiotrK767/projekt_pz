package com.pz.youtube.DataBase;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@Setter
@Getter
//@Builder

public class Uzytkownik{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _id;

    private String imie;
    private String nazwaUzytkownika;
    private String haslo;

    Uzytkownik( String imie, String nazwa_uzytkownika, String haslo){
        this.imie = imie;
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.haslo = haslo;
    }
   // protected Uzytkownik(){};



}

