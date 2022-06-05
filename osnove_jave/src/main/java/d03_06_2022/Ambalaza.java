package d03_06_2022;

public abstract class Ambalaza {
    protected String barkod;
    protected String imeArtikla;
    protected double netoTezina;
    protected double brutoTezina;

    public Ambalaza() {
    }

    public Ambalaza(String barkod, String imeArtikla, double netoTezina, double brutoTezina) {
        this.barkod = barkod;
        this.imeArtikla = imeArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getImeArtikla() {
        return imeArtikla;
    }

    public void setImeArtikla(String imeArtikla) {
        this.imeArtikla = imeArtikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public double racunajTezinuPakovanja() {
        return this.brutoTezina - this.netoTezina;
    }

    public abstract double cenaArtikla();

    public abstract void print();
}
