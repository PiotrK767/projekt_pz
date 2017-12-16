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
public class Sl_Kategorii {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int _id;
        private String nazwa;
        public Sl_Kategorii(String nazwa){
            this.nazwa = nazwa;
        }
    //protected Sl_Kategorii(){};
    }


