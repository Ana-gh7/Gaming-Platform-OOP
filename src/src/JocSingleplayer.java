package src;

public class JocSingleplayer extends Joc {

    private int durataCampanie;
    private String dificultate;
    private boolean arePoveste;
    private int numarMisiuni;

    public JocSingleplayer() {
    }

    public JocSingleplayer(int id, String nume, double pret,
                           CategorieJoc categorie,
                           int durataCampanie,
                           String dificultate,
                           boolean arePoveste,
                           int numarMisiuni) {

        super(id, nume, pret, categorie);

        this.durataCampanie = durataCampanie;
        this.dificultate = dificultate;
        this.arePoveste = arePoveste;
        this.numarMisiuni = numarMisiuni;
    }
public JocSingleplayer(int durataCampanie,
                       String dificultate) {
    this.durataCampanie = durataCampanie;
    this.dificultate = dificultate;
}
    public int getDurataCampanie() {
        return durataCampanie;
    }

    public String getDificultate() {
        return dificultate;
    }

    public boolean isArePoveste() {
        return arePoveste;
    }

    public int getNumarMisiuni() {
        return numarMisiuni;
    }

    public void setDurataCampanie(int durataCampanie) {
        this.durataCampanie = durataCampanie;
    }

    public void setDificultate(String dificultate) {
        this.dificultate = dificultate;
    }

    public void setArePoveste(boolean arePoveste) {
        this.arePoveste = arePoveste;
    }

    public void setNumarMisiuni(int numarMisiuni) {
        this.numarMisiuni = numarMisiuni;
    }
    public boolean esteLung() {
        return durataCampanie > 30;
}
    @Override
public void afiseazaDetalii() {
    System.out.println(
            "Campanie: "
            + durataCampanie
            + " ore, dificultate: "
            + dificultate
    );
}
} 
