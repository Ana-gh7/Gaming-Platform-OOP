package src;

import java.util.ArrayList;

public class CosCumparaturi {

    private int id;
    private ArrayList<Joc> jocuri;
    private double total;
    private int numarJocuri;
    private Jucator jucator;

    public CosCumparaturi() {
        jocuri = new ArrayList<>();
    }

    public CosCumparaturi(int id, ArrayList<Joc> jocuri,
                          double total, int numarJocuri) {
        this.id = id;
        this.jocuri = jocuri;
        this.total = total;
        this.numarJocuri = numarJocuri;
    }
public CosCumparaturi(int id) {
    this.id = id;
    this.jocuri = new ArrayList<>();
    this.total = 0;
    this.numarJocuri = 0;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Joc> getJocuri() {
        return jocuri;
    }

    public void setJocuri(ArrayList<Joc> jocuri) {
        this.jocuri = jocuri;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getNumarJocuri() {
        return numarJocuri;
    }

    public void setNumarJocuri(int numarJocuri) {
        this.numarJocuri = numarJocuri;
    }
    public boolean adaugaJoc(Joc joc) {
        for (Joc jocExistent : jocuri) {
            if (jocExistent.getNume().equalsIgnoreCase(joc.getNume())) {
                return false;
            }
        }

        jocuri.add(joc);
        total += joc.getPret();
        numarJocuri++;

        return true;
}
    public void golesteCos() {
        jocuri.clear();
        total = 0;
        numarJocuri = 0;
}
    public Jucator getJucator() {
    return jucator;
}

public void setJucator(Jucator jucator) {
    this.jucator = jucator;
}
}