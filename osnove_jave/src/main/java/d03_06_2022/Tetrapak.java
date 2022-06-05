package d03_06_2022;

public class Tetrapak extends Ambalaza {
    private boolean daLiSeReciklira;
    private double osnovnaCena;

    public Tetrapak(String barkod, String imeArtikla, double netoTezina, double brutoTezina,
                    boolean daLiSeReciklira, double osnovnaCena) {
        super(barkod, imeArtikla, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(boolean daLiSeReciklira, double osnovnaCena) {
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiSeReciklira() {
        return daLiSeReciklira;
    }

    public void setDaLiSeReciklira(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.daLiSeReciklira) {
            return this.racunajTezinuPakovanja() * 1.5 + this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }
    }

    @Override
    public void print() {

        System.out.println("Barkod:" + this.getBarkod());
        System.out.println("Naziv artikla: " + this.getImeArtikla());
        System.out.println("Neto tezina: " + this.getNetoTezina());
        System.out.println("Bruto tezina: " + this.getBrutoTezina());
        System.out.println("Osnovna cena: " + this.getOsnovnaCena());
        if (this.daLiSeReciklira) {
            System.out.println("Ovo je tetrapak koji se reciklira.");
        } else {
            System.out.println("Ovo je tetrapak koji se ne reciklira.");
        }
        System.out.println("Ukupna cena je: " + this.cenaArtikla());
        System.out.println();
    }
}
