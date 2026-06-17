package src;

public abstract class Utilizator {

    protected int id;
    protected String username;
    protected String email;
    protected String parola;

    public Utilizator() {
    }

    public Utilizator(int id, String username,
                      String email, String parola) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.parola = parola;
    }

    public abstract void afiseazaDetalii();

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getParola() {
        return parola;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}