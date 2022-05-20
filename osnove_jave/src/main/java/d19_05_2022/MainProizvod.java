package d19_05_2022;

public class MainProizvod {
    public static void main(String[] args) {


        Proizvod secer = new Proizvod();
        secer.naziv = "Secer";
        secer.cena = 99.99;
        secer.tezina = 1000;

        Proizvod kafa = new Proizvod();
        kafa.naziv = "Kafa";
        kafa.cena = 139.99;
        kafa.tezina = 100;

        secer.stampaj();
        secer.povecajCenu(22.9);
        System.out.println("Cena posle povecanja: " + secer.cena);
        System.out.println("Cena sa popustom je: " + secer.vratiCenuSaPopustom(15) + " din");
        System.out.println("Cena postarine je: " + secer.racunajPostarinu() + " din");

        System.out.println(); // drugi proizvod pocinje odavde

        kafa.stampaj();
        kafa.povecajCenu(14.5);
        System.out.println("Cena posle povecanja: " + kafa.cena);
        System.out.println("Cena sa popustom je: " + kafa.vratiCenuSaPopustom(50) + " din");
        System.out.println("Cena postarine je: " + kafa.racunajPostarinu() + " din");


    }
}
