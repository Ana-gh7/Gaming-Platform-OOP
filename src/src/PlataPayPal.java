package src;

public class PlataPayPal implements MetodaPlata {

    private String email;
    private String idCont;
    private double soldDisponibil;

    public PlataPayPal() {
    }

    public PlataPayPal(String email,
                       String idCont,
                       double soldDisponibil) {
        this.email = email;
        this.idCont = idCont;
        this.soldDisponibil = soldDisponibil;
    }

    public PlataPayPal(String email) {
        this.email = email;
        this.idCont = "PP001";
        this.soldDisponibil = 0;
    }

    @Override
    public void plateste(double suma) {
        System.out.println("Plata prin PayPal: " + suma);
    }

    @Override
    public String getNumeMetoda() {
        return "PayPal";
    }

    public boolean esteContValid() {
        return email != null && !email.isEmpty();
    }

    public void afiseazaDetaliiCont() {
        System.out.println("Email: " + email
                + ", Sold: " + soldDisponibil);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCont() {
        return idCont;
    }

    public void setIdCont(String idCont) {
        this.idCont = idCont;
    }

    public double getSoldDisponibil() {
        return soldDisponibil;
    }

    public void setSoldDisponibil(double soldDisponibil) {
        this.soldDisponibil = soldDisponibil;
    }
}