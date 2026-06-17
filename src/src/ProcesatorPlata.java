package src;

public class ProcesatorPlata {

    private MetodaPlata metodaPlata;
    private String numeProcesator;
    private int numarTranzactii;
    private Comanda comanda;

    public ProcesatorPlata() {
    }

    public ProcesatorPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
        this.numeProcesator = "Procesator Standard";
        this.comanda = comanda;
        this.numarTranzactii = 0;
    }
public ProcesatorPlata(String numeProcesator,
                       MetodaPlata metodaPlata) {
    this.numeProcesator = numeProcesator;
    this.metodaPlata = metodaPlata;
    this.numarTranzactii = 0;
}
    public MetodaPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public String getNumeProcesator() {
        return numeProcesator;
    }

    public void setNumeProcesator(String numeProcesator) {
        this.numeProcesator = numeProcesator;
    }

    public int getNumarTranzactii() {
        return numarTranzactii;
    }

    public void setNumarTranzactii(int numarTranzactii) {
        this.numarTranzactii = numarTranzactii;
    }

    public void efectueazaPlata(double suma) {
        metodaPlata.plateste(suma);
        numarTranzactii++;
    }

    public boolean areTranzactii() {
        return numarTranzactii > 0;
    }
    public Comanda getComanda() {
    return comanda;
}

public void setComanda(Comanda comanda) {
    this.comanda = comanda;
}
}