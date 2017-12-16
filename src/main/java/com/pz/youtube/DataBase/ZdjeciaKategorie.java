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

public class ZdjeciaKategorie {




        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int _id;
        private int idZdjecia;
        private int idKategorii;

        public ZdjeciaKategorie(int idZdjecia, int idKategorii){
            this.idZdjecia = idZdjecia;
            this.idKategorii = idKategorii;
        }
        protected ZdjeciaKategorie(){};
    }

