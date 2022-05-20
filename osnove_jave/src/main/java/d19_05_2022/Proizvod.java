package d19_05_2022;

public class Proizvod {
    String naziv;
    double cena;
    double tezina;


    public void stampaj() {
        System.out.print("Ime proizvoda: " + this.naziv + ", " + "Cena proizvoda: ");
        System.out.println(this.cena + ", " + "Tezina proizvoda: " + this.tezina + " grama");
    }

    public void povecajCenu(double povecanje) {
        this.cena = this.cena + povecanje;
    }

    public double vratiCenuSaPopustom(int snizenje) {
        double popust = snizenje / 100.0 * this.cena;
        return this.cena - popust;
    }

    public int racunajPostarinu() {
        if (this.tezina <= 100) {
            return 200;
        } else if (this.tezina <= 500) {
            return 400;
        }
        return 1000;
    }

}