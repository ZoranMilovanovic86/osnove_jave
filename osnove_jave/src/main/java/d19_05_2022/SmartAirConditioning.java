package d19_05_2022;

public class SmartAirConditioning {
    String brend;
    double potrosnjaNaHladjenju;
    double potrosnjaNaGrejanju;
    int setovanaTemp;
    String mod;


    public void stampa() {
        System.out.println(this.brend + " " + this.mod + " " + this.setovanaTemp + " C"  );
    }

    public double mesecnaPotrosnjaEnergije() {
        if (this.mod.equals("greje")) {
            return 30 * 15 * this.potrosnjaNaGrejanju;
        }
        return 30 * 15 * this.potrosnjaNaHladjenju;
    }

    public double potrosnjaUNovcu() {
        if (this.mesecnaPotrosnjaEnergije() <= 350) {
            return this.mesecnaPotrosnjaEnergije() * 6;
        }
        return 350 * 6 + (this.mesecnaPotrosnjaEnergije() - 350) * 9;

    }
}
