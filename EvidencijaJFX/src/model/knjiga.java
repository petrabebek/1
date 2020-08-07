package model;

public class knjiga extends Table {
    @Entity(type = "INTEGER",size = 11, primary = true)
    int id;

    @Entity(type = "VARCHAR", size = 30, isnull = false)
    String naziv;

    @Entity(type = "VARCHAR", size = 30, isnull = false)
    String vrsta;

    @Entity(type = "INTEGER", size = 1, isnull = false)
    int status;

    @ForeignKey(table ="autor", attribute ="id" )
    @Entity(type = "INTEGER",size = 11)
    int id_autora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId_autora() {
        return id_autora;
    }

    public void setId_autora(int id_autora) {
        this.id_autora = id_autora;
    }
}