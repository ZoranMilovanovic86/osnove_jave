package d24_05_2022;

public class Ringla {
    private String tipRingle; // obicna ili ekspres
    private int jacinaRingle;
    private double jacinaGrejaca;

    public Ringla(String tipRingle, double jacinaGrejaca) {
        this.tipRingle = tipRingle;
        this.jacinaGrejaca = jacinaGrejaca;
        this.jacinaRingle = 0;
    }

    public int getJacinaRingle() {
        return jacinaRingle;
    }

    private int maxBrPojacavanja() {
        return tipRingle.equals("obicna") ? 3 : 12;
    }

    public void pojacajRinglu() {
        if (tipRingle.equals("obicna") && jacinaRingle < 3) {
            jacinaRingle++;
        }

        if (jacinaRingle < 12 && !tipRingle.equals("obicna")) {
            jacinaRingle++;
        }
    }

    public void iskljuciRinglu() {
        jacinaRingle = 0;
    }

    public boolean daLiJeRinglaUkljucena() {
        return jacinaRingle > 0;
    }

    public double potrosnjaRingle(double brSati) {
        return 100.0 / this.maxBrPojacavanja() * this.jacinaRingle * jacinaGrejaca * brSati;
    }

    public void print() {
        if (daLiJeRinglaUkljucena()) {
            System.out.println("Ringla je ukljucena.");
        } else {
            System.out.println("Ringla je iskljucena.");
        }
        if (tipRingle.equals("obicna")) {
            System.out.println("Tip ringle: Obicna.");
        } else {
            System.out.println("Tip ringle: Ekspres.");
        }
        System.out.println("Jacina: " + this.jacinaRingle);
        System.out.println("Grejac: " + this.jacinaGrejaca + " kW");
    }
}



