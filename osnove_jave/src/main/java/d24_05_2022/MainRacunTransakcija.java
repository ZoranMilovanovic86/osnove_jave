package d24_05_2022;

public class MainRacunTransakcija {
    public static void main(String[] args) {
        Racun posiljalac = new Racun(20000);
        posiljalac.setBrRacuna("170-2222278544-23");
        posiljalac.setPunoImeVlasnikaRacuna("Kes Kesovic");
        System.out.println(posiljalac.getStanjeNaRacunu());


        Racun primalac = new Racun(1000);
        primalac.setBrRacuna("220-564646844-33");
        primalac.setPunoImeVlasnikaRacuna("Greb Grebovic");
        System.out.println(primalac.getStanjeNaRacunu());

        System.out.println();

        Transakcija pozajmica = new Transakcija("000001", posiljalac, primalac);
        pozajmica.print();
        pozajmica.izvrsiTransakciju(19801);
        pozajmica.print();

        System.out.println();
        posiljalac.print();
        primalac.print();

    }
}
