package src;

public class Administrator extends Utilizator {

    private String numeComplet;
    private String departament;
    private int nivelAcces;
    private int numarJocuriAdaugate;

    public Administrator() {
    }

    public Administrator(int id, String username, String email, String parola,
                         String numeComplet, String departament,
                         int nivelAcces, int numarJocuriAdaugate) {

        super(id, username, email, parola);

        this.numeComplet = numeComplet;
        this.departament = departament;
        this.nivelAcces = nivelAcces;
        this.numarJocuriAdaugate = numarJocuriAdaugate;
    }
    
    public Administrator(String numeComplet,
                     String departament,
                     int nivelAcces) {

    this.numeComplet = numeComplet;
    this.departament = departament;
    this.nivelAcces = nivelAcces;
    this.numarJocuriAdaugate = 0;
}
    @Override
    public void afiseazaDetalii() {
        System.out.println("Administrator: " + numeComplet);
    }
    public String getNumeComplet() {
        return numeComplet;
    }

    public void setNumeComplet(String numeComplet) {
        this.numeComplet = numeComplet;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getNivelAcces() {
        return nivelAcces;
    }

    public void setNivelAcces(int nivelAcces) {
        this.nivelAcces = nivelAcces;
    }

    public int getNumarJocuriAdaugate() {
        return numarJocuriAdaugate;
    }

    public void setNumarJocuriAdaugate(int numarJocuriAdaugate) {
        this.numarJocuriAdaugate = numarJocuriAdaugate;
    }
    
    public void adaugaJoc() {
        numarJocuriAdaugate++;
}
    
    public boolean areAccesComplet() {
        return nivelAcces >= 5;
}
}