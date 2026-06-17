package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FisierJocuri {

    private String numeFisier;
    private String caleFisier;
    private BibliotecaJocuri biblioteca;

    public FisierJocuri() {
    }

    public FisierJocuri(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public FisierJocuri(String numeFisier,
                        String caleFisier,
                        BibliotecaJocuri biblioteca) {
        this.numeFisier = numeFisier;
        this.caleFisier = caleFisier;
        this.biblioteca = biblioteca;
    }

    public String getNumeFisier() {
        return numeFisier;
    }

    public void setNumeFisier(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public String getCaleFisier() {
        return caleFisier;
    }

    public void setCaleFisier(String caleFisier) {
        this.caleFisier = caleFisier;
    }

    public BibliotecaJocuri getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(BibliotecaJocuri biblioteca) {
        this.biblioteca = biblioteca;
    }

    public static void salveazaJocuri(BibliotecaJocuri biblioteca)
            throws IOException {

        FileWriter writer = new FileWriter("jocuri.txt");

        for (Joc joc : biblioteca.getJocuri()) {
            writer.write(joc.getNume()
                    + " - "
                    + joc.getPret()
                    + "\n");
        }

        writer.close();
    }

    public static void citesteJocuri() throws IOException {

        BufferedReader reader =
                new BufferedReader(new FileReader("jocuri.txt"));

        String linie;

        while ((linie = reader.readLine()) != null) {
            System.out.println(linie);
        }

        reader.close();
    }
}