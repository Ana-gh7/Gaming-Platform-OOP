package src;

public class Recenzie {

    private int rating;
    private String comentariu;
    private Jucator jucator;
    private Joc joc;

    public Recenzie() {
    }

    public Recenzie(int rating, String comentariu,
                    Jucator jucator, Joc joc) {
        this.rating = rating;
        this.comentariu = comentariu;
        this.jucator = jucator;
        this.joc = joc;
    }
public Recenzie(int rating,
                String comentariu) {
    this.rating = rating;
    this.comentariu = comentariu;
}
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComentariu() {
        return comentariu;
    }

    public void setComentariu(String comentariu) {
        this.comentariu = comentariu;
    }

    public Jucator getJucator() {
        return jucator;
    }

    public void setJucator(Jucator jucator) {
        this.jucator = jucator;
    }

    public Joc getJoc() {
        return joc;
    }

    public void setJoc(Joc joc) {
        this.joc = joc;
    }
    public boolean estePozitiva() {
        return rating >= 4;
}

    public void afiseazaRecenzie() {
        System.out.println(comentariu);
}
}