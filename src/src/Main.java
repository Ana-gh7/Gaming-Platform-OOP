package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("~ LOGIN ~");
            System.out.println("1. Administrator");
            System.out.println("2. Jucator");
            System.out.print("Alege tipul utilizatorului: ");

            int tipUtilizator = scanner.nextInt();
            
        BibliotecaJocuri biblioteca = new BibliotecaJocuri();
        BibliotecaJocuri catalogJocuri = new BibliotecaJocuri();
        CosCumparaturi cos = new CosCumparaturi();

        Jucator jucator = new Jucator();
        jucator.setNumeComplet("Ana");
        jucator.setSold(100);

        CategorieJoc categorie =
                new CategorieJoc(1, "Actiune",
                        "Jocuri de actiune", 0);

        Joc jocCreat = null;

        int optiune;

        do {
if (tipUtilizator == 1) {
            System.out.println("\n~ MENIU ~");
            System.out.println("2. Creeaza joc Singleplayer");
            System.out.println("3. Creeaza joc Multiplayer");
            System.out.println("7. Afiseaza biblioteca");
            System.out.println("8. Rating joc");
            System.out.println("9. Salveaza biblioteca in fisier");
            System.out.println("10. Citeste jocurile din fisier");
            System.out.println("11. Schimba utilizatorul");
            System.out.println("12. Afiseaza toate recenziile");
            System.out.println("0. Iesire");
}
else {

            System.out.println("\n~ MENIU ~");
            System.out.println("1. Adauga fonduri");
            System.out.println("2. Creeaza joc Singleplayer");
            System.out.println("3. Creeaza joc Multiplayer");
            System.out.println("4. Adauga joc in cos");
            System.out.println("5. Afiseaza cosul");
            System.out.println("6. Efectueaza plata");
            System.out.println("7. Afiseaza biblioteca");
            System.out.println("8. Rating joc");
            System.out.println("9. Salveaza biblioteca in fisier");
            System.out.println("10. Citeste jocurile din fisier");
            System.out.println("11. Schimba utilizatorul");
            System.out.println("12. Afiseaza toate recenziile");
            System.out.println("0. Iesire");

}
            System.out.print("Alege optiunea: ");
            optiune = scanner.nextInt();

            switch (optiune) {

                case 1:
                    try {
                        if (tipUtilizator != 2) {
                            System.out.println(
                                    "Comanda disponibila doar pentru jucatori!"
                            );
                            break;
                        }
                        if (jucator == null) {

                            throw new UtilizatorInexistentException(
                                    "Utilizatorul nu exista!"
                            );
                        }

                        System.out.print("Introdu suma: ");
                        double suma = scanner.nextDouble();

                        jucator.adaugaFonduri(suma);

                        System.out.println(
                                "Sold curent: "
                                        + jucator.getSold()
                        );

                    } catch (UtilizatorInexistentException e) {

                        System.out.println(
                                e.getMessage()
                        );
                    }

                    break;

                case 2:
                    if (tipUtilizator != 1) {
                        System.out.println(
                                "Doar administratorul poate crea jocuri!"
                        );
                        break;
                    }
                    scanner.nextLine();

                    System.out.print("Nume joc: ");
                    String numeSingle = scanner.nextLine();

                    System.out.print("Pret: ");
                    double pretSingle = scanner.nextDouble();

                    jocCreat = JocFactory.creeazaJoc(
                                "singleplayer",
                                1,
                                numeSingle,
                                pretSingle,
                                categorie
                        );

                        if (catalogJocuri.adaugaJoc(jocCreat)) {
                            System.out.println(
                                    "Joc Singleplayer creat: "
                                    + jocCreat.getNume());
                        } else {
                            System.out.println(
                                    "Jocul exista deja in catalog!");
                        }

                    break;

                case 3:
                    if (tipUtilizator != 1) {
                            System.out.println(
                                    "Doar administratorul poate crea jocuri!"
                            );
                            break;
                        }
                    scanner.nextLine();

                    System.out.print("Nume joc: ");
                    String numeMulti = scanner.nextLine();

                    System.out.print("Pret: ");
                    double pretMulti = scanner.nextDouble();

                    jocCreat = JocFactory.creeazaJoc(
                                "multiplayer",
                                2,
                                numeMulti,
                                pretMulti,
                                categorie
                        );
                        if (catalogJocuri.adaugaJoc(jocCreat)) {
                            System.out.println(
                                    "Joc Multiplayer creat: "
                                    + jocCreat.getNume());
                        } else {
                            System.out.println(
                                    "Jocul exista deja in catalog!");
                        }

                    break;

                case 4:
                    if (tipUtilizator != 2) {
                        System.out.println(
                                "Comanda disponibila doar pentru jucatori!"
                        );
                        break;
                    }
                    if (catalogJocuri.getJocuri().isEmpty()) {
                        System.out.println(
                                "Nu exista jocuri disponibile!"
                        );
                        break;
                    }
                    System.out.println("Alege jocul:");
                    for (int i = 0; i < catalogJocuri.getJocuri().size(); i++) {
                        System.out.println(
                                (i + 1)
                                + ". "
                                + catalogJocuri.getJocuri().get(i).getNume()
                                + " - "
                                + catalogJocuri.getJocuri().get(i).getPret()
                                + " lei"
                        );
}
                    int alegereJoc = scanner.nextInt();
                        Joc jocSelectat =
                                catalogJocuri.getJocuri()
                                             .get(alegereJoc - 1);
                    if (jocCreat != null) {
                        if (cos.adaugaJoc(jocSelectat)) {
                            System.out.println(
                                    jocSelectat.getNume()
                                    + " a fost adaugat in cos."
                            );
                        } else {
                            System.out.println(
                                    "Jocul exista deja in cos!"
                            );
                        }
                    } else {
                        System.out.println(
                                "Nu exista niciun joc creat."
                        );
                    }

                    break;

                case 5:
                    if (tipUtilizator != 2) {
                        System.out.println(
                                "Comanda disponibila doar pentru jucatori!"
                        );
                        break;
                    }
                    System.out.println("Jocuri in cos:");

                    for (Joc joc : cos.getJocuri()) {

                        System.out.println(
                                joc.getNume()
                                        + " - "
                                        + joc.getPret()
                                        + " lei"
                        );
                    }

                    System.out.println(
                            "Total: "
                                    + cos.getTotal()
                                    + " lei"
                    );

                    break;

                case 6:
                    if (tipUtilizator != 2) {
                        System.out.println(
                                "Comanda disponibila doar pentru jucatori!"
                        );
                        break;
                    }
                    try {

                        if (!jucator.poateCumpara(
                                cos.getTotal())) {

                            throw new FonduriInsuficienteException(
                                    "Fonduri insuficiente!"
                            );
                        }

                        System.out.println("1. Card");
                        System.out.println("2. PayPal");

                        int metoda = scanner.nextInt();

                        ProcesatorPlata procesator;

                        if (metoda == 1) {

                            procesator =
                                    new ProcesatorPlata(
                                            new PlataCard());

                        } else {

                            procesator =
                                    new ProcesatorPlata(
                                            new PlataPayPal());
                        }

                        procesator.efectueazaPlata(
                                cos.getTotal());

                        jucator.setSold(
                                jucator.getSold()
                                        - cos.getTotal()
                        );

                        for (Joc joc : cos.getJocuri()) {

                            biblioteca.adaugaJoc(joc);
                        }

                        cos.golesteCos();

                        System.out.println(
                                "Plata efectuata cu succes!"
                        );

                        System.out.println(
                                "Sold ramas: "
                                        + jucator.getSold()
                        );

                    } catch (FonduriInsuficienteException e) {

                        System.out.println(
                                e.getMessage()
                        );
                    }

                    break;

                case 7:

                    JocIterator iterator =
                            biblioteca.createIterator();

                    System.out.println(
                            "Jocuri in biblioteca:"
                    );

                    while (iterator.hasNext()) {

                        Joc joc = iterator.next();

                        System.out.println(
                                joc.getNume()
                                        + " - "
                                        + joc.getPret()
                                        + " lei"
                        );
                    }

                    break;

                case 8:
                    if (tipUtilizator != 2) {

                        System.out.println(
                                "Comanda disponibila doar pentru jucatori!"
                        );

                        break;
                    }

                    if (biblioteca.getJocuri().isEmpty()) {

                        System.out.println(
                                "Nu ai jocuri in biblioteca!"
                        );

                        break;
                    }

                    System.out.println("Alege jocul:");

                    for (int i = 0; i < biblioteca.getJocuri().size(); i++) {

                        System.out.println(
                                (i + 1) + ". "
                                + biblioteca.getJocuri().get(i).getNume()
                        );
                    }

                    int indexJoc = scanner.nextInt();
                        scanner.nextLine();

                        Joc jocPentruReview =
                                biblioteca.getJocuri()
                                          .get(indexJoc - 1);
                    try {

                        System.out.print("Introdu rating (1-5): ");
                        int rating = scanner.nextInt();

                        scanner.nextLine();

                        if (rating < 1 || rating > 5) {

                            throw new RecenzieInvalidaException(
                                    "Ratingul trebuie sa fie intre 1 si 5!"
                            );
                        }

                        System.out.print("Introdu comentariu: ");
                        String comentariu = scanner.nextLine();

                        Recenzie recenzie =
                                new Recenzie(
                                        rating,
                                        comentariu,
                                        jucator,
                                        jocPentruReview
                                );

                        jocPentruReview.adaugaRecenzie(recenzie);

                        System.out.println(
                                "Rating mediu: "
                                + jocPentruReview.calculeazaRatingMediu()
                        );

                    } catch (RecenzieInvalidaException e) {

                        System.out.println(
                                e.getMessage()
                        );
                    }

                    break;
                    
                case 9:

                    try {

                        FisierJocuri.salveazaJocuri(biblioteca);
                        FisierJocuri.salveazaJocuri(catalogJocuri);

                        System.out.println(
                                "Date salvate in jocuri.txt"
                        );

                    } catch (Exception e) {

                        System.out.println(
                                e.getMessage()
                        );
                    }

                    break;
                    
                    case 10:
                    try {

                        FisierJocuri.citesteJocuri();

                    } catch (Exception e) {

                        System.out.println(
                                e.getMessage()
                        );
                    }

                    break;
                    
                    case 11:

                        System.out.println("~ LOGIN ~");
                        System.out.println("1. Administrator");
                        System.out.println("2. Jucator");
                        System.out.print("Alege tipul utilizatorului: ");

                        tipUtilizator = scanner.nextInt();

                        break;
                        
                    case 12:
                        if (biblioteca.getJocuri().isEmpty()) {

                            System.out.println(
                                    "Nu exista jocuri in biblioteca!"
                            );

                            break;
                        }

                        System.out.println("Alege jocul:");

                        for (int i = 0; i < biblioteca.getJocuri().size(); i++) {

                            System.out.println(
                                    (i + 1) + ". "
                                    + biblioteca.getJocuri().get(i).getNume()
                            );
                        }

                        int alegereRecenzie = scanner.nextInt();

                        Joc jocRecenzie =
                                biblioteca.getJocuri()
                                          .get(alegereRecenzie - 1);

                        jocRecenzie.afiseazaRecenzii();

                        break;
                    
                    case 0:
                        System.out.println(
                                "La revedere!"
                        );

                        break;
                
                default:

                    System.out.println(
                            "Optiune invalida!"
                    );
            }

        } while (optiune != 0);

        scanner.close();
    }
}