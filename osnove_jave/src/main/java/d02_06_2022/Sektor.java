package d02_06_2022;

public class Sektor {
    private String nazivSektora;
    private double plataSektora;

    public Sektor(String nazivSektora, double plataSektora) {
        this.nazivSektora = nazivSektora;
        this.plataSektora = plataSektora;
    }

    public String getNazivSektora() {
        return nazivSektora;
    }

    public void setNazivSektora(String nazivSektora) {
        this.nazivSektora = nazivSektora;
    }

    public double getPlataSektora() {
        return plataSektora;
    }

    public void setPlataSektora(double plataSektora) {
        this.plataSektora = plataSektora;
    }
}
