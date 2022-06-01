package p31_05_2022_Zadatak3;

public class EONPaket extends Paket{

    public EONPaket(String punoImeKorisnika,
                    double mesecnaCena, int ugovornaObaveza) {
        super("EON LIGHT DUO", punoImeKorisnika, mesecnaCena,
                ugovornaObaveza, 150, 75);

    }

    @Override
    public void print() {
        super.print();
        System.out.println(" " + this.brojMeseciPoDinar() + " meseci po dinar");
    }

    @Override
    public int brojMeseciPoDinar() {
        return 3;
    }
}
