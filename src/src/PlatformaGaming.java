package src;

import java.util.ArrayList;

public class PlatformaGaming {

    private String nume;
    private ArrayList<Joc> jocuri;
    private ArrayList<Utilizator> utilizatori;
    private int numarUtilizatori;

    // relatie directa cu alta clasa din proiect
    private Administrator administratorPrincipal;

    public PlatformaGaming() {
        jocuri = new ArrayList<>();
        utilizatori = new ArrayList<>();
    }

    public PlatformaGaming(String nume,
                           ArrayList<Joc> jocuri,
                           ArrayList<Utilizator> utilizatori,
                           int numarUtilizatori) {

        this.nume = nume;
        this.jocuri = jocuri;
        this.utilizatori = utilizatori;
        this.numarUtilizatori = numarUtilizatori;
    }

    public PlatformaGaming(String nume,
                           int numarUtilizatori) {
        this.nume = nume;
        this.numarUtilizatori = numarUtilizatori;
        this.jocuri = new ArrayList<>();
        this.utilizatori = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ArrayList<Joc> getJocuri() {
        return jocuri;
    }

    public void setJocuri(ArrayList<Joc> jocuri) {
        this.jocuri = jocuri;
    }

    public ArrayList<Utilizator> getUtilizatori() {
        return utilizatori;
    }

    public void setUtilizatori(ArrayList<Utilizator> utilizatori) {
        this.utilizatori = utilizatori;
    }

    public int getNumarUtilizatori() {
        return numarUtilizatori;
    }

    public void setNumarUtilizatori(int numarUtilizatori) {
        this.numarUtilizatori = numarUtilizatori;
    }

    public Administrator getAdministratorPrincipal() {
        return administratorPrincipal;
    }

    public void setAdministratorPrincipal(
            Administrator administratorPrincipal) {
        this.administratorPrincipal = administratorPrincipal;
    }

    public void cresteNumarUtilizatori() {
        numarUtilizatori++;
    }

    public boolean areMultiUtilizatori() {
        return numarUtilizatori > 100;
    }
}