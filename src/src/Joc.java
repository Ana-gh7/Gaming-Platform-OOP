package src;

import java.util.ArrayList;

public abstract class Joc implements Reviewable {

    protected int id;
    protected String nume;
    protected double pret;
    protected CategorieJoc categorie;

    protected ArrayList<Recenzie> recenzii;
    protected double ratingMediu;

    public Joc() {
        recenzii = new ArrayList<>();
    }

    public Joc(int id, String nume, double pret, CategorieJoc categorie) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;

        recenzii = new ArrayList<>();
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

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public CategorieJoc getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieJoc categorie) {
        this.categorie = categorie;
    }

    public ArrayList<Recenzie> getRecenzii() {
        return recenzii;
    }

    public void setRecenzii(ArrayList<Recenzie> recenzii) {
        this.recenzii = recenzii;
    }

    public double getRatingMediu() {
        return ratingMediu;
    }

    public void setRatingMediu(double ratingMediu) {
        this.ratingMediu = ratingMediu;
    }

    @Override
    public void adaugaRecenzie(Recenzie recenzie) {
        recenzii.add(recenzie);
    }

    @Override
    public double calculeazaRatingMediu() {

        if (recenzii.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Recenzie recenzie : recenzii) {
            suma += recenzie.getRating();
        }

        ratingMediu = suma / recenzii.size();

        return ratingMediu;
    }
    public void afiseazaRecenzii() {

    if (recenzii.isEmpty()) {

        System.out.println("Nu exista recenzii.");

        return;
    }

    System.out.println(
            "Recenzii pentru jocul: "
            + nume
    );

    System.out.println(
            "Rating mediu: "
            + calculeazaRatingMediu()
    );

    for (Recenzie recenzie : recenzii) {

        System.out.println(
                "Rating: "
                + recenzie.getRating()
                + "/5 | Comentariu: "
                + recenzie.getComentariu()
        );
    }
}
    public abstract void afiseazaDetalii();
}