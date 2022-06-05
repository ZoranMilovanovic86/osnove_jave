package d03_06_2022;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Ambalaza> nizAmbalaza = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza a) {
        nizAmbalaza.add(a);
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = nizAmbalaza.size() - 1; i >= 0 ; i--) {
            if (nizAmbalaza.get(i).getBarkod().equals(barkod)) {
                nizAmbalaza.remove(i);
            }

        }
    }

    private double cenaSvihAmbalazaSaPopustom(int popust) {
        double cena = 0;
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            cena += nizAmbalaza.get(i).cenaArtikla();
        }
        return cena - popust;
    }

    public double cenaKorpe(SuperKartica sk) {
       return this.cenaSvihAmbalazaSaPopustom(sk.getPopust());
    }
}
