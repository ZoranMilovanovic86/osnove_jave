package p31_05_2022_Zadatak3;

public class DUOPaket extends Paket{
    private int brojMeseciPoDinar;
    private String uredjajUzPaket;

    public DUOPaket(String punoImeKorisnika, double mesecnaCena,
                    int ugovornaObaveza, String uredjajUzPaket) {
        super("EON FULL DUO", punoImeKorisnika, mesecnaCena, ugovornaObaveza, 250, 100);
        this.uredjajUzPaket = uredjajUzPaket;
    }

    public void ubrzajInternet(int brzina) {
        this.internetDL += brzina;
        this.internetUL += brzina;

    }
    @Override
    public void print() {
        super.print();
        System.out.println(" " + this.brojMeseciPoDinar() + " broj meseci za dinar");
    }
    @Override
    public int brojMeseciPoDinar() {
        return 6;
    }
}
