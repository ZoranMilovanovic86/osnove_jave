package d31_05_2022.Zadatak1;

public class Igrac extends Osoba{
    private int brDresa;
    private String pozicijaKojuIgra;
    private boolean daLiJeKapiten;

    public Igrac() {
    }

    public Igrac(String punoIme, String jmbg, int godRodjenja, int brDresa,
                 String pozicijaKojuIgra, boolean daLiJeKapiten) {
        super(punoIme, jmbg, godRodjenja);
        this.brDresa = brDresa;
        this.pozicijaKojuIgra = pozicijaKojuIgra;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public int getBrDresa() {
        return brDresa;
    }

    public void setBrDresa(int brDresa) {
        this.brDresa = brDresa;
    }

    public String getPozicijaKojuIgra() {
        return pozicijaKojuIgra;
    }

    public void setPozicijaKojuIgra(String pozicijaKojuIgra) {
        this.pozicijaKojuIgra = pozicijaKojuIgra;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }

    @Override
    public void print() {
        System.out.println("Podaci o igracu:");
        if (this.daLiJeKapiten) {
            System.out.println("Igrac je kapiten tima!");
        }
        System.out.println("Igrac igra na poziciji: " + this.pozicijaKojuIgra);
        super.print();

    }
}
