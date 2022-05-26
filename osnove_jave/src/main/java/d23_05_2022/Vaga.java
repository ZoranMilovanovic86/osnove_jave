package d23_05_2022;

public class Vaga {
    private String mernaJedinica;
    private Proizvod proizvod;

    public Vaga() {
    }

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }
    public double sracunajCenu(double tezina) {
        if (this.mernaJedinica.equals("kg")) {
            return tezina * this.proizvod.getCenaKg();
        }
        return tezina * this.proizvod.getCenaLb();
    }
    public void print(double tezina) {
        this.proizvod.print();
        double cena = this.sracunajCenu(tezina);
        if (this.mernaJedinica.equals("kg")) {
            System.out.println(proizvod.getCenaKg() + " din/" + this.mernaJedinica + " x " + tezina);
        } else {
            System.out.println(proizvod.getCenaLb() + " din/" + this.mernaJedinica + " x " + tezina);
        }
        System.out.println("Ukupno: " + cena + " din");



    }
}
