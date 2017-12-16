package com.pz.youtube.DataBase;

import org.springframework.beans.factory.annotation.Autowired;

public class test {
    @Autowired
    private KomentarzRepository komentarzTabela;
    @Autowired
    private Sl_KategoriiRepository slKategoriiTabela;
    @Autowired
    private UzytkowniRepository uzytkownikTabela;
    @Autowired
    private ZdjeciaRepository zdjecieTabela;
    @Autowired
    private ZdjeciaKategorieRepository zdjeciaKategorieTabela;
    public void loadData(){

        this.komentarzTabela.deleteAll();
        this.slKategoriiTabela.deleteAll();
        this.uzytkownikTabela.deleteAll();
        this.zdjecieTabela.deleteAll();
        this.zdjeciaKategorieTabela.deleteAll();


        this.slKategoriiTabela.save(new Sl_Kategorii("zwierzeta"));
        this.slKategoriiTabela.save(new Sl_Kategorii("wat"));

        this.uzytkownikTabela.save(new Uzytkownik("piotr", "piotr767", "bbb"));
        this.uzytkownikTabela.save(new Uzytkownik("adam", "adam778", "aaa"));

        this.zdjecieTabela.save(new Zdjecia("uczelnia","20170102","test", uzytkownikTabela.findUzytkownikByNazwaUzytkownika("adam778").get_id()));
        this.zdjecieTabela.save(new Zdjecia("uczelnia2","20170112","test2", uzytkownikTabela.findUzytkownikByNazwaUzytkownika("piotr767").get_id()));

        this.zdjeciaKategorieTabela.save(new ZdjeciaKategorie(zdjecieTabela.findZdjeciaByNazwa("uczelnia").get_id(), slKategoriiTabela.findSl_KategoriiByNazwa("wat").get_id()));
        this.zdjeciaKategorieTabela.save(new ZdjeciaKategorie(zdjecieTabela.findZdjeciaByNazwa("uczelnia2").get_id(), slKategoriiTabela.findSl_KategoriiByNazwa("wat").get_id()));

        this.komentarzTabela.save(new Komentarz(zdjecieTabela.findZdjeciaByNazwa("uczelnia").get_id(), uzytkownikTabela.findUzytkownikByNazwaUzytkownika("adam778").get_id(),"działa?"));
        this.komentarzTabela.save(new Komentarz(zdjecieTabela.findZdjeciaByNazwa("uczelnia2").get_id(), uzytkownikTabela.findUzytkownikByNazwaUzytkownika("adam778").get_id(),"działa2?"));

    }
}
