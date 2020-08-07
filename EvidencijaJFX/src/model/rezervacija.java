package model;


import java.util.Date;

public class rezervacija extends Table{
    @Entity(type = "INTEGER",size = 11, primary = true)
    int id;

    @Entity(type = "VARCHAR", isnull = false)
    String datum_od;

    @Entity(type = "VARCHAR", isnull = false)
    String datum_do;

    @ForeignKey(table = "korisnik", attribute = "id")
    @Entity(type = "INTEGER", size =11)
    int id_korisnika;

    @ForeignKey(table = "knjiga", attribute = "id")
    @Entity(type = "INTEGER", size =11)
    int id_knjige;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatum_od() {
        return datum_od;
    }

    public void setDatum_od(String datum_od) {
        this.datum_od = datum_od;
    }

    public String getDatum_do() {
        return datum_do;
    }

    public void setDatum_do(String datum_do) {
        this.datum_do = datum_do;
    }

    public int getId_korisnika() {
        return id_korisnika;
    }

    public void setId_korisnika(int id_korisnika) {
        this.id_korisnika = id_korisnika;
    }

    public int getId_knjige() {
        return id_knjige;
    }

    public void setId_knjige(int id_knjige) {
        this.id_knjige = id_knjige;

    }


}
