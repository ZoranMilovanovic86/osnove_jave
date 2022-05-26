package d24_05_2022;

public class Transakcija {
    private String idTransakcije;
    private Racun posiljilac;
    private Racun primalac;

    public Transakcija() {
    }

    public Transakcija(String idTransakcije, Racun posiljilac, Racun primalac) {
        this.idTransakcije = idTransakcije;
        this.posiljilac = posiljilac;
        this.primalac = primalac;
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getPosiljilac() {
        return posiljilac;
    }

    public void setPosiljilac(Racun posiljilac) {
        this.posiljilac = posiljilac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    private double provizijaIzvrseneTransakcije(int visinaTransakcije) {
        return visinaTransakcije <= 4500 ? 45 : (double) visinaTransakcije / 100;
    }

    public void izvrsiTransakciju(int visinaTransakcije) {
        if (this.posiljilac.getStanjeNaRacunu() >= visinaTransakcije
                + this.provizijaIzvrseneTransakcije(visinaTransakcije)) {
            this.posiljilac.menjaStanjeNaRacunu(-visinaTransakcije
                    - this.provizijaIzvrseneTransakcije(visinaTransakcije));
                 this.primalac.menjaStanjeNaRacunu(visinaTransakcije);
        } else {
            System.out.println("Nemate dovoljno sredstava za ovu transakciju.");
        }
    }
    public void print() {
        System.out.println(this.idTransakcije);
        System.out.println("Racun posiljioca: " + this.posiljilac.getPunoImeVlasnikaRacuna() + " - "
                + this.posiljilac.getBrRacuna());
        System.out.println("Racun primaoca: " + this.primalac.getPunoImeVlasnikaRacuna() + " - " +
                this.primalac.getBrRacuna());
    }
}
