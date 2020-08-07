package model;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class autor extends Table {
    @Entity(type = "INTEGER", size = 11, primary = true)
    int id;

    @Entity(type = "VARCHAR", size = 30, isnull = false)
    String ime;

    @Entity(type = "VARCHAR", size = 30, isnull = false)
    String prezime;

    @Entity(type = "VARCHAR", isnull = false)
    String datum_rodjenja;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDatum_rodjenja() {
        return datum_rodjenja;
    }

    public void setDatum_rodjenja(LocalDate datum_rodjenja) { this.datum_rodjenja = datum_rodjenja.toString();
    }
}
