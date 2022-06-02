package d31_05_2022.Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private String brojDresa;
    private String pozicijaIgraca;
    ArrayList<Karton> nizKartona = new ArrayList<>();
    private boolean daLiJeKapiten;

    public Igrac() {
    }

    public Igrac(String punoIme, String jmbg, int godRodjenja,
                 String brojDresa, String pozicijaIgraca,
                 boolean daLiJeKapiten) {
        super(punoIme, jmbg, godRodjenja);
        this.brojDresa = brojDresa;
        this.pozicijaIgraca = pozicijaIgraca;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public String getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(String brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicijaIgraca() {
        return pozicijaIgraca;
    }

    public void setPozicijaIgraca(String pozicijaIgraca) {
        this.pozicijaIgraca = pozicijaIgraca;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public void dodajKarton(Karton karton) {
        this.nizKartona.add(karton);
    }

    public int brojZutihKartona() {
        int counter = 0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("zuti")) {
                counter++;
            }
        }
        return counter;
    }

    public int brojCrvenihKartona() {
        int counter = 0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("crveni")) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void print() {
        if (daLiJeKapiten) {
            System.out.println("Igrac je kapiten");
        } else {
            System.out.println("Igrac nije kapiten");
        }
        super.print();
        System.out.println("Br. dresa: " + this.brojDresa);
        System.out.println("Igra na poziciji: " + this.pozicijaIgraca);
        if (this.nizKartona.size() > 0) {
            System.out.print("Igrac ima sledece kartone: ");
            for (int i = 0; i < this.nizKartona.size(); i++) {
                System.out.print(this.nizKartona.get(i).getTipKartona());
                if (i < this.nizKartona.size() - 1)
                    System.out.print(", ");

            }
            System.out.println();
            if (this.brojCrvenihKartona() > 0) {
                System.out.println("Crvenih kartona: " + this.brojCrvenihKartona());
            }
            if (this.brojZutihKartona() > 0) {
                System.out.println("Zutih kartona: " + this.brojZutihKartona());
            }

        }
    }

}
