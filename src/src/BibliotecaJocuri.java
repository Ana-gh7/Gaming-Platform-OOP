package src;

import java.util.ArrayList;

public class BibliotecaJocuri {

    private int id;
    private String nume;
    private ArrayList<Joc> jocuri;
    private int numarJocuri;

    // RELATIE CU O ALTA CLASA DIN PROIECT
    private Jucator proprietar;

    public BibliotecaJocuri() {
        this.jocuri = new ArrayList<>();
        this.numarJocuri = 0;
    }

    public BibliotecaJocuri(int id, String nume) {
        this.id = id;
        this.nume = nume;
        this.jocuri = new ArrayList<>();
        this.numarJocuri = 0;
    }

    public BibliotecaJocuri(int id,
                            String nume,
                            ArrayList<Joc> jocuri,
                            int numarJocuri) {
        this.id = id;
        this.nume = nume;
        this.jocuri = jocuri;
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

    public ArrayList<Joc> getJocuri() {
        return jocuri;
    }

    public void setJocuri(ArrayList<Joc> jocuri) {
        this.jocuri = jocuri;
    }

    public int getNumarJocuri() {
        return numarJocuri;
    }

    public void setNumarJocuri(int numarJocuri) {
        this.numarJocuri = numarJocuri;
    }

    public Jucator getProprietar() {
        return proprietar;
    }

    public void setProprietar(Jucator proprietar) {
        this.proprietar = proprietar;
    }

    public boolean adaugaJoc(Joc joc) {
        for (Joc jocExistent : jocuri) {
            if (jocExistent.getNume().equalsIgnoreCase(joc.getNume())) {
                return false;
            }
        }

        jocuri.add(joc);
        numarJocuri++;
        return true;
    }

    public void afiseazaJocuri() {
        for (Joc joc : jocuri) {
            System.out.println(joc.getNume());
        }
    }

    public JocIterator createIterator() {
        return new BibliotecaIterator(jocuri);
    }
}