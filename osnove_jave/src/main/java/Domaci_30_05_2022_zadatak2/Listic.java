package Domaci_30_05_2022_zadatak2;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> nizKombinacija = new ArrayList<>();

    public void dodajKombinaciju(Kombinacija k) {
        if (nizKombinacija.size() < 7) {
            this.nizKombinacija.add(k);
        }

    }

    public boolean dobitna(Kombinacija dobitnaK) {
        int dobitna = 0;
        for (int i = 0; i < nizKombinacija.size(); i++) {
            if (nizKombinacija.get(i).DaLiJeIstaKombinacija(dobitnaK)) {
               dobitna++;
            }

        }
        return dobitna > 0;
    }

    public void print() {
        for (int i = 0; i < nizKombinacija.size(); i++) {
            nizKombinacija.get(i).print();

        }
    }

}
