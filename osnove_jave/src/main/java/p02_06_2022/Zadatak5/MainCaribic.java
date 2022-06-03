package p02_06_2022.Zadatak5;

import java.util.ArrayList;

public class MainCaribic {
    public static void main(String[] args) {
        Dodatak jaje = new Dodatak("Jaje", 30);
        Dodatak kackavalj = new Dodatak("Kackavalj", 100);
        Dodatak masline = new Dodatak("Masline", 120);
        Dodatak kecap = new Dodatak("Kecap", 60);
        Dodatak majonez = new Dodatak("Majonez", 80);

        Dodatak plazma = new Dodatak("Plazma", 100);
        Dodatak cokolada = new Dodatak("Cokolada", 130);
        Dodatak jagoda = new Dodatak("Jagoda", 50);

        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        Pica mala = new Pica(600);
        Pica velika = new Pica(1000);

        IcePoint vanila = new IcePoint("Vanila", true);
        IcePoint pistaci = new IcePoint("Pistaci", false);
        IcePoint karamela = new IcePoint("Karamela", false);

        proizvodi.add(mala);
        proizvodi.add(velika);
        proizvodi.add(vanila);
        proizvodi.add(pistaci);
        proizvodi.add(karamela);

        mala.ubaciDodatak(jaje);
        mala.ubaciDodatak(masline);

        velika.ubaciDodatak(kecap);
        velika.ubaciDodatak(majonez);
        velika.ubaciDodatak(kackavalj);
        velika.ubaciDodatak(jaje);

        vanila.ubaciDodatak(plazma);
        vanila.ubaciDodatak(jagoda);

        pistaci.ubaciDodatak(jagoda);
        pistaci.ubaciDodatak(cokolada);
        pistaci.ubaciDodatak(plazma);

        karamela.ubaciDodatak(jagoda);

        double cenaPorudzbine = 0;
        for (int i = 0; i < proizvodi.size(); i++) {
            proizvodi.get(i).print();
            System.out.println();
            cenaPorudzbine += proizvodi.get(i).cenaUkupna();
        }
        System.out.println("Ukupna cena porudzbine: " + cenaPorudzbine + " rsd");


    }
}
