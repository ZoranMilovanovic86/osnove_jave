package d23_05_2022;

import p19_05_2022.Auto;

public class MainAutorKnjiga {
    public static void main(String[] args) {
        Autor mika = new Autor("Mika Antic");
        Autor zika = new Autor("Zika Zikic");
        Autor jova = new Autor("Jovan Jovanovic");

        Knjiga plaviCuperak = new Knjiga("2112-157-44",
                "Plavi Cuperak", 1965, mika);
        plaviCuperak.print();

        System.out.println();

        Knjiga prvaLjubav = new Knjiga("323289-74-3021",
                "Prva Ljubav", 1977, mika);
        prvaLjubav.print();

        System.out.println();

        Knjiga uIzlogu = new Knjiga();
        uIzlogu.setIsbn("55-22-484");
        uIzlogu.setNaziv("U Izlogu");
        uIzlogu.setGodIzdanja(1989);
        uIzlogu.setAutor(zika);
        uIzlogu.print();

        System.out.println();
        Knjiga vatraIzVode = new Knjiga();
        vatraIzVode.setIsbn("888-9989-15");
        vatraIzVode.setNaziv("Vatra iz Vode");
        vatraIzVode.setGodIzdanja(2000);
        vatraIzVode.setAutor(zika);
        vatraIzVode.print();

        System.out.println();
        Knjiga zmajevaRiznica = new Knjiga("54545-455",
                "Zmajeva Riznica",
                1867, jova);
        zmajevaRiznica.print();

        System.out.println();
        Knjiga pacijaSkola = new Knjiga("54545-33231",
                "Pacija Skola",
                1900, jova);


    }
}
