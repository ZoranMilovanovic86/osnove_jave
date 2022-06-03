package p02_06_2022.Zadatak5;

public class IcePoint extends Proizvod {

    private String tipSladoleda;
    private boolean velikiIcePoint;

    public IcePoint(String tipSladoleda, boolean velikiIcePoint) {
        this.tipSladoleda = tipSladoleda;
        this.velikiIcePoint = velikiIcePoint;
    }

    @Override
    public double cenaUkupna() {
        if (velikiIcePoint) {
            return this.cenaSvihDodataka() + 130;
        }
        return this.cenaSvihDodataka() + 100;
    }

    @Override
    public void print() {
        if (velikiIcePoint) {
            System.out.println("Veliki Ice Point sa dodacima: ");
        } else {
            System.out.println("Mali Ice Point sa dodacima: ");
        }
        for (int i = 0; i < dodaci.size() ; i++) {
            this.dodaci.get(i).print();
        }
        System.out.println("Ukupna cena: " + cenaUkupna() + " rsd");
    }
}
