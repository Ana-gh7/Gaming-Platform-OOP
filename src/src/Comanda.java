package src;

import java.util.ArrayList;

public class Comanda {

    private int id;
    private ArrayList<Joc> jocuri;
    private double sumaTotala;
    private String status;
    private Jucator jucator;
    public Comanda() {
        jocuri = new ArrayList<>();
    }

    public Comanda(int id, ArrayList<Joc> jocuri,
                   double sumaTotala, String status) {
        this.id = id;
        this.jocuri = jocuri;
        this.sumaTotala = sumaTotala;
        this.status = status;
    }
public Comanda(int id, String status) {
    this.id = id;
    this.status = status;
    this.jocuri = new ArrayList<>();
    this.sumaTotala = 0;
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

    public double getSumaTotala() {
        return sumaTotala;
    }

    public void setSumaTotala(double sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void calculeazaSuma() {
        sumaTotala = 0;
    for (Joc joc : jocuri) {
        sumaTotala += joc.getPret();
    }
}
    public void finalizeazaComanda() {
    status = "Finalizata";
}
    public Jucator getJucator() {
    return jucator;
}

public void setJucator(Jucator jucator) {
    this.jucator = jucator;
}
}