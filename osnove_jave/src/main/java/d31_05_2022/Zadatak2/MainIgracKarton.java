package d31_05_2022.Zadatak2;

public class MainIgracKarton {
    public static void main(String[] args) {
        Karton zuti = new Karton("zuti");
        Karton crveni = new Karton("crveni");

        Igrac zoran = new Igrac("Zoran Mil", "23131231",
                1986, "00", "centar", true);

        zoran.dodajKarton(zuti);
        zoran.dodajKarton(crveni);
        zoran.dodajKarton(zuti);
        zoran.dodajKarton(zuti);
        zoran.dodajKarton(crveni);
        zoran.dodajKarton(crveni);
        zoran.dodajKarton(crveni);
        zoran.dodajKarton(zuti);

        Igrac ana = new Igrac("Ana Muc", "837283782",
                1989, "07", "golman", false);

        ana.dodajKarton(crveni);
        ana.dodajKarton(crveni);
        ana.dodajKarton(crveni);
        ana.dodajKarton(crveni);

        Igrac vlada = new Igrac("Vlada Min", "231458789",
                1989, "99", "napadac", false);

        vlada.dodajKarton(zuti);

        zoran.print();
        System.out.println();
        System.out.println();
        ana.print();
        System.out.println();
        System.out.println();
        vlada.print();

    }
}
