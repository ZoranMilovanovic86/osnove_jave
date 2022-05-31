package Domaci_30_05_2022_zadatak2;

public class MainKombinacijaListic {
    public static void main(String[] args) {
        Kombinacija jedan = new Kombinacija("br. 001", 1, 5,13,17,20,28,31);
        Kombinacija dva = new Kombinacija("br. 002", 3, 10,12,13,21,22,33);
        Kombinacija tri = new Kombinacija("br. 003", 7, 9,10,11,22,28,30);
        Kombinacija cetiri = new Kombinacija("br. 004", 4, 6,14,15,16,26,38);
        Kombinacija pet = new Kombinacija("br. 005", 6, 7,10,15,19,29,39);
        Kombinacija sest = new Kombinacija("br. 006", 12, 16,18,20,22,24,34);
        Kombinacija sedam = new Kombinacija("br. 007", 4, 8,12,20,24,25,27);
        Kombinacija osam = new Kombinacija("br. 008", 4, 5,13,17,20,28,31);
        Kombinacija devet = new Kombinacija("br. 009", 1, 4,15,16,30,38,39);
        Kombinacija dobitna = new Kombinacija("Dobitna", 1, 4,15,16,30,38,39);

        Listic bezDobitneKombinacije = new Listic();
        bezDobitneKombinacije.dodajKombinaciju(jedan);
        bezDobitneKombinacije.dodajKombinaciju(dva);
        bezDobitneKombinacije.dodajKombinaciju(tri);
        bezDobitneKombinacije.dodajKombinaciju(cetiri);
        bezDobitneKombinacije.dodajKombinaciju(pet);
        bezDobitneKombinacije.dodajKombinaciju(sest);
        bezDobitneKombinacije.dodajKombinaciju(sedam);
        bezDobitneKombinacije.dodajKombinaciju(osam);

        System.out.println("Dobitna kombinacija izgleda ovako: ");
        dobitna.print();
        System.out.println();

        System.out.println("Prvi listic: ");
        if (bezDobitneKombinacije.dobitna(dobitna)) {
            System.out.println("Imamo Loto dobitnika!");
            System.out.println("Dobitni Loto listic izgleda ovako:");
            System.out.println();
            bezDobitneKombinacije.print();
        } else {
            System.out.println("Vise srece u narednom izvlacenju!");
        }
        System.out.println();

        Listic saDobitnomKombinacijom = new Listic();
        saDobitnomKombinacijom.dodajKombinaciju(osam);
        saDobitnomKombinacijom.dodajKombinaciju(sedam);
        saDobitnomKombinacijom.dodajKombinaciju(sest);
        saDobitnomKombinacijom.dodajKombinaciju(tri);
        saDobitnomKombinacijom.dodajKombinaciju(dva);
        saDobitnomKombinacijom.dodajKombinaciju(devet);

        System.out.println("Drugi listic: ");
        if (saDobitnomKombinacijom.dobitna(dobitna)) {
            System.out.println("Imamo Loto dobitnika!");
            System.out.println("Dobitni Loto listic izgleda ovako:");
            System.out.println();
            saDobitnomKombinacijom.print();
        } else {
            System.out.println("Vise srece u narednom izvlacenju!");
        }






    }
}
