package src;

public class JocMultiplayer extends Joc {

    private int numarMaxJucatori;
    private String server;
    private boolean ranked;
    private String regiune;

    public JocMultiplayer() {
    }

    public JocMultiplayer(int id, String nume, double pret,
                      CategorieJoc categorie,
                      int numarMaxJucatori,
                      String server,
                      boolean ranked,
                      String regiune) {

        super(id, nume, pret, categorie);

        this.numarMaxJucatori = numarMaxJucatori;
        this.server = server;
        this.ranked = ranked;
        this.regiune = regiune;
    }
    public JocMultiplayer(String server,
                      int numarMaxJucatori) {
    this.server = server;
    this.numarMaxJucatori = numarMaxJucatori;
}

    public int getNumarMaxJucatori() {
        return numarMaxJucatori;
    }

    public String getServer() {
        return server;
    }

    public boolean isRanked() {
        return ranked;
    }

    public String getRegiune() {
        return regiune;
    }

    public void setNumarMaxJucatori(int numarMaxJucatori) {
        this.numarMaxJucatori = numarMaxJucatori;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setRanked(boolean ranked) {
        this.ranked = ranked;
    }

    public void setRegiune(String regiune) {
        this.regiune = regiune;
    }
    public boolean suportaMultiJucatori() {
        return numarMaxJucatori > 1;
}

    public void afiseazaServer() {
        System.out.println("Server: " + server);
}
    @Override
public void afiseazaDetalii() {

    System.out.println(
            "Multiplayer: "
                    + getNume()
                    + ", server: "
                    + server
    );
}
}