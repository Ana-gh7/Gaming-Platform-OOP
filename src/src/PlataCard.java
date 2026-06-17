package src;

public class PlataCard implements MetodaPlata {

    private String numarCard;
    private String titular;
    private String dataExpirare;

    public PlataCard() {
    }

    public PlataCard(String numarCard, String titular, String dataExpirare) {
        this.numarCard = numarCard;
        this.titular = titular;
        this.dataExpirare = dataExpirare;
    }
public PlataCard(String numarCard,
                 String titular) {
    this.numarCard = numarCard;
    this.titular = titular;
}
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul: " + suma);
    }

    @Override
    public String getNumeMetoda() {
        return "Card";
    }

    public boolean esteValida() {
        return true;
    }
    
    public boolean esteExpirat() {
    return false;
}

public void afiseazaTitular() {
    System.out.println("Titular: " + titular);
}

    public String getNumarCard() {
        return numarCard;
    }

    public void setNumarCard(String numarCard) {
        this.numarCard = numarCard;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
    }
}