package d31_05_2022.Zadatak1;

public class Trener extends Osoba{
    private int godIskustva;
    private String tipTrenera;

    public Trener(String punoIme, String jmbg, int godRodjenja, int godIskustva, String tipTrenera) {
        super(punoIme, jmbg, godRodjenja);
        this.godIskustva = godIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void print() {
        System.out.println("Podaci o treneru:");
        System.out.println("Tip trenera je: " + this.tipTrenera +
                " / sa iskustvom od " + this.godIskustva + " godina");
        super.print();



    }

}
