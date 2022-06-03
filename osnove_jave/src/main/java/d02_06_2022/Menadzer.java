package d02_06_2022;

public class Menadzer extends Radnik {

    public Menadzer(String punoIme) {
        super(punoIme);
    }

    @Override
    public double plataRadnika() {
        double plata = 0;
        for (int i = 0; i < sektori.size() ; i++) {
            plata += sektori.get(i).getPlataSektora();
        }
        return plata;
    }
}
