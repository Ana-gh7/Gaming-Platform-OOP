package src;

import java.util.ArrayList;

public class BibliotecaIterator implements JocIterator {

    private ArrayList<Joc> jocuri;
    private int pozitie = 0;
    private int numarJocuri;

    public BibliotecaIterator(ArrayList<Joc> jocuri) {
        this.jocuri = jocuri;
        this.numarJocuri = jocuri.size();
}
    public BibliotecaIterator(ArrayList<Joc> jocuri, int pozitie) {
    this.jocuri = jocuri;
    this.pozitie = pozitie;
    this.numarJocuri = jocuri.size();
}

    @Override
    public boolean hasNext() {
        return pozitie < jocuri.size();
    }

    @Override
    public Joc next() {
        return jocuri.get(pozitie++);
    }
}