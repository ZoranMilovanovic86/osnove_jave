package d02_06_2022;

public class Magacioner extends Radnik {

    public Magacioner(String punoIme) {
        super(punoIme);
    }

    private double prosecnaPlataSektora() {
        double plataSvihSektora = 0;
        for (int i = 0; i < this.sektori.size(); i++) {
            plataSvihSektora += this.sektori.get(i).getPlataSektora();
        }
        return plataSvihSektora / this.sektori.size() * 0.5;
    }

    @Override
    public double plataRadnika() {
        return prosecnaPlataSektora() * this.sektori.size();
    }
}
