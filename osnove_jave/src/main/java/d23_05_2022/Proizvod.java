package d23_05_2022;

public class Proizvod {
    private String sifraProizvoda;
    private String nazivProizvoda;
    private double cenaKg;

    public Proizvod(String sifraProizvoda, String nazivProizvoda, double cenaKg) {
        this.sifraProizvoda = sifraProizvoda;
        this.nazivProizvoda = nazivProizvoda;
        this.cenaKg = cenaKg;
    }

    public String getSifraProizvoda() {
        return sifraProizvoda;
    }

    public void setSifraProizvoda(String sifraProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public void setCenaKg(double cenaKg) {
        this.cenaKg = cenaKg;
    }

    public double getCenaKg() {
        return cenaKg;
    }
    public double getCenaLb() {
        return this.cenaKg / 2.2046;
    }
    public void print() {
        System.out.println(this.sifraProizvoda + " - " + this.nazivProizvoda);
    }
}
