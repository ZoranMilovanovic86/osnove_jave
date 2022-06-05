package d03_06_2022;

public class StaklenaAmbalaza extends Ambalaza{
    private int kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String imeArtikla, double netoTezina, double brutoTezina,
                            int kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barkod, imeArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(int kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (daLiSePlacaKaucija) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        } else {
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void print() {
        System.out.println("Barkod:" + this.getBarkod());
        System.out.println("Naziv artikla: " + this.getImeArtikla());
        System.out.println("Neto tezina: " + this.getNetoTezina());
        System.out.println("Bruto tezina: " + this.getBrutoTezina());
        System.out.println("Osnovna cena: " + this.getOsnovnaCena());
        if (this.daLiSePlacaKaucija) {
            System.out.println("Ovo je ambalaza za koju se placa kaucija u iznosu od: " + this.getKaucija());

        } else {
            System.out.println("Ovo je ambalaza za koju se ne placa kaucija.");
        }
        System.out.println("Ukupna cena je: " + this.cenaArtikla());
        System.out.println();
    }
}
