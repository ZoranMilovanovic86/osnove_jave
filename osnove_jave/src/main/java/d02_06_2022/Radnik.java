package d02_06_2022;

import java.util.ArrayList;

public abstract class Radnik {

     protected String punoIme;
    protected ArrayList<Sektor> sektori = new ArrayList<>();

    public Radnik(String punoIme) {
        this.punoIme = punoIme;
    }
    public abstract double plataRadnika();

    public void zaposliUSektor(Sektor imeSektora) {
        sektori.add(imeSektora);
    }

}
