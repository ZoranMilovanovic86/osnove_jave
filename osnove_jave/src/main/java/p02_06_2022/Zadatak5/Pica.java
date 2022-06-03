package p02_06_2022.Zadatak5;

public class Pica extends Proizvod {
    private double cenaPodloge;

    public Pica(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public double cenaUkupna() {
        return this.cenaSvihDodataka() + this.cenaPodloge;
    }

    @Override
    public void print() {
        System.out.println("Pica sa dodacima: ");
        for (int i = 0; i < dodaci.size(); i++) {
            this.dodaci.get(i).print();
        }
        System.out.println("Ukupna cena: " + cenaUkupna() + " rsd");

    }
}
