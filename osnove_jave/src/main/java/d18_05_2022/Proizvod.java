package d18_05_2022;

public class Proizvod {
    public String nazivProizvoda;
    public double cenaProizvoda;
    public double tezinaProizvoda;

    public void stampaj(String naziv, double cena, double tezina) {
        System.out.println("Naziv proizvoda: " + naziv + ", Cena: " + cena + ", Tezina: " + tezina);

    }
}
