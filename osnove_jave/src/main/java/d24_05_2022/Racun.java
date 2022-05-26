package d24_05_2022;

public class Racun {
    private String brRacuna;
    private String punoImeVlasnikaRacuna;
    private double stanjeNaRacunu;

    public Racun(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getPunoImeVlasnikaRacuna() {
        return punoImeVlasnikaRacuna;
    }

    public void setPunoImeVlasnikaRacuna(String punoImeVlasnikaRacuna) {
        this.punoImeVlasnikaRacuna = punoImeVlasnikaRacuna;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void menjaStanjeNaRacunu(double visinaTransakcija) {
        this.stanjeNaRacunu = this.stanjeNaRacunu + visinaTransakcija;

    }
    public void print() {
        System.out.println(this.punoImeVlasnikaRacuna + " - " + this.brRacuna);
        System.out.println("stanje na racunu je: " + this.stanjeNaRacunu + " rsd");
    }

}
