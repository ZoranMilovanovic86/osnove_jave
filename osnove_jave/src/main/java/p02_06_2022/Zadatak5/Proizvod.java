package p02_06_2022.Zadatak5;

import java.util.ArrayList;

public abstract class Proizvod {
    protected ArrayList<Dodatak> dodaci = new ArrayList<>();

    public void ubaciDodatak(Dodatak ime) {
        dodaci.add(ime);
    }

    public double cenaSvihDodataka() {
        double cena = 0;
        for (int i = 0; i < dodaci.size() ; i++) {
            cena += dodaci.get(i).getCenaDodatka();
        }
        return cena;
    }

    public abstract double cenaUkupna();

    public abstract void print();
}
