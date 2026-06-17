package src;

public class JocFactory {
        private String tipJoc;
        private double pretImplicit;
        private CategorieJoc categorie;
    public static Joc creeazaJoc(String tip,
                                 int id,
                                 String nume,
                                 double pret,
                                 CategorieJoc categorie) {

        if (tip.equalsIgnoreCase("singleplayer")) {

            return new JocSingleplayer(
                    id,
                    nume,
                    pret,
                    categorie,
                    20,
                    "Normal",
                    true,
                    50
            );
        }

        if (tip.equalsIgnoreCase("multiplayer")) {

            return new JocMultiplayer(
                    id,
                    nume,
                    pret,
                    categorie,
                    10,
                    "EU",
                    true,
                    "Europa"
            );
        }

        return null;
    }

    public static boolean esteTipValid(String tip) {

        return tip.equalsIgnoreCase("singleplayer")
                || tip.equalsIgnoreCase("multiplayer");
    }
    public JocFactory() {
}

public JocFactory(String tipJoc) {
    this.tipJoc = tipJoc;
}

public JocFactory(String tipJoc,
                  double pretImplicit,
                  CategorieJoc categorie) {
    this.tipJoc = tipJoc;
    this.pretImplicit = pretImplicit;
    this.categorie = categorie;
}
}
