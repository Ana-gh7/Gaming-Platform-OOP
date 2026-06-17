package src;

public class CategorieJoc {

    private int id;
    private String nume;
    private String descriere;
    private int numarJocuri;

    private Joc jocReprezentativ;
    public CategorieJoc() {
    }

    public CategorieJoc(int id, String nume, String descriere, int numarJocuri) {
        this.id = id;
        this.nume = nume;
        this.descriere = descriere;
        this.numarJocuri = numarJocuri;
    }
    
    public CategorieJoc(String nume,
                    String descriere,
                    int numarJocuri) {

    this.nume = nume;
    this.descriere = descriere;
    this.numarJocuri = numarJocuri;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getNumarJocuri() {
        return numarJocuri;
    }

    public void setNumarJocuri(int numarJocuri) {
        this.numarJocuri = numarJocuri;
    }
    public void cresteNumarJocuri() {
        numarJocuri++;
}

    public boolean esteCategoriePopulara() {
        return numarJocuri >= 10;
}

    
    public Joc getJocReprezentativ() {
    return jocReprezentativ;
}

public void setJocReprezentativ(Joc jocReprezentativ) {
    this.jocReprezentativ = jocReprezentativ;
}
}