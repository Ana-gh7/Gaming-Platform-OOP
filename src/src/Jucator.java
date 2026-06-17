package src;

public class Jucator extends Utilizator {

    private String numeComplet;
    private double sold;
    private BibliotecaJocuri biblioteca;
    private int numarJocuriCumparate;

    public Jucator() {
        super();
        this.biblioteca = new BibliotecaJocuri();
    }

    public Jucator(int id, String username, String email, String parola,
                   String numeComplet, double sold,
                   BibliotecaJocuri biblioteca,
                   int numarJocuriCumparate) {

        super(id, username, email, parola);

        this.numeComplet = numeComplet;
        this.sold = sold;
        this.biblioteca = biblioteca;
        this.numarJocuriCumparate = numarJocuriCumparate;
    }
public Jucator(String numeComplet, double sold) {
    this.numeComplet = numeComplet;
    this.sold = sold;
    this.biblioteca = new BibliotecaJocuri();
    this.numarJocuriCumparate = 0;
}
    public String getNumeComplet() {
        return numeComplet;
    }

    public void setNumeComplet(String numeComplet) {
        this.numeComplet = numeComplet;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public BibliotecaJocuri getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(BibliotecaJocuri biblioteca) {
        this.biblioteca = biblioteca;
    }

    public int getNumarJocuriCumparate() {
        return numarJocuriCumparate;
    }

    public void setNumarJocuriCumparate(int numarJocuriCumparate) {
        this.numarJocuriCumparate = numarJocuriCumparate;
    }
    
    public void adaugaFonduri(double suma) {
        sold += suma;
}
    
    public boolean poateCumpara(double pret) {
        return sold >= pret;
}
    @Override
public void afiseazaDetalii() {
    System.out.println("Jucator: " + numeComplet);
}
}