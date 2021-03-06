package d31_05_2022.Zadatak1;

public class Osoba {
    protected String punoIme;
    protected String jmbg;
    protected int godRodjenja;

    public Osoba() {
    }

    public Osoba(String punoIme, String jmbg, int godRodjenja) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void print() {
        System.out.println(this.punoIme + ", " + this.jmbg + ", " + this.godRodjenja);
        System.out.println();
    }

}
