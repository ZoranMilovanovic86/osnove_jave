package p02_06_2022.Zadatak5;

public class Dodatak {
    private String imeDodatka;
    private double cenaDodatka;

    public Dodatak(String imeDodatka, double cenaDodatka) {
        this.imeDodatka = imeDodatka;
        this.cenaDodatka = cenaDodatka;
    }

    public String getImeDodatka() {
        return imeDodatka;
    }

    public void setImeDodatka(String imeDodatka) {
        this.imeDodatka = imeDodatka;
    }

    public double getCenaDodatka() {
        return cenaDodatka;
    }

    public void setCenaDodatka(double cenaDodatka) {
        this.cenaDodatka = cenaDodatka;
    }

    public void print() {
        System.out.println(this.imeDodatka + " " + this.cenaDodatka);
    }
}
